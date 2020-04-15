
Feature: Crossword Website



@TC_01_Crossword
Scenario Outline: validate Login functionality
Given I Launch the Browser and enter the url
When  login page is opened
Then I enter the "<username>" and "<password>"
And I click on the signin button
  
Examples:
      |username                  |password     |
      | jyothidurga150@gmail.com |jyothi123    |


  @TC_02_Crossword
    Scenario: Book    
    Given I logged on the Website
    When I click on books
    Then I select required book 
    
      
   
     
     
  @TC_03_Crossword
     Scenario: Mycart     
     Given I logged on to the Website
     When I clicked on mycart
     Then I select continue shopping
     
      
      
  @TC_04_Crossword
      Scenario: Help     
      Given I am logged in to the website
      When I have clicked on to the Help
      Then I click on faqs that i want
      
     
      
   @TC_05_Crossword
      Scenario: logout     
      Given I am logged on the website
      When I click the logout button
      Then I received that iam logged out
      
      
      
      
      
      
      
      
      
      