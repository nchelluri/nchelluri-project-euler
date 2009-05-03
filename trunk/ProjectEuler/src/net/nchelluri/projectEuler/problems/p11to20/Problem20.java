package net.nchelluri.projectEuler.problems.p11to20;
import java.math.BigInteger;

public class Problem20 {
	public static void main(String args[]) {
		BigInteger x = new BigInteger("100");

		for (int i = 99; i > 0; i--) {
			x = x.multiply(new BigInteger("" + i));
		}

		String digits = x.toString();

		int sum = 0;
		for(int i = 0; i < digits.length(); i++) {
			sum += Integer.parseInt("" + digits.charAt(i));
		}
		
		System.out.println(sum);
	}
}
