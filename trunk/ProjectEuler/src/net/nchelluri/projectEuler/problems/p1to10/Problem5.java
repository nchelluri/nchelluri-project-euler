package net.nchelluri.projectEuler.problems.p1to10;
public class Problem5 {
	public static void main(String args[]) {
		for(int i = 2520;; i += 20) {
			if(checkMod(i)) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean checkMod(int i) {
		for(int j = 2; j <= 20; j++) {
			if(i % j != 0) {
				return false;
			}
		}
		
		return true;
	}
}
