package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddToCart_Steps {

	WebDriver driver;
	
	@Given("user should click on the Books Link")
	public void userShouldClickOnTheBooksLink() 
	{
	 WebElement Book_text= driver.findElement(By.xpath("//a[contains(text(),'Books')])[1]"));
	 Assert.assertEquals(Book_text,true);
	 Book_text.click();
	}

	@Given("user should clcik on the Computing and Internet link")
	public void userShouldClcikOnTheComputingAndInternetLink() 
	{
	WebElement computer_text=driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]) [1]"));
	Assert.assertEquals(computer_text,true);
	computer_text.click();
	    
	}

	@Given("user should click on the add to cart button")
	public void userShouldClickOnTheAddToCartButton() 
	{
	   driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
	}

	@Then("Computer and internet book added on the shopping cart")
	public void computerAndInternetBookAddedOnTheShoppingCart() 
	{
	 String qty= driver.findElement(By.xpath("//span[text()='(1)']")).getText();
	 Assert.assertEquals(qty.contains(qty),true);
	}
}

