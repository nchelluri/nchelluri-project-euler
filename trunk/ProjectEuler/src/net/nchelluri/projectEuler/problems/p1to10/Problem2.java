package net.nchelluri.projectEuler.problems.p1to10;
public class Problem2 {
	public static void main(String args[]) {
		int f1 = 1;
		int f2 = 2;

		int f = 0;

		int sum = 2;

		while (f < 4000000) {
			f = f1 + f2;
			if (f % 2 == 0) {
				sum += f;
			}
			f1 = f2;
			f2 = f;
		}

		System.out.println(sum);
	}
}
