Feature: features of Gherkin test
  Scenario Outline: client makes call to GET author
    When the client calls author
    Then the client receives status code of 200