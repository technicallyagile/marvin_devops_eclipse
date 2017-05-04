Feature: Marvin the Android

  Scenario: Say Hello To Marvin
    Given I am talking to Marvin
    When I say to Marvin, "Hello Marvin"
    Then Marvin replies "Whatever."
    
  Scenario: Talk to Marvin
  	Given I am talking to Marvin
  	When I say to Marvin, "Foo"
  	Then Marvin does not reply "Whatever."
