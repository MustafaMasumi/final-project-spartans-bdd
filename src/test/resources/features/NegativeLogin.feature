  @Smoke @Regression
  Feature: Login features

    Background: go to login page
      When user click on a link text button "Login"

      @loginStory2
      Scenario Outline: validate sign in with invalid credentials
        When user login with username "<username>" and "<password>" as password
        Then user click on a text button "Sign in"
        Then user must see error "expectedResult>"

         Examples:
          username      |   |password     |  |expectedResult               |
          invaliduserxyz|   |passwordxyz  |  |User invaliduserxyz not found|
          mustafamasumi |   |wrongpassxyz |  |Password not matched         |
          invaliduserabc|   |wrongpassabc |  |User invaliduserabc not found|