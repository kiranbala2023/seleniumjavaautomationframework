package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    private AndroidDriver driver;

    private final By welcomeMessage = By.id("com.example:id/welcome");
    private final By profileIcon = By.id("com.example:id/profile");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public boolean isWelcomeMessageDisplayed() {
        return driver.findElements(welcomeMessage).size() > 0;
    }

    public void goToProfile() {
        driver.findElement(profileIcon).click();
    }
}
