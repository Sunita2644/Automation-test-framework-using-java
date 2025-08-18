package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        try {
        	loginPage.login("standard_user", "secret_sauce");
        	String Actual_text = driver.findElement(By.xpath("//span[@class=\"title\"]")).getText();
        	String expected_text = "Products";
        	Assert.assertEquals(Actual_text,expected_text, "Login failed");
        }
        catch (Exception e){
        	System.out.println(e);
        }
    }

}
