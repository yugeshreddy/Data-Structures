class Solution {
	//sorted
	static int isPresent(int arr[], int n, int sum) {
		int l = 0, h = n - 1;

		while (l <= h) {
			if (arr[l] + arr[h] == sum)
				return 1;
			else if (arr[l] + arr[h] > sum)
				h--;
			else
				l++;
		}

		return 0;
	}
	//unsorted
	static void printpairs(int arr[], int sum) 
	{ 
		HashSet<Integer> s = new HashSet<Integer>(); 
		for (int i = 0; i < arr.length; ++i) { 
			int temp = sum - arr[i]; 

			// checking for condition 
			if (s.contains(temp)) { 
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
			} 
			s.add(arr[i]); 
		} 
	} 

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 7, 8, 11 };
		int n = arr.length;
		int sum = 14;

		System.out.println(isPresent(arr, n, sum));

	}
}