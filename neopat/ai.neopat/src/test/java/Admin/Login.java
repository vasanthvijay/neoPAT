package Admin;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Admin_Elements.Admin_Login_page;

public class Login extends Launch_Browser{
	
	public static String login_url;
	public static String admin_page_url;
	
	
	@Test(priority = 0)
	public static void Admin_login_Credentials() throws IOException, InterruptedException {
		
		Reusability.JS_Executor.scrollPageDown(driver);
		
		Reusability.Read_Excel_Data.ReadData("C:\\Users\\HP\\Desktop\\vasanth\\Admin_Login_credentials.xlsx");
		
	}
	
	public static void Credentials(String uname,String pass) throws InterruptedException {
		
		PageFactory.initElements(driver, Admin_Login_page.class);
		Admin_Login_page.Email_text_box.clear();
		Admin_Login_page.password.clear();
		Admin_Login_page.Email_text_box.sendKeys(uname);
		Admin_Login_page.password.sendKeys(pass);
		Admin_Login_page.login_btn.click();	
		Thread.sleep(5000);
	}	
}
