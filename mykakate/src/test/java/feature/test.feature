@ignore
Feature: Learn How to use Karate for testing.

  Scenario: Testing valid GET endpoint

    Given url 'http://localhost:8080/user/get'
    When method GET
    Then status 200

  Scenario: Testing the exact response of a GET endpoint

    Given url 'http://localhost:8080/user/get'
    When method GET
    Then status 200
    And match $ == {id:"1234", name:"John Smith"}

  Scenario: Testing that GET response contains specific field

    Given url 'http://localhost:8080/user/get'
    When method GET
    Then status 200
    And match $ contains {id:"1234"}