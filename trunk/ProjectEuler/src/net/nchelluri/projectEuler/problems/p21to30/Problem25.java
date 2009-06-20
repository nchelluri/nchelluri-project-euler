package net.nchelluri.projectEuler.problems.p21to30;

import net.nchelluri.projectEuler.BigInt;

public class Problem25 {
	private static long counter = 2;
	private static BigInt fnMinusOne = BigInt.from(1);
	private static BigInt fnMinusTwo = BigInt.from(1);

	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		String digits = "";
		while (digits.length() < 1000) {
			digits = fn().toString();
		}

		System.out.println(counter);

		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time));
	}

	private static BigInt fn() {
		BigInt fn = fnMinusOne.plus(fnMinusTwo);
		fnMinusTwo = fnMinusOne;
		fnMinusOne = fn;
		counter++;
		return fn;
	}
}
