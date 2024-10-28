Feature: DemoWebShop application

  Background: 
    Given user should open the browser
    And user should navigate to the demowebshop website

  @smoke
  Scenario: Login should be successfull
    And user should click on loginlink
    And user should enter the username as "dharunkumarrajendran@gmail.com"
    And user should enter the password as "Dharun@123"
    And user should click on the login button
    Then login sholud be successfully done

  @reg
  Scenario: Login should not be successfull
    And user should click on loginlink
    And user should enter the username as "dharunkumarrajendran@gmail.com"
    And user should enter the password as "Dharun123"
    And user should click on the login button
    But login sholud not be successfully done