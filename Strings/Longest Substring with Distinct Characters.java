class GFG {

	static int longestDistinct(String str) {
		int n = str.length();
		int res = 0;
		for (int i = 0; i < n; i++) {
			boolean visited[] = new boolean[256];
			for (int j = i; j < n; j++) {
				if (visited[str.charAt(j)] == true) {
					break;
				} else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String str = "geeksforgeeks";
		int len = longestDistinct(str);
		System.out.print("The length of the longest distinct characters substring is " + len);
	}
}