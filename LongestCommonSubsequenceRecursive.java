package pakkeA;

public class LongestCommonSubsequenceRecursive {


	public static int lcs(String stringA, String stringB) {
		int i = stringA.length();
		int ii = stringB.length();
		if (i == 0 || ii == 0) {
			return 0;
		}
//		System.out.println(stringA + ", " + stringB);
		if (stringA.charAt(i - 1) == stringB.charAt(ii - 1)) {
//			System.out.println("lik på pos " + i + ", " + ii);
			return 1 + lcs(stringA.substring(0, i - 1), stringB.substring(0, ii - 1));
		} else {
//			System.out.println("Ulik på pos " + i + ", " + ii);
			return Math.max(lcs(stringA.substring(0, i - 1), stringB.substring(0, ii)),
					lcs(stringA.substring(0, i), stringB.substring(0, ii - 1)));
		}
	}
}
