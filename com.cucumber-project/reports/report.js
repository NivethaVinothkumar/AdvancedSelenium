$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\MeeshoFeature\\Meesho.feature");
formatter.feature({
  "name": "Meesho Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add one product from Mens Shoe section",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Meesho_Steps.userShouldOpenTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to the Meesho website",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldNavigateToTheMeeshoWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should move the cursor to Men tab",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldMoveTheCursorToMenTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should Click on Casual Shoes",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldClickOnCasualShoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on Aadab Trendy link",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldClickOnAadabTrendyLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on Shoe Size",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldClickOnShoeSize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on Add to Cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_Steps.userShouldClickOnAddToCartButton()"
});
formatter.result({
  "status": "passed"
});
});