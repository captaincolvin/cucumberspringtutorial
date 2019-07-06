Feature: Open Google and Search Corgi

  @init
  Scenario Outline: Open Google and Search Corgi
    Given google chrome is launched

    When the user searches for '<SEARCH_KEY>'

    Then the website should display '<RESULT>'
    And the browser should close

    Examples:
      | SEARCH_KEY | RESULT |
      | Corgi      | Corgi  |