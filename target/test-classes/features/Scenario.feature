Feature: Open Google and Search Corgi

  @init
  Scenario: Open Google and Search Corgi
    Given google chrome is launched

    When the user searches for 'Corgi'

    Then the website should display 'Corgi'
#    And the browser should close