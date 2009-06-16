package net.nchelluri.projectEuler.problems.p11to20;
public class Problem17 {
	public static String spaceStrippedStringFrom(int i) {
		if (i == 1000) {
			return "onethousand";
		}

		StringBuilder builder = new StringBuilder();
		int hundreds = i / 100;
		int tens = (i % 100) / 10;
		int ones;

		if (tens > 0) {
			ones = (i % 100) % (10 * tens);
		} else {
			ones = (i % 100);
		}

		if (i >= 100) {
			builder.append(onesStringFrom(hundreds));
			builder.append("hundred");
			if (i % 100 != 0) {
				builder.append("and");
			}
		}

		if (tens > 0) {
			if (tens != 1) {
				builder.append(tensStringFrom(tens));
			} else {
				builder.append(teensStringFrom(i % 100));
			}
		}

		if (ones > 0 && tens != 1) {
			builder.append(onesStringFrom(ones));
		}

		String string = builder.toString();
		return string;
	}

	private static String teensStringFrom(int i) {
		switch (i) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		}

		return null;
	}

	private static String tensStringFrom(int tens) {
		switch (tens) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		}

		return null;
	}

	private static String onesStringFrom(int i) {
		switch (i) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		}

		return "";
	}

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int len = 0;
		for (int i = 1; i <= 1000; i++) {
			len += spaceStrippedStringFrom(i).length();
		}
		System.out.println(len);
		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time));
	}
}
