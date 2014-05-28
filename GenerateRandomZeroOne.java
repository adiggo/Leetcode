import java.util.*;

public class GenerateRandomZeroOne {

	public static ArrayList<String> generate(String s) {
		ArrayList<String> result = new ArrayList<String>();
		if (s == null || s.length() == 0) {
			return result;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		char[] c = s.toCharArray();
		// set record where "?" happens
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '?') {
				set.add(i);
			}
		}

		dfs(c, result, set, 0);
		// System.out.println(output.toString());
		return result;
	}

	private static void dfs(char[] c, ArrayList<String> result,
			HashSet<Integer> set, int step) {
		// edge condition

		// some problem here
		if (step == c.length) {
			String output = new String(c);
			System.out.println(output);
			result.add(output);
			return;
		}

		if (set.contains(step)) { // 换成 c[step] == '?'
			c[step] = '0';
			dfs(c, result, set, step + 1);
			System.out.println(step);
			c[step] = '1';
			dfs(c, result, set, step + 1);
		} else {
			dfs(c, result, set, step + 1);
		}

	}

	public static void main(String[] args) {
		ArrayList<String> output = new ArrayList<String>();
		output = generate("??");
		int index = 4;
		if (index < output.size())
			System.out.printf(output.get(index));
		else
			System.out.printf("index out of bound");
	}
}
