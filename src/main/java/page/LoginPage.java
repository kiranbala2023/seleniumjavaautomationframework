package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By userNameTextBox = By.xpath("//*[@id=\"Email\"]");
	private By passwordTextBox = By.xpath("//*[@id=\"Password\"]");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver ;
		
	}
	public void enterUserName(String username) {
		driver.findElement(userNameTextBox).clear();
		driver.findElement(userNameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
}
