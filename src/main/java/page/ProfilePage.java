package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProfilePage {
    private AndroidDriver driver;

    private final By profileHeader = By.id("com.example:id/profileHeader");
    private final By logoutButton = By.id("com.example:id/logout");

    public ProfilePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public boolean isProfileHeaderVisible() {
        return driver.findElements(profileHeader).size() > 0;
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}
