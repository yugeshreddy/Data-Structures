class countSetBits {
	static int countSetBits(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 2 != 0)
				count++;
			n = n / 2;
		}
		return count;
	}

	// second Approach
	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String args[]) {
		int i = 9;
		System.out.println(countSetBits(i));
	}
}