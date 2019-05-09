Feature: Login
  Login TEAS administration

  Scenario: Login TAP
    Given user "admin.opco" logs in to teas
    When user entered the institution page
    Then I should see the following institutions
      | INST3 | E2E Institution INST3 | Bedrijven            | 01-12-2019 |
      | INSTC | Institution C         | Voortgezet Onderwijs | 31-03-2029 |
      | INSTD | Institution D         | Voortgezet Onderwijs | 31-03-2029 |