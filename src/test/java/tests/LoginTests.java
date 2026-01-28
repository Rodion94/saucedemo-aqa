package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests extends BaseTest {

    @Test
    void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.isPageOpened());
    }

    @Test
    void loginWithWrongPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "wrong_password");

        assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
    }

    @Test
    void lockedOutUserLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");

        assertTrue(loginPage.getErrorMessage().contains("locked out"));
    }

    @Test
    void loginWithEmptyFieldsTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");

        assertTrue(loginPage.getErrorMessage().contains("Username is required"));
    }

    @Test
    void performanceGlitchUserLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("performance_glitch_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.isPageOpened());
    }
}
