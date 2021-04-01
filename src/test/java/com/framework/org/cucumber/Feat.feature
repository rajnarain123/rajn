Feature: Booking a hotel in Adactin application

Background

Scenario: User login to the application
    Given User launches the application
    When User enters the username
    And User enters the password
    Then User validates the username and password
    
    
    Scenario: User enter information about search hotel
   Given  User select Location
   When user select Hotel name
   And user select room type
   And user select no of room
   And user enter Check in date
   And user enter Check out date 
   And user Select no.of adults
   And user Select no.of childrens
   Then user click search button to verify
   
   Scenario: user select the Hotel
       Given user click radio button
       When user enter continue button 
       When user enter "narain" as user name
       When user enter "Rajaram" as last name
       When user enter "2a Kumaran colony" as address
       When user enter "1234567890987654" as credit card number 
       When user Select options "byvalue" and select "MAST" as answer
       When user Select options "byValue" and select "12" as no
       When user select options "byValue" and Select "2022" as year
       When user enter "184" as CVV No
       When user click BOOK click button
       When user click logo Button
       