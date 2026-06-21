package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase3 {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	@Given("User Should Open Browser")
	public void user_should_open_chrome_browser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	
	@When("User Entered Url in Browser")
	public void user_entered_url_in_chrome_browser() {
		driver.get(url);
	}

	@When("User Should Navigated to the HomePage")
	public void user_should_navigated_to_the_home_page() {
		String HomePage = driver.getTitle();
		System.out.println(HomePage);
	}

	@When("Enter UserName in Edit Box")
	public void enter_user_name_in_edit_box() {
		driver.findElement(By.id("username")).sendKeys("student");  
	}

	@When("Incorrect Password in Edit Box")
	public void incorrect_password_in_edit_box() {
		driver.findElement(By.id("password")).sendKeys("Password1234");
	   
	}

	@When("Click On Design Login Push Button")
	public void click_on_login_push_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	     
	}

	@Then("Error Message displayed Invalid")
	public void message_displayed_login_successfully() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}

}
