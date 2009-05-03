package net.nchelluri.projectEuler.problems.p1to10;

import java.util.ArrayList;

import net.nchelluri.projectEuler.PrimeGenerator;

public class Problem10 {
	public static void main(String[] args) {
		ArrayList<Long> primes = PrimeGenerator.generatePrimes(200000);

		long sum = 0L;
		for (Long prime : primes) {
			if (prime >= 2000000) {
				System.out.println(sum);
				break;
			}
			sum += prime;
		}
	}
}
