package net.nchelluri.projectEuler.problems.p11to20;

public class Problem12 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		out: for (int i = 7;; i++) {
			int triangle = triangleNum(i);
			int squareRootOfTriangle = ((int) Math.sqrt(triangle)) + 1;

			int divisorCount = 0;
			for (int j = 1; j <= squareRootOfTriangle; j++) {
				if (triangle % j == 0) {
					divisorCount += 2;
				}

				if (divisorCount > 500) {
					System.out.println(triangle);
					break out;
				}
			}
		}
		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time) + "ms");
	}

	private static int triangleNum(int n) {
		int triangle = 0;
		for (int i = 1; i <= n; i++) {
			triangle += i;
		}

		return triangle;
	}
}
