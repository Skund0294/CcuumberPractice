package com.test.stepdefs;

public class FizzBuzzCheck {

	public String playGame(int i) {

		if (i == 0)
			throw new IllegalArgumentException("Number should be greater than 0");

		if ((i % 3 == 0) && (i % 5 != 0))
			return "Fizz";
		if ((i % 3 != 0) && (i % 5 == 0))
			return "Buzz";
		if ((i % 3 == 0) && (i % 5 == 0))
			return "FizzBuzz";

		return String.valueOf(i);

	}
}