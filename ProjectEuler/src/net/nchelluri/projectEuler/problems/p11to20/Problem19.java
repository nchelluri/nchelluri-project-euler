package net.nchelluri.projectEuler.problems.p11to20;

import net.nchelluri.projectEuler.calendar.CalendarDay;
import net.nchelluri.projectEuler.calendar.DayOfWeek;
import net.nchelluri.projectEuler.calendar.Month;

public class Problem19 {
	public static void main(String[] args) {
		CalendarDay day = new CalendarDay();

		int count = 0;
		while (inThe20thCentury(day)) {
			if (isSundayTheFirstOfTheMonth(day)) {
				count++;
			}

			day.increment();
		}
		System.out.println(count);
	}

	private static boolean isSundayTheFirstOfTheMonth(CalendarDay day) {
		return day.yearIsAfterOrEqualTo(1901)
				&& day.isDayOfWeekOnDayOfMonth(DayOfWeek.Sunday, 1);
	}

	private static boolean inThe20thCentury(CalendarDay day) {
		return !day.is(Month.January, 1, 2001);
	}
}
