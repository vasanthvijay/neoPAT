package Admin;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Reusability.*;
import Admin_Elements.Invite_Page;

public class Single_Invite extends Launch_Browser{
	
	@Test
	public static void Student_Single_Invite() throws Exception {
		
		PageFactory.initElements(driver, Invite_Page.class);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(693,220)", "");
		
		Invite_Page.Select_Campus.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Campus_list,"Coimbatore Campus");
		
		Invite_Page.Select_batch.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Batch_list,"Coimbatore Campus - 2021");
				
		Invite_Page.Select_Degree_and_Spec.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Degree_Spec_list,"Coimbatore Campus - BE- CSE");
		
		Invite_Page.Select_Department.click();
		Reusability.Dropdown_Selection.Dropdown_selection(Invite_Page.Department_list,"Coimbatore Campus - CSE");
		
		js.executeScript("window.scrollBy(800,624)", "");
		
		Invite_Page.Create_mail_id.click();
		String val=Reusability.single_mail_id_generator.generate_name();
		System.out.println(val);
		Invite_Page.Create_mail_id.sendKeys(val);
	    
		
		
		Reusability.JS_Executor.ClickElement(driver, Invite_Page.Invite_btn);
		Thread.sleep(1000);
		//Reusability.JS_Executor.scrollPageUP(driver);
		 
		 TakesScreenshot scrShot =(TakesScreenshot)driver;
		 File Src=scrShot.getScreenshotAs(OutputType.FILE);
		 File trg=new File(".\\screenshots\\invite.png");
		 FileUtils.copyFile(Src, trg);
		 
		//Thread.sleep(3000);
	}
}
