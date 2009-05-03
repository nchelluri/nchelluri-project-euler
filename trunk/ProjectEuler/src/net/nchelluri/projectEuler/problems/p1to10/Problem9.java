package net.nchelluri.projectEuler.problems.p1to10;
public class Problem9 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;

		outer: for (c = 1; c < 1000; c++) {
			for (b = 1; b < c; b++) {
				for (a = 1; a < b; a++) {
					if (isPythagoreanTriplet(a, b, c) && a + b + c == 1000) {
						break outer;
					}
				}
			}
		}

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("abc = " + a * b * c);
	}

	private static boolean isPythagoreanTriplet(int a, int b, int c) {
		return a * a + b * b == c * c;
	}
}
