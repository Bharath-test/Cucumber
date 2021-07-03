@login
Feature: To validate the function of facebook application

Background:
   Given user should be launch ChromeBrowser and enter the url
   
Scenario: To validating the facebook applicatio  with invalid username and password

When user is going to enter username and password field

And user should be click to login button

Then  user should be navigate to credential page

Scenario: To validating the facebook with invalid username and invalid password

When user is going to enter username and password

And user should be click to login btn

Then user should be navigate to error page



    
    
