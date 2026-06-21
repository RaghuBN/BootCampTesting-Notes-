Feature:Checking Validation in Input Field
Scenario: Desigining the Test Case 2

Given User  Open Chrome Browser
 When User  Entered Url in Browser
 When User Should Navigated HomePage
 And  Enter Incorrect UserName 
 And Password in Edit Box
 And  Click On Login PushButton
 Then Error Message displayed 


