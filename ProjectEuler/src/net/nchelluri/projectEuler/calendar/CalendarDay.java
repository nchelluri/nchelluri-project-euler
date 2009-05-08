package net.nchelluri.projectEuler.calendar;

public class CalendarDay {
	private DayOfWeek dayOfWeek;
	private Month month;
	private int dayOfMonth;
	private int year;

	public CalendarDay() {
		this(DayOfWeek.Monday, Month.January, 1, 1900);
	}

	public CalendarDay(DayOfWeek dayOfWeek, Month month, int dayOfMonth,
			int year) {
		this.dayOfWeek = dayOfWeek;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
		this.year = year;
	}

	public void increment() {
		int daysInMonth = getDaysInMonth(month);

		dayOfMonth = dayOfMonth + 1;
		if (dayOfMonth > daysInMonth) {
			rollMonthOver();
		}

		dayOfWeek = dayOfWeek.next();
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 & year % 100 != 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		}

		return false;
	}

	public boolean is(Month otherMonth, int otherDayOfMonth, int otherYear) {
		return month.is(otherMonth) && dayOfMonth == otherDayOfMonth
				&& year == otherYear;
	}

	public boolean yearIsAfterOrEqualTo(int other) {
		return year >= other;
	}

	public boolean isDayOfWeekOnDayOfMonth(DayOfWeek otherDayOfWeek,
			int otherDayOfMonth) {
		return dayOfWeek.is(otherDayOfWeek) && dayOfMonth == otherDayOfMonth;
	}

	private void rollMonthOver() {
		if (month.isDecember()) {
			year = year + 1;
		}
		month = month.next();
		dayOfMonth = 1;
	}

	private int getDaysInMonth(Month month) {
		int daysInMonth;
		if (month.has30Days()) {
			daysInMonth = 30;
		} else if (month.isFebruary()) {
			daysInMonth = getDaysInFebruary();
		} else {
			daysInMonth = 31;
		}

		return daysInMonth;
	}

	private int getDaysInFebruary() {
		int daysInMonth;
		daysInMonth = 28;
		if (isLeapYear(year)) {
			daysInMonth = 29;
		}
		return daysInMonth;
	}

	public String toString() {
		return dayOfWeek + " " + month + "/" + dayOfMonth + "/" + year;
	}
}
