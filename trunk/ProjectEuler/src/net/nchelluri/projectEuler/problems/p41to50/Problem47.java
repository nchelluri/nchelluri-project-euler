package net.nchelluri.projectEuler.problems.p41to50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.nchelluri.projectEuler.PrimeGenerator;

public class Problem47 {
	private static ArrayList<Long> primes;

	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		primes = PrimeGenerator.generatePrimes(6678);
		time = System.currentTimeMillis();
		for (int i = 1;; i++) {
			if (primeFactorCount(i) == 4 && primeFactorCount(i + 1) == 4
					&& primeFactorCount(i + 2) == 4
					&& primeFactorCount(i + 3) == 4) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time) + "ms");
		System.out.println("maxI = " + maxI);
	}

	private static Map<Long, Integer> knownPrimeFactorCounts = new HashMap<Long, Integer>();
	private static long maxI = 0;

	private static int primeFactorCount(long number) {
		Integer cached = knownPrimeFactorCounts.get(number);
		if (cached != null) {
			return cached;
		}

		Set<Long> factors = new HashSet<Long>();
		if (number % 2 == 0) {
			factors.add(2L);
		}
		if (number % 3 == 0) {
			factors.add(3L);
		}
		if (number % 5 == 0) {
			factors.add(5L);
		}

		long max = (number / 2) + 1;
		for (int i = 3; primes.get(i) <= max; i++) {
			Long prime = primes.get(i);
			if (number % prime == 0) {
				factors.add(prime);
				long otherFactor = number / prime;
				if (otherFactor < max) {
					max = otherFactor;
				}
			}
			if (i + 1 > maxI) {
				maxI = i + 1;
			}
		}
		if (factors.size() == 0) {
			factors.add(number);
		}

		knownPrimeFactorCounts.put(number, factors.size());
		return factors.size();
	}
}
