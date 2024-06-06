Feature: MSN Application Functionality
  
@MSN
  Scenario: To verify the fucntionality of MSN application
    Given User is landed on the home page of MSN 
    And User clicks on notification icon
    Then User clicks on the top story link
    Then User switch  to child window 
    Then User gets the text from child window to parent window
    And User navigate back to parent window
    Then User Enter the fetched text in the search field
    And User clicks on the search icon
    Then User goes to second child 
    And User clicks on see more button

