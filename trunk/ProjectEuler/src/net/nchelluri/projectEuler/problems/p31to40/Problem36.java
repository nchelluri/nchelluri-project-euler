package net.nchelluri.projectEuler.problems.p31to40;
import net.nchelluri.projectEuler.BigInt;
import net.nchelluri.projectEuler.PalindromeChecker;

public class Problem36 {
	public static void main(String[] args) {
		BigInt sum = BigInt.from(0L);
		for (int i = 0; i < 1000000; i++) {
			if (isDecimalPalindrome(i) && isBinaryPalindrome(i)) {
				sum = sum.plus(String.valueOf(i));
			}
		}

		System.out.println(sum);
	}

	private static boolean isBinaryPalindrome(Integer i) {
		return PalindromeChecker.test(Integer.toBinaryString(i));
	}

	private static boolean isDecimalPalindrome(Integer i) {
		return PalindromeChecker.test(i.toString());
	}
}
