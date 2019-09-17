package pakkeA;

public class LongestCommonSubsequenceDynamic {
	public static int lcs(String stringA, String stringB) {
		int indeksA = stringA.length() - 1;
		int indeksB = stringB.length() - 1;
		int[][] L = new int[indeksA + 2][indeksB + 2];
//		skrivUt(L, stringA, stringB);

		for (int i = 1; i < indeksB + 2; i++) {
			for (int ii = 1; ii < indeksA + 2; ii++) {
				if (stringA.charAt(ii - 1) == stringB.charAt(i - 1)) {
					L[ii][i] = L[ii - 1][i - 1] + 1;
				} else {
					L[ii][i] = Math.max(L[ii - 1][i], L[ii][i - 1]);
				}
//				skrivUt(L, stringA, stringB);
			}
		}
		return L[indeksA + 1][indeksB + 1];
	}

	public static void skrivUt(int[][] tab, String A, String B) {
		for (int[] a : tab) {
			System.out.print("");
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------");
	}
}
