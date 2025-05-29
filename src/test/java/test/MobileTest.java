package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.MobileLoginPage;
import page.ProfilePage;

public class MobileTest extends BaseTest {

    @Test
    public void testFullLoginFlow() {
        // Step 1: Launch app and login
    	
        MobileLoginPage mobileLoginPage = new MobileLoginPage(driver);
        mobileLoginPage.login("testuser", "password123");

        // Step 2: Validate login success
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed(), "Login failed or welcome message not found.");

        // Step 3: Navigate to profile
        homePage.goToProfile();

        // Step 4: Verify profile screen
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.isProfileHeaderVisible(), "Profile screen is not visible.");

        // Step 5: Logout
        profilePage.logout();

        // Step 6: Verify user is back on login screen
        Assert.assertTrue(mobileLoginPage.isLoginButtonVisible(), "Logout failed, user is not back on login screen.");
    }
}