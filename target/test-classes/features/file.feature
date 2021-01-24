Feature: Application LogIn Verification

Scenario Outline: Verification of Login

Given Visiting the "https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022" first
When Logging in with credentials of <username> and <password>
Then Verify the login
And close all browsers


Examples:

|username|password|
|elif hanim|elifim benim|
|elif hanim1|elifim benim1|