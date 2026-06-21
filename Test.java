package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Test {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

@Given("User  Open Chrome Browser")
public void user_open_chrome_browser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@When("User  Entered Url in Browser")
public void user_entered_url_in_browser() {
	driver.get(url);
	
}

@When("User Should Navigated HomePage")
public void user_should_navigated_home_page() {
	String HomePage = driver.getTitle();
	System.out.println(HomePage);
}

@When("Enter Incorrect UserName")
public void enter_incorrect_user_name() {
	driver.findElement(By.id("username")).sendKeys("arpita");
	
}

@When("Password in Edit Box")
public void password_in_edit_box() {
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.xpath("//button[@id='submit']")).click();
}

@Then("Error Message displayed")
public void error_message_displayed() {
   driver.quit();
}



}
