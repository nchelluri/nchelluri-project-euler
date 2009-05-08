package net.nchelluri.projectEuler.problems.p11to20;

public class Problem19 {
	enum DayOfWeek {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	};

	enum Month {
		January, February, March, April, May, June, July, August, September, October, November, December
	};

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Month m = Month.January;
		int d = 1;
		int y = 1900;
		DayOfWeek dayOfWeek = DayOfWeek.Monday;

		int count = 0;
		while (!(m.ordinal() == Month.January.ordinal() && d == 1 && y == 2001)) {
			if (isSundayTheFirst(d, dayOfWeek) && y >= 1901) {
				count++;
			}
			int daysInMonth = 0;

			if (has30Days(m)) {
				daysInMonth = 30;
			} else if (isNotFebruary(m)) {
				daysInMonth = 31;
			} else {
				daysInMonth = 28;
				if (isLeapYear(y)) {
					daysInMonth = 29;
				}
			}

			d = d + 1;
			if (d > daysInMonth) {
				d = 1;
				Month nextMonth = Month.values()[(m.ordinal() + 1)
						% Month.values().length];
				if (is(m, Month.December) && is(nextMonth, Month.January)) {
					y = y + 1;
				}
				m = nextMonth;
			}

			dayOfWeek = DayOfWeek.values()[(dayOfWeek.ordinal() + 1)
					% DayOfWeek.values().length];
		}
		System.out.println(count);
		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time) + "ms");
	}

	private static boolean isNotFebruary(Month m) {
		return !is(m, Month.February);
	}

	private static boolean has30Days(Month m) {
		return is(m, Month.September) || is(m, Month.April)
				|| is(m, Month.June) || is(m, Month.November);
	}

	private static boolean isSundayTheFirst(int d, DayOfWeek dayOfWeek) {
		return is(dayOfWeek, DayOfWeek.Sunday) && d == 1;
	}

	private static boolean is(DayOfWeek d, DayOfWeek d2) {
		return d.ordinal() == d2.ordinal();
	}

	private static boolean isLeapYear(int y) {
		if (y % 4 == 0 & y % 100 != 0) {
			return true;
		} else if (y % 400 == 0) {
			return true;
		}

		return false;
	}

	private static boolean is(Month m, Month m2) {
		return m.ordinal() == m2.ordinal();
	}
}
