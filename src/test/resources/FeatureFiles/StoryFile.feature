Feature: sample feature


  Scenario: Google Search
    When i launch google website
    Then i type "Trijit" inside search box

  Scenario: Flipkart launch
    When i launch Flipkart.com
    Then i should see Flipkart logo




