package net.nchelluri.projectEuler.problems.p11to20;
import java.math.BigInteger;

public class Problem16 {
	public static void main(String args[]) {
		String digits = new BigInteger("2").pow(1000).toString();

		int sum = 0;
		for(int i = 0; i < digits.length(); i++) {
			sum += Integer.parseInt("" + digits.charAt(i));
		}
		
		System.out.println(sum);
	}
}
