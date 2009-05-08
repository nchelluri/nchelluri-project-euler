package net.nchelluri.projectEuler.calendar;

public enum DayOfWeek {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;

	public DayOfWeek next() {
		return values()[(ordinal() + 1) % values().length];
	}

	public boolean is(DayOfWeek other) {
		return ordinal() == other.ordinal();
	}
}
