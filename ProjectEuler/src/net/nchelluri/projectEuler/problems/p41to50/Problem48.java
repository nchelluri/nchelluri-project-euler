package net.nchelluri.projectEuler.problems.p41to50;
import java.math.BigInteger;

public class Problem48 {
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(new BigInteger("" + i).pow(i));
		}

		String sumString = sum.toString();
		System.out.println(sumString.substring(sumString.length() - 10));
	}
}
