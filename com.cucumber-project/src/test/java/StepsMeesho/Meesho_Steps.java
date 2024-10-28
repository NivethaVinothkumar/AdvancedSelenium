package StepsMeesho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class Meesho_Steps {

	WebDriver driver;
	Actions a ;
	
	@Given("user should open the browser")
	public void userShouldOpenTheBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@Given("user should navigate to the Meesho website")
	public void userShouldNavigateToTheMeeshoWebsite() {
		driver.get("https://www.meesho.com/");
	   
	}

	@Given("user should move the cursor to Men tab")
	public void userShouldMoveTheCursorToMenTab() throws InterruptedException {
		a=new Actions(driver);
		Thread.sleep(2000);
		WebElement menLink=driver.findElement(By.xpath("//span[text()='Men']"));
		a.moveToElement(menLink).perform();
	   
	}

	@Given("user should Click on Casual Shoes")
	public void userShouldClickOnCasualShoes() throws InterruptedException  {
		WebElement casualShoesLink=driver.findElement(By.xpath("//p[text()='Casual Shoes']"));
		 a.moveToElement(casualShoesLink).click().perform();
		 Thread.sleep(3000);
		
	}

	@Given("user should click on Aadab Trendy link")
	public void userShouldClickOnAadabTrendyLink() throws InterruptedException {
		driver.findElement(By.xpath("//p[contains(text(),'Aadab Trendy Men Casual Shoes')]")).click();
	}

	@Given("user should click on Shoe Size")
	public void userShouldClickOnShoeSize() throws InterruptedException {
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='IND-9']")).click();
	}

	@Given("user should click on Add to Cart button")
	public void userShouldClickOnAddToCartButton() {
	   
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.quit();
	}

	
}