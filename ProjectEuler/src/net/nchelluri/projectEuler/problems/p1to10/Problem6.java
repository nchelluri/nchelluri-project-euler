package net.nchelluri.projectEuler.problems.p1to10;
public class Problem6 {
	public static void main(String args[]) {
		int sumOfSquares = sumOfSquares(100);
		int squareOfSums = squareOfSums(100);
		
		System.out.println(squareOfSums - sumOfSquares);
	}

	private static int squareOfSums(int i) {
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		return sum * sum;
	}

	private static int sumOfSquares(int i) {
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum += j * j;
		}
		return sum;
	}
}
