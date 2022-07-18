package Reusability;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {

	public static void Take_Screeshot(WebDriver drive) throws IOException {
	File src=	((TakesScreenshot) drive).getScreenshotAs(OutputType.FILE);
    File trg = new File("D:\\VASANTH\\neopat\\ai.neopat\\screenshots\\invite.png");
    FileUtils.copyDirectory(src, trg);
    
	}
}
