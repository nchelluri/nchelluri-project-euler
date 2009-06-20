package net.nchelluri.projectEuler.problems.p21to30;

import junit.framework.TestCase;

public class Problem21Test extends TestCase {
	public void testSumOfProperDivisors() {
		String sumString = "0\n" + "1\n" + "1\n" + "3\n" + "1\n" + "6\n"
				+ "1\n" + "7\n" + "4\n" + "8\n" + "1\n" + "16\n" + "1\n"
				+ "10\n" + "9\n" + "15\n" + "1\n" + "21\n" + "1\n" + "22\n"
				+ "11\n" + "14\n" + "1\n" + "36\n" + "6\n" + "16\n" + "13\n"
				+ "28\n" + "1\n" + "42\n" + "1\n" + "31\n" + "15\n" + "20\n"
				+ "13\n" + "55\n" + "1\n" + "22\n" + "17\n" + "50\n" + "1\n"
				+ "54\n" + "1\n" + "40\n" + "33\n" + "26\n" + "1\n" + "76\n"
				+ "8\n" + "43\n" + "21\n" + "46\n" + "1\n" + "66\n" + "17\n"
				+ "64\n" + "23\n" + "32\n" + "1\n" + "108\n" + "1\n" + "34\n"
				+ "41\n" + "63\n" + "19\n" + "78\n" + "1\n" + "58\n" + "27\n"
				+ "74\n" + "1\n" + "123\n" + "1\n" + "40\n" + "49\n" + "64\n"
				+ "19\n" + "90\n" + "1\n" + "106\n" + "40\n" + "44\n" + "1\n"
				+ "140\n" + "23\n" + "46\n" + "33\n" + "92\n" + "1\n" + "144\n"
				+ "21\n" + "76\n" + "35\n" + "50\n" + "25\n" + "156\n" + "1\n"
				+ "73\n" + "57\n" + "117\n";

		String actual = "";
		for (int i = 1; i <= 100; i++) {
			actual += Problem21.sumOfProperDivisorsOf(i) + "\n";
		}
		
		assertEquals(sumString, actual);
	}
}
