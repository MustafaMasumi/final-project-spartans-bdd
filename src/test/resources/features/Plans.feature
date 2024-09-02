@Regression
  Feature: Plans features

    Background: go to login page
      When user click on a link text button "Login"
      When user login with username "<mmasumi@aol.com>" and "<Test2024>" as password
      Then user click on a text button "Sign in"
      Then user click on a visible text button "Plans"

      @PlanStory1
      Scenario: navigate to CSR account and open Plans and validate 4 row is available
        Then validate 4 rows is available

        @PlanStory2
        Scenario: navigate to CSR account and open Plans and validate create date and expire date
          Then validate create date is today date and expire date is one day after
