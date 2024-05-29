package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutBtn;
	
	public void enterEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnSignInBtn() {
		loginBtn.click();
	}
	
	public void clickOnLogOutBtn() {
		logoutBtn.click();
	}
	
	
	
}
