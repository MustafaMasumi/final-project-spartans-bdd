@Smoke
  Feature: primary check ups

    Scenario: Validate home page title is TEK Insurance UI and create Primary Account button exist
      Then validate the title is "TEK Insurance UI"
      Then Create Primary Account button exist

      @CreateAccountStory1
      Scenario: Navigate to Create Account page and validate form title
        When user click on a link text button "Create Primary Account"
        Then validate that "Create Primary Account Holder" is visible as form title