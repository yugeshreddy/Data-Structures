/*Input:
n = 2
Output: 
2
Explanation: 
2's binary form doesn't contain any 3 consecutive set bits. 
So, 2 itself would be answer.*/

/*n = 7
Output: 
6
Explanation: 
7's binary form is .....00111.We can observe that 3 consecutive bits
are set bits. This is not allowed. So, we can perfrom the operation 
of changing set bit to unset on leftmost set bit. Now, the number becomes
6 that is .....00110. It satifies the given condition. Hence, the maximum
possible value is 6.*/

class test1 {
	public static int noConsecBits(int query) {
		int countones = 0;
		for (int i = 31; i >= 0; i--) {
			if ((query & (1 << i)) > 0) {
				countones++;
				if (countones == 3) {
					query ^= 1 << i;
					countones = 0;
				}
			} else {
				countones = 0;
			}
		}
		return query;
	}

}