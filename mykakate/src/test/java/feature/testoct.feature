Feature: Learn How to use Karate for testing.

  Scenario: Testing valid GET endpoint
    Given url 'http://octopus-uat.baozun.com/api/core/source-market-code-mappings'
    And headers {octopus-auth-token:'74b79aa3-1d9f-46e8-9455-100d6edb59e1'}
    When method GET
    Then status 200
  Scenario:
    Given url 'http://octopus-uat.baozun.com/api/core/source-market-code-mappings'
    And headers {octopus-auth-token:'74b79aa3-1d9f-46e8-9455-100d6edb59e1'}
    When method GET
    Then status 200
    And  match $ contains {"totalElements":37}