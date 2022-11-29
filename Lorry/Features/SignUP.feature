Feature: SignUP

Scenario: Successful SignUP with valid cedentials
Given User launch chrome browser
When User opens URL "https://qa.lorrycircle.com/"
And User clicks on the SingUP button
Then User select the language 
And User enter Name and phone number 
Then User click on check box to accept Terms and Conditions
And User click Accept button on Terms and Conditions on PopUp window 
And User Click on Register button 
And Close the browser  