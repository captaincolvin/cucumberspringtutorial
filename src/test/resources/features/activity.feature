Feature: Capgemini Activity

  Scenario Outline: Open Jeonsoft ESS and Validate Profile

    Given google chrome is launched

    When the user logs in to the website
    Then the user should be taken to the landing screen

    When the user selects My Personal Info
    Then '<EMPLOYEE_CODE>', '<EMPLOYEE_NAME>', '<POSITION>','<DEPARTMENT>', '<EMPLOYMENT_TYPE>', '<TEAM>', '<IMMEDIATE_SUPERVISOR>' should be correct

    Examples:
      | EMPLOYEE_CODE | EMPLOYEE_NAME | POSITION | DEPARTMENT | EMPLOYMENT_TYPE | TEAM | IMMEDIATE_SUPERVISOR |
      |               |               |          |            |                 |      |                      |