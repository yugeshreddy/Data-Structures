class GFG {

	static int findMajority(int arr[], int n) {
		int res = 0, count = 1;

		for (int i = 1; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;

			if (count == 0) {
				res = i;
				count = 1;
			}
		}

		count = 0;

		for (int i = 0; i < n; i++)
			if (arr[res] == arr[i])
				count++;

		if (count <= n / 2)
			res = -1;

		return res;
	}
	// Hashing

	private static void findMajority(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if (count > arr.length / 2) {
					System.out.println("Majority found :- " + arr[i]);
					return;
				} else
					map.put(arr[i], count);

			} else
				map.put(arr[i], 1);
		}
		System.out.println(" No Majority element");
	}

	public static void main(String args[]) {
		int arr[] = { 8, 8, 6, 6, 6, 4, 6 }, n = 7;

		System.out.println(findMajority(arr, n));

	}

}