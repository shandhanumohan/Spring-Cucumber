
@AddTest
Feature: arithmetic addtion operations...
  Scenario Outline: user wants to add two numbers
    When the user calls with values "<number1>" and "<number2>"
    Then the user receives answer as "<result>"

    Examples:
      | number1 | number2 | result |
      | 2       | 3       | 5     |
      | 4       | 6       | 10     |
      | 7       | 8       | 15    |