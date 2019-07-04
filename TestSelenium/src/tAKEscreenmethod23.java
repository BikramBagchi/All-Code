import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class tAKEscreenmethod23 {
	
	public static void screenshot(WebDriver t , String Screenshotname) throws IOException
	{
        TakesScreenshot tk = (TakesScreenshot)t;
		
		File org = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("./Screenshot/"+Screenshotname+".png");
		
		FileUtils.copyFile(org, des);
		
	}

}
