package example.MyPOMExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {
	
		WebDriver driver;
		@FindBy(name="uid")
		WebElement userName;
		
		@FindBy(name="passw")
		WebElement password;
		
		@FindBy(name="btnSubmit")
		WebElement login;
		
		public TestLogin(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void setUserName(String strUserName){
			userName.sendKeys(strUserName);
			
		}
		
		//Set password in password textbox
		public void setPassword(String strPassword){
		password.sendKeys(strPassword);
		}
		
		//Click on login button
		public void clickLogin(){
				login.click();
		}
		public void loginToTestFire(String strUserName,String strPasword){
			//Fill user name
			this.setUserName(strUserName);
			//Fill password
			this.setPassword(strPasword);
			//Click Login button
			this.clickLogin();
					
		}
	}


