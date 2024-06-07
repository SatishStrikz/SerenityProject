Feature: Closed Shadow Dom element  Access
  
@ShadowClosed
  Scenario Outline: To verify the closed shadow dom element access in application
    Given User is landed on the home page of Selectors Hub 
    And User enters text on Concept test field "<text>"
    Then User clicks on Go to cart button
    Example:
    |text|
    |No|
    
    #Then User sort the email id from the red text
    #Then User switch back to parent window 
    #And pass the sorted email ID
    

