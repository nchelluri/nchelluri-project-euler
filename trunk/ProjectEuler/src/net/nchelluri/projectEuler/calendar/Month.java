package net.nchelluri.projectEuler.calendar;

public enum Month {
	January, February, March, April, May, June, July, August, September, October, November, December;

	public Month next() {
		return values()[(ordinal() + 1) % values().length];
	}

	public boolean isFebruary() {
		return is(Month.February);
	}

	public boolean isDecember() {
		return is(Month.December);
	}

	public boolean has30Days() {
		return is(Month.September) || is(Month.April) || is(Month.June)
				|| is(Month.November);
	}

	protected boolean is(Month other) {
		return ordinal() == other.ordinal();
	}
}
