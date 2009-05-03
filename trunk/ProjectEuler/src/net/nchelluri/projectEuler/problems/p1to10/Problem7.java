package net.nchelluri.projectEuler.problems.p1to10;
import java.util.ArrayList;

public class Problem7 {
	public static void main(String args[]) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);

		int testing = 14;
		while (primes.size() < 10001) {
			boolean isPrime = true;
			for (int i = 0; i < primes.size(); i++) {
				if (testing % primes.get(i) == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primes.add(testing);
			}
			testing++;
		}
		
		System.out.println(primes.get(10000));
	}
}
