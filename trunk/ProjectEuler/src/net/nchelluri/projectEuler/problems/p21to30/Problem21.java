package net.nchelluri.projectEuler.problems.p21to30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.nchelluri.projectEuler.PrimeGenerator;

public class Problem21 {
	private static final ArrayList<Long> primes = PrimeGenerator
			.generatePrimes(1250);
	private static final Map<Long, Boolean> isPrime = new HashMap<Long, Boolean>();

	static {
		for (Long prime : primes) {
			isPrime.put(prime, true);
		}
	}

	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		long[] d = new long[10000];

		for (int i = 1; i < 10000; i++) {
			d[i] = sumOfProperDivisorsOf(i);
		}

		int sumOfAmicables = 0;
		for (int i = 1; i < 10000; i++) {
			long di = d[i];
			if (di < 10000) {
				if (d[(int) di] == i && di != i) {
					sumOfAmicables += i;
				}
			}
		}
		System.out.println(sumOfAmicables);

		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time));
	}

	private static long sumOfProperDivisorsOf(int i) {
		long sum = 1;

		if (isPrime(i)) {
			return sum;
		}

		int max = (int) Math.ceil(Math.sqrt(i));

		for (int j = 2; j <= max; j++) {
			if (i % j == 0) {
				sum += j;
				int divisor = i / j;
				if (divisor != j) {
					sum += divisor;
				}
			}
		}

		return sum;
	}

	private static boolean isPrime(int i) {
		Boolean troof = isPrime.get((long) i);
		return troof != null && troof;
	}
}
