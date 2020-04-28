package example.MyPOMExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTestFire extends TestCase {
	WebDriver driver;
	TestLogin objLogin;
	TestFireHomePage objHomePage;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/index.jsp");
	}

	@Test(timeout = 0)
	public void test_Home_Page_Appear_Correct() {
		// Create Login Page object
		objLogin = new TestLogin(driver);
		objLogin.loginToTestFire("admin", "admin");
		objHomePage = new TestFireHomePage(driver);
		
		Assert.assertEquals(objHomePage
				.getHomePage(), "Congratulations!");
	}
}
