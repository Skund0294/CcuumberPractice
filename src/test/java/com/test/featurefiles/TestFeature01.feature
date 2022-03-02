Feature: To test a random feature using Cucumber

@SampleTest

Scenario Outline: A sample test scenario in Cucumber
Given I want to play a game
When I have a number
And I check the divisibility of the <number>
Then I print the result

Examples:
|number|
|3|
|5|
|15|
|30|
|4|