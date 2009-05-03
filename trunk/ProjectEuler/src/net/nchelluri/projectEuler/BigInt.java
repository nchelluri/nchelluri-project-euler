package net.nchelluri.projectEuler;

import java.math.BigInteger;

// Wrapper around BigInteger.  Should make it less horrible to use.

public class BigInt {
	private final BigInteger value;

	public static BigInt from(String strRep) {
		return new BigInt(strRep);
	}

	public static BigInt from(long val) {
		return new BigInt("" + val);
	}

	public static BigInt from(BigInteger bigIntegerRep) {
		return new BigInt(bigIntegerRep);
	}
	
	public BigInt dividedBy(String string) {
		return BigInt.from(value.divide(new BigInteger(string)));
	}

	public BigInt times(String string) {
		return BigInt.from(value.multiply(new BigInteger(string)));
	}

	public BigInt plus(String string) {
		return BigInt.from(value.add(new BigInteger(string)));
	}

	public BigInt minus(String string) {
		return BigInt.from(value.subtract(new BigInteger(string)));
	}

	public BigInt mod(String string) {
		return BigInt.from(value.mod(new BigInteger(string)));
	}

	public boolean isZero() {
		return value.equals(BigInteger.ZERO);
	}

	public BigInteger underlying() {
		return value;
	}

	public String toString() {
		if (value == null) {
			return "";
		}
		return value.toString();
	}

	@Override
	// Eclipse Default
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	// Eclipse Default
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BigInt))
			return false;
		final BigInt other = (BigInt) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	private BigInt(String strRep) {
		value = new BigInteger(strRep);
	}

	private BigInt(BigInteger bigIntegerRep) {
		value = bigIntegerRep;
	}
}
