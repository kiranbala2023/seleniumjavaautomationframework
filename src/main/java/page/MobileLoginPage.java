package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MobileLoginPage {
    private AndroidDriver driver;

    private final By usernameField = By.id("com.example:id/username");
    private final By passwordField = By.id("com.example:id/password");
    private final By loginButton = By.id("com.example:id/login");

    public MobileLoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    
    public boolean isLoginButtonVisible() {
        return driver.findElements(loginButton).size() > 0;
    }
}