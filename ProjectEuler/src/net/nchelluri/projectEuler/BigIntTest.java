package net.nchelluri.projectEuler;

import java.math.BigInteger;

import junit.framework.TestCase;

public class BigIntTest extends TestCase {
	public void testFromLong() {
		assertEquals(BigInteger.TEN, BigInt.from(10L).underlying());
	}

	public void testFromString() {
		assertEquals(BigInteger.TEN, BigInt.from("10").underlying());
	}

	public void testFromBigInteger() {
		assertEquals(BigInteger.TEN, BigInt.from(new BigInteger("10"))
				.underlying());
	}

	public void testDivide() {
		assertEquals(BigInteger.ONE, BigInt.from("5").dividedBy("5")
				.underlying());
	}

	public void testMultiply() {
		assertEquals(new BigInteger("25"), BigInt.from("5").times("5")
				.underlying());
	}

	public void testAdd() {
		assertEquals(new BigInteger("10"), BigInt.from("3").plus("7")
				.underlying());
		assertEquals(new BigInteger("10"), BigInt.from(3).plus(BigInt.from(7))
				.underlying());
	}

	public void testSubtract() {
		assertEquals(BigInteger.ZERO, BigInt.from("15").minus("15")
				.underlying());
	}

	public void testMod() {
		assertEquals(BigInteger.ZERO, BigInt.from("10").mod("2").underlying());
		assertEquals(BigInteger.ONE, BigInt.from("11").mod("10").underlying());
		assertEquals(BigInteger.ZERO, BigInt.from("10").mod(BigInt.from("2"))
				.underlying());
		assertEquals(BigInteger.ONE, BigInt.from("11").mod(BigInt.from("10"))
				.underlying());
	}

	public void testIsZero() {
		assertFalse(BigInt.from("1").isZero());
		assertTrue(BigInt.from("0").isZero());
	}
}
