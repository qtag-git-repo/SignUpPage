Feature: Login

Scenario: Successful login with valid cedentials
Given User launch chrome browser
When User opens URL "https://qa.lorrycircle.com/"
And User clicks on the Login button
And User enter phone number 
Then Click on OTP button 
And Enter the OTP number 
Then Verify the OTP button 
And Close the browser  