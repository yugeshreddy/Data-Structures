import java.util.LinkedHashMap;
import java.util.Map;

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

	// Second Solution
	private static void longestDistinct(String str) {
		String longestsubstring = null;
		int longestlen = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		char arr[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);

			} else {
				map.clear();
			}
			if (map.size() > longestlen) {
				longestlen = map.size();
				longestsubstring = map.keySet().toString();
			}
		}
		System.out.println("longestlen" + longestlen);
		System.out.println("longestsubstring" + longestsubstring);

	}

	public static void main(String args[]) {
		String str = "geeksforgeeks";
		int len = longestDistinct(str);
		System.out.print("The length of the longest distinct characters substring is " + len);
	}
}