package demo;

class test1 {

	static int repeat(int arr[], int n) {
		boolean visit[] = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visit[arr[i]])
				return arr[i];
			visit[arr[i]] = true;
		}

		return -1;
	}

	public static void main(String args[]) {

		int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;

		System.out.println(repeat(arr, n));

	}

}