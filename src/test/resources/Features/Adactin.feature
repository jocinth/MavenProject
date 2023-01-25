Feature: Automating the functionalities of Adactin

@Regression
Scenario: Tc-01: Verification of Adactin Login

Given User wants to open the Adactin application in chrome browser
Then User wants to verify whether the login page appear or not
When User wants to give valid username and password, and click on the login button
Then User wants to verify whether the search hotel page appear or not
When User wansts to give valid data in the fields and click search
Then User wants to verify whether the select hotel page appears
And User wants to click on the radio button, and click continue
Then User wants to verify whether the book a hotel page appears
When User wants to give valid data in the fields and click on the book now button
Then User wants to verify whether the booking confirmation page appears along with order number

@Smoke @Regression
Scenario Outline: Tc-02: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid "<username>" and "<password>", and click on the login button
Then User wants to verify whether the search hotel page appear or not 

Examples:
    | username | password |
    | jocinthn | 123456   |
    | jocinth  | 123456   |
    | Andrew07 | UN45LL   |

@SanityOne
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid username and password, and click on the login button
Then User wants to verify whether the search hotel page appear or not

@SanityTwo
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid username and password using DataTable without header one-D, and click on the login button
    #One-D without header
    | jocinthn |
    | 123456   |
Then User wants to verify whether the search hotel page appear or not

@SanityThree
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid username and password using DataTable without header Two-D, and click on the login button
    #Two-D without header
    | jocinthn | welcome |
    | 123456   | Adactin |
Then User wants to verify whether the search hotel page appear or not

@SanityFour
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid username and password using DataTable with header one-D, and click on the login button
    #One-D with header
    | UserName | jocinthn |
    | PassWord | 123456   |
Then User wants to verify whether the search hotel page appear or not

@Sanity
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid username and password using DataTable with header Two-D, and click on the login button
    #Two-D with header
    | UserName | PassWord |
    | jocinthn | 123456   |
Then User wants to verify whether the search hotel page appear or not

@Sanity
Scenario: Tc-03: Verification of Adactin Login

Given User wants to verify whether the login page appears once the aactin application is launched
When User wants to give valid usernam and passwor using DataTable with header Two-D, and click on the login button
    #Two-D with header
    | UserName | PassWord |
    | jocinthn | 123456   |
Then User wants to verify whether the search hotel page appear or not
    
