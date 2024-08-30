@Smoke @Regression
  Feature: Login features

    Background: go to login page
      When user click on the link text button "Login"

      @loginStory1
      Scenario: sign in with your credential
        When user login with username "mmasumi" and "Test2024" as password
        Then user click on visible text button "Sign In"
        #Then user wait for 1 second
        Then validate user is navigated to "Customer Service Portal"
