package net.nchelluri.projectEuler.problems.p1to10;

import java.util.ArrayList;

import net.nchelluri.projectEuler.BigInt;
import net.nchelluri.projectEuler.PrimeGenerator;

public class Problem3 {
	public static void main(String[] args) {
		BigInt composite = BigInt.from("600851475143");
		ArrayList<Long> primes = PrimeGenerator.generatePrimes(150000);
		for (int i = primes.size() - 1; i >= 0; i--) {
			Long prime = primes.get(i);
			if (composite.mod(prime.toString()).isZero()) {
				System.out.println(prime);
				break;
			}
		}
	}
}
