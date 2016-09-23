package base;

public class MyInteger {

	private int Value;

	public MyInteger(int iValue) {

		Value = iValue;

	}

	public int GetNumber() {

		return Value;

	}

	public boolean isEven() {

		if (Value % 2 == 0)

			return true;

		else

			return false;

	}

	public boolean isOdd() {

		if (Value % 2 != 0)

			return true;

		else

			return false;

	}

	public boolean isPrime() {

		int num = 0;

		for (num = 2; num < Value; num++) {
			if (Value % num == 0)

				return false;

		}
		return true;

	}

	public static boolean isEven(int Value) {

		if (Value % 2 == 0)

			return true;

		else

			return false;

	}

	public static boolean isOdd(int Value) {

		if (Value % 2 != 0)

			return true;

		else

			return false;

	}

	public static boolean isPrime(int Value) {

		int num = 0;

		for (num = 2; num < Value; num++) {

			if (Value % num == 0)

				return false;

		}

		return true;

	}

	public static boolean isEven(MyInteger iValue) {

		return MyInteger.isEven(iValue.GetNumber());

	}

	public static boolean isOdd(MyInteger iValue) {

		return MyInteger.isOdd(iValue.GetNumber());

	}

	public static boolean isPrime(MyInteger iValue) {
		return MyInteger.isPrime(iValue.GetNumber());

	}

	public boolean equals(int iValue) {

		return GetNumber() == iValue;

	}

	public boolean equals(MyInteger iValue) {

		return equals(iValue.GetNumber());

	}

}
