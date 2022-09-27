//if two consecutive balls have the same color remove from an array.
/*Input:
N = 3
color[] = {2, 2, 5}
radius[] = {3, 3, 4}
Output: 
1
Explanation: 
First ball and second ball have same color 2 and same radius 3.So,after removing only one ball is left.It could not be removed from the array.Hence, the final array has length 1.
*/

/*Input:
N = 4 
color[] = {1, 3, 3, 1}
radius[] = {2, 5, 5, 2}
Output: 
0
*/
class test1 {
	public static int findLength(int N, int[] color, int[] radius) {
		Stack<Pair> s = new Stack<>();
		for (int i = 0; i < N; i++) {
			Boolean matched = false;
			Pair p = new Pair(color[i], radius[i]);
			if (!s.isEmpty() && s.peek().x == p.x && s.peek().y == p.y) {
				s.pop();
				matched = true;
			}
			if (!matched) {
				s.push(p);
			}
		}
		return s.size();
	}

}

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}