package net.nchelluri.projectEuler;
import java.util.ArrayList;

public class PrimeGenerator {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		generatePrimes(100000);

		System.out.println("\nExecution time: "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}

	public static ArrayList<Long> generatePrimes(int num) {
		ArrayList<Long> primes = new ArrayList<Long>();

		seedInitialPrimes(primes);
		Long testing = 17L;
		while (primes.size() < num) {
			while (obviouslyComposite(testing)) {
				testing++;
			}

			long maxToTest = (long) Math.ceil(Math.sqrt(testing));
			int index = 3;
			long lastTested = primes.get(3);
			while (maxToTest >= lastTested) {
				if (testing % lastTested == 0) {
					break;
				}
				lastTested = primes.get(index++);
			}

			if (lastTested > maxToTest) {
				seedPrime(primes, testing);
			}

			testing++;
		}

		return primes;
	}

	private static boolean obviouslyComposite(Long testing) {
		return testing % 2 == 0 || testing % 3 == 0 || testing % 5 == 0;
	}

	private static void seedInitialPrimes(ArrayList<Long> primes) {
		seedPrime(primes, 2L);
		seedPrime(primes, 3L);
		seedPrime(primes, 5L);
		seedPrime(primes, 7L);
		seedPrime(primes, 11L);
		seedPrime(primes, 13L);
	}

	private static void seedPrime(ArrayList<Long> primes, Long i) {
		primes.add(i);
	}
}
