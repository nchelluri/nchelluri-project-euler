package net.nchelluri.projectEuler.problems.p11to20;
import junit.framework.TestCase;

public class Problem17Test extends TestCase {
	public void test1000() {
		assertEquals("onethousand", Problem17.spaceStrippedStringFrom(1000));
	}

	public void test508() {
		assertEquals("fivehundredandeight", Problem17
				.spaceStrippedStringFrom(508));
	}
}
