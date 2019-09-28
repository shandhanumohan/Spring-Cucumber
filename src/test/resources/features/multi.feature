
@MultiplicationTest
Feature: arithmetic multi operations...
  Scenario Outline: client wants to multiply two numbers
    When the client calls with values "<number1>" and "<number2>"
    Then the client receives answer as "<result>"

    Examples:
      | number1 | number2 | result |
      | 2       | 3       | 6      |
      | 4       | 6       | 24     |
      | 7       | 8       | 56     |