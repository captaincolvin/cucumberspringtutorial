Feature: Open Google

  @init
  Scenario Outline: Open Google
    Given google chrome is launched

    When the user searches for '<SEARCH_KEY>'

    Then the website should display '<RESULT>'

    Examples:
      | URL | SEARCH_KEY | RESULT |
      |     | Corgi      | Corgi  |