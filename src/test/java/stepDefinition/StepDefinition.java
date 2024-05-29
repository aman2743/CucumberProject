package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class StepDefinition {
	
	public WebDriver driver;
	public LoginPage loginPage;
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		loginPage=new LoginPage(driver);
	 
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
      driver.get(url);
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String email, String pwd) {

	   loginPage.enterEmail(email);
	   loginPage.enterPassword(pwd);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnSignInBtn();

	}

	@Then("Title should be {string}")
	public void title_should_be(String expectedTitle) {
		boolean b=false;
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			b=true;
		}
      Assert.assertTrue(b);
		
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() {
		loginPage.clickOnLogOutBtn();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	driver.close();
	}
}
