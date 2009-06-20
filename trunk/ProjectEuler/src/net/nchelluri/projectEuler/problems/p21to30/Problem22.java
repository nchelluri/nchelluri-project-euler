package net.nchelluri.projectEuler.problems.p21to30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem22 {
	public static void main(String[] args) throws IOException {
		long time = System.currentTimeMillis();

		BufferedReader in = new BufferedReader(new FileReader(
				"c:\\home\\desktop\\names.txt"));

		String nameString = in.readLine();
		String[] names = nameString.split(",");
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].substring(1, names[i].length() - 1);
		}

		List<String> sortedNames = new LinkedList<String>(Arrays.asList(names));
		Collections.sort(sortedNames);

		long sumOfScores = 0;
		for (int i = 0; i < sortedNames.size(); i++) {
			long score = (i + 1) * alphavalue(sortedNames.get(i));
			sumOfScores += score;
		}

		System.out.println(sumOfScores);

		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time));
	}

	protected static int alphavalue(String string) {
		int value = 0;
		for (int i = 0; i < string.length(); i++) {
			value += Character.getNumericValue(string.charAt(i)) - 9;
		}
		return value;
	}
}
