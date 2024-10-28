Feature: Product move to the shopping cart

  Scenario: User should login and move the product to the shopping cart success
  
    Given user should open the browser
    And user should navigate to the demowebshop website
    And user should click on loginlink
    And user should enter the username as "dharunkumarrajendran@gmail.com"
    And user should enter the password as "Dharun@123"
    And user should click on the login button
    And user should click on the Books Link
    And user should clcik on the Computing and Internet link 
    And user should click on the add to cart button
    Then Computer and internet book added on the shopping cart