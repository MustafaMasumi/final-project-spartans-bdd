@Smoke
  Feature: All Negative tests

    Background:
      When user click on a link text button "Create Primary Account"
      When user Choose "Mr." from the "Title / Prefix" list
      When user types "Jack" into the "First Name" field
      When user types "Smith" into the "Last Name" filed
      When user choose "Male" from the "Gender" list
      When user choose "Single" from the "Marital Status" list
      When  user types "SDET Engineer" into the "Employment Status" field

      @userStory3
      Scenario Outline: fill the form with existing email and validate the error message
        When user types "mmasumi@aol.com" into the "Email Address' Filed
        When user types "12/12/2012" into the "Date of Birth" Filed
        Then user click on a visible text button "Create Account"
        Then user should see error "<expectedResult>"
        Examples:
          expectedResult
          Account with email mmasumi@aol.com exist

        @userStory4
        Scenario Outline: fill the form with age less than 18 and validate the error message
          When user types "mmasumi@aol.com" into the "Email Address" Filed
          When user types '12/12/2012" into the "Date of Birth" field
          Then user click on a visible text button "Create Account"
          Then user should see error "<expectedResult>"
          Examples:
            expectedResult
            you must be 18 years or older to create account

