
Feature: Paints module
  

Scenario: speak to professional in colour catalogue
    Given I am on the Asian Paints website
    And I fill in the form with valid details
    And I submit the form
    Then I should receive a confirmation message indicating that my details have been submitted successfully
    
 
 Scenario: speak to professional form invalid pincode
    Given I am on the Asian Paints website
    And I fill in the form with invalid details
    And I click submit the form
    Then I should receive a error message
    
     
 Scenario: wallpaper section actions
    Given I am on the Asian Paints website
    When I navigate to the Paints & Colours section and navigate to wallpapers
    And I click on good earth wallpapers
    And I select abstract and botanical and botanicalandfloral filters
    Then the selected wallpaper are filtered
    
    
    
 Scenario: wallpaper section clear filter action
    Given I am on the Asian Paints website
    When I navigate  to wallpapers and add filters
    And I click on clear all
    Then the selected filteres  are cleared
    
    
 
    
 Scenario: exterior textures clicking filters to submit
    Given I am on the Asian Paints website
    When I navigate  to exterior textures
    And I click on  filters
    And I click on Apex Createx Dholpur and Economy
    Then I can see the filtered results after clicking submit
    
    
        
  
 Scenario Outline: Submit enquiry form with valid inputs 
    Given I am on the Asian Paints website
    When I fill in the enquiry form
    And enters the name <name>
    And enters the email <email>
    And enters the phonenumber <mobile>
    And enter the pincode <pincode>
    And I click on the Submit button
    Then I should see a confirmation message

    Examples:
      | name         | email                   | mobile        | pincode     |
      | "varsha"    |"varsha@gmail.com"   |"9951536053"  |"530013"  |
      | "venkat"  |"raj.smith@gmail.com" |"9951536066" |"530014"  | 
    
    
     