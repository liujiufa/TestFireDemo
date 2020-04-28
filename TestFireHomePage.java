package example.MyPOMExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFireHomePage {

	

		WebDriver driver;
		@FindBy(xpath="G:/chromedriver.exe")
		WebElement homePage=driver.findElement(By.cssSelector("#_ctl0__ctl0_Content_Main_promo > table > tbody > tr:nth-child(1) > td > h2"));
		
		public TestFireHomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public String getHomePage(){
			 return	homePage.getText();
			}
}
