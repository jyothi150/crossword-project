@DemoWebshop
Feature: DemoWebshop Website

@tc_01_Change_Password
Scenario Outline: Changing password of logged in profile
Given I logged in to website
When I navigate to My account page
And I click change password
Then I enter "<oldpwd>" "<newpwd>" "<confirmnewpwd>"
And I click submit
Then Password succesfully changed message is displayed

Examples:

		|oldpwd		|newpwd	  |confirmnewpwd |
		|demo123 | 12345678 |12345678			 |