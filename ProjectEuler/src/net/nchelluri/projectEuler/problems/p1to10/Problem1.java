package net.nchelluri.projectEuler.problems.p1to10;
public class Problem1 {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 3; i < 1000; i += 3) {
			sum += i;
		}
		
		for(int i = 5; i < 1000; i += 5) {
			if(i % 3 != 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
