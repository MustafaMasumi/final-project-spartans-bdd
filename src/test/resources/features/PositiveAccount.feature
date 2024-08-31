@Regression
  Feature: create account features

    Background: click on create primary account button and fill the form
      When user click on a link text button "Create Primary Account"
      When user fill the Create new account form
        Email Address     random
        First Name        Jack
        Last Name         Smith
        Employment        Teacher
        Date Of Birth     12/12/2012
      When user Choose "Mr." from the "Title / Prefix" list
      When user choose "Male" from the "Gender" list
      When user choose "Single" from the "Marital Status" list
      Then user click on a visible text button "Create Account"

      @userStory2
      Scenario: fill the form on Create primary account page and validate the email and title on sign up page
        then validate user can see the "Sign up your account"
        And email address shows as expected

        @userStory5
        Scenario: create account and login and validate name
          When user fill the Sign up account
          Then user click on a visible text button "Submit"
          Then user wait for 3 second
          Then user login with valid username and password
          Then user click on a visible text button "Sign In"
          Then user click on profile button and validate the "Full Name"

