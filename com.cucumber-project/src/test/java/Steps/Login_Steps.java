package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Steps {
	
		WebDriver driver;
		
		@Given("user should open the browser")
		public void userShouldOpenTheBrowser() 
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}

		
	
		@Given("user should navigate to the demowebshop website")
		public void userShouldNavigateToTheDemowebshopWebsite()
		{
		    driver.get("https://demowebshop.tricentis.com/");
		}
		
	

		@Given("user should click on loginlink")
		public void userShouldClickOnLoginlink()
		{
			driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		}

		
		@Given("user should enter the username as {string}")
		public void userShouldEnterTheUsernameAs(String username) 
		{
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		}
		@Given("user should enter the password as {string}")
		public void userShouldEnterThePasswordAs(String password)
		{
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		}

		@Given("user should click on the login button")
		public void userShouldClickOnTheLoginButton() 
		{
		   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		}

		
		@Then("login sholud be successfully done")
		public void loginSholudBeSuccessfullyDone() 
		{
		 WebElement logou_Text= driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		 System.out.println(logou_Text.isDisplayed());
		 logou_Text.click();
//		 Assert.assertEquals(logou_Text,true);
//		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	    	driver.quit();
		}
		
		
		@Given("login sholud not be successfully done")
		public void loginSholudNotBeSuccessfullyDone()
		{
		 WebElement result= driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again')]"));
		// Assert.assertEquals("Login was unsuccessful",true);
		 System.out.println(result.isDisplayed());
		 driver.quit();
		}
	}
	

