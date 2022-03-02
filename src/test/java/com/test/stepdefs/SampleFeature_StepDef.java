package com.test.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleFeature_StepDef {

	FizzBuzzCheck obj = new FizzBuzzCheck();
	private String result;

	@Given("I want to play a game")
	public void i_want_to_play_a_game() {

		System.out.println("I am playing a game");

	}

	@When("I have a number")
	public void i_give_a_number() {

		System.out.println("I have a number with me");

	}

	@And("^I check the divisibility of the (-?\\d+)$")
	public void i_check_the_divisibility(int x) {

		result = obj.playGame(x);

	}

	@Then("I print the result")
	public void i_print_the_result() {

		System.out.println(result);

	}

}