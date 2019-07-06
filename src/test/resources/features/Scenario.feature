Feature: Open Google

  @init
  Scenario: Open Google
    Given google chrome is launched

    When the user searches for 'Corgi'

    Then the website should display 'Corgi'
    And the browser should close