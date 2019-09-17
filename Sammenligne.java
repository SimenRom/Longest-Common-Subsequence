package pakkeA;

public class Sammenligne {

	public static void main(String[] args) {
		String fyrste = "babbababerreeeere";
		String andre = "bbabberaaarreeeeb";
		System.out.println("String A:" + fyrste +", string B: " + andre);
		long total = 0;
		for (int t = 0; t < 50; t++) {
			long millisBefore = System.currentTimeMillis();
			LongestCommonSubsequenceRecursive.lcs(fyrste, andre);
//			System.out.println("LCS på " + fyrste + " og " + andre + ", er: " + lcs(fyrste, andre));
			long millisAfter = System.currentTimeMillis();
			total += (millisAfter - millisBefore);
//			System.out.println("Antall millisekund det tok: " + (millisAfter - millisBefore));
		}
		System.out.println("Totaltid og gjennomsnitt på rekursiv 50 ganger: " + total + "ms totalt, " + (total / 50.00) + "ms gj.snitt.");
		total = 0;
		for (int t = 0; t < 50; t++) {
			long millisBefore = System.currentTimeMillis();
			LongestCommonSubsequenceDynamic.lcs(fyrste, andre);
//			System.out.println("LCS på " + fyrste + " og " + andre + ", er: " + lcs(fyrste, andre));
			long millisAfter = System.currentTimeMillis();
			total += (millisAfter - millisBefore);
//			System.out.println("Antall millisekund det tok: " + (millisAfter - millisBefore));
		}
		System.out.println("Totaltid og gjennomsnitt på dynamisk 50 ganger: " + total + "ms totalt, " + (total / 50.00) + "ms gj.snitt.");

	}

}
