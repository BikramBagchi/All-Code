package SikuliUsingMethod;


import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.RunTime;
import org.sikuli.script.Screen;
import SeleniumUtilPakage.SeleniumUtilClass;
import UtilPakage.SeleniumUtilMethod;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableWorkbook;




public class MR {

	WebDriver driver;

	// Click method via Sikuli
	public void SikuliClick(String screenshotname) throws Exception {
		MR MRReference = new MR();

		Screen screen = new Screen();
		Pattern pattern = new Pattern("./" + screenshotname + ".png");
		MRReference.SikuliFind(screenshotname);
		MRReference.SikuliExist(screenshotname);
		screen.wait(pattern, 5000);
		screen.click(pattern);
	}

	// ===============================================================================
	// Double Click method via Sikuli
	public void SikuliDoubleClick(String screenshotname) throws Exception {
		MR MRReference = new MR();

		Screen screen = new Screen();
		Pattern pattern = new Pattern("./" + screenshotname + ".png");
		MRReference.SikuliFind(screenshotname);
		MRReference.SikuliExist(screenshotname);
		screen.wait(pattern, 5000);
		screen.doubleClick(screenshotname);
	}

	// ===============================================================================
	// Hover method via Sikuli
	public void SikuliHover(String screenshotname) throws Exception {
		MR MRReference = new MR();

		Screen screen = new Screen();
		Pattern pattern = new Pattern("./" + screenshotname + ".png");
		MRReference.SikuliFind(screenshotname);
		MRReference.SikuliExist(screenshotname);
		screen.wait(pattern, 5000);
		screen.hover(screenshotname);
	}

	// ===============================================================================
	// Type Method via Sikuli
	public void SikuliType(String screenshotname, String Value) throws Exception {
		MR MRReference = new MR();
		Screen screen = new Screen();
		Pattern pattern = new Pattern("./" + screenshotname + ".png");
		MRReference.SikuliFind(screenshotname);
		MRReference.SikuliExist(screenshotname);
		screen.wait(pattern, 5000);
		screen.type(pattern, Value);
	}

	// ==============================================================================
	// Method for getting current title
	public static String CurrentURL(WebDriver t) {
		String CurrentURL = t.getCurrentUrl();

		return CurrentURL;
	}

	// ==============================================================================
	// Method to find
	public void SikuliFind(String sn) throws Exception {
		Screen screen = new Screen();
		Match a = screen.find("./" + sn + ".png");

		if (a != null) {
			System.out.println("Find");
		}

		else

		{
			System.out.println("FailToFind");
		}

	}

	// ================================================================================
	// Method for Exists
	public void SikuliExist(String sn) {
		Screen screen = new Screen();
		Match a = screen.exists("./" + sn + ".png");

		if (a != null) {
			System.out.println("eXISTs");
		} else

		{
			System.out.println("nOTeXISTs");
		}
	}

	// ==============================================================================

	// ===============================================================================
	// Method for login in MercuryTuors
	public void MercuryTuors() throws Exception {
		System.out.println("MercuryTuors login using Sikuli");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilClass.URL(driver, "http://newtours.demoaut.com/", 10);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		MR MRReference = new MR();

		MRReference.SikuliFind("./ScreenshotForSikuli\\UserName");

		MRReference.SikuliExist("./ScreenshotForSikuli\\UserName");

		MRReference.SikuliType("ScreenshotForSikuli\\UserName", SeleniumUtilMethod.GetPropertyKey("MercuryUserName"));

		MRReference.SikuliType("ScreenshotForSikuli\\Untitled",  SeleniumUtilMethod.GetPropertyKey("MercuryPassword"));

		MRReference.SikuliClick("ScreenshotForSikuli\\login");

		System.out.println("Current URL == " + MR.CurrentURL(driver));

		String ExpectedTitle = "Sign-on: Mercury Tours";

		String ActualTitle = driver.getTitle();

		System.out.println(ActualTitle);

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not Matched");
		}

		MRReference.SikuliHover("ScreenshotForSikuli\\Hover");

		driver.close();
		System.out.println("======================================================");

	}

	// ==============================================================================
	// Facebook Login using Sikuli
	public void FacebookLoginBySikuli() throws Exception {
		System.out.println("Facebook Loging using Sikuli");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilMethod.URL(driver, "https://www.facebook.com/", 10);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

		MR MRReference = new MR();

		MRReference.SikuliType("Facebook\\Untitled", SeleniumUtilMethod.GetPropertyKey("FacebookUserName"));

		MRReference.SikuliType("Facebook\\Password", SeleniumUtilMethod.GetPropertyKey("FacebookPassword"));

		MRReference.SikuliClick("Facebook\\In");

		driver.close();

		System.out.println("======================================================");
	}

	// ==============================================================================
	// OrangeHRM Login using Sikuli
	public void OrangeHRMloginUsingSikuli() throws Exception {
		System.out.println("OrangeHRM Loging using Sikuli");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilMethod.URL(driver, "https://opensource-demo.orangehrmlive.com/", 10);
	//	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();

		MR MRReference = new MR();

		MRReference.SikuliType("OrangeHRM\\OrangeUserNme",SeleniumUtilMethod.GetPropertyKey("OrangeHRMUserName"));
		MRReference.SikuliType("OrangeHRM\\Password", SeleniumUtilMethod.GetPropertyKey("OrangeHRMPassword"));
		MRReference.SikuliClick("OrangeHRM\\login button");

		String CurrentTilte = MRReference.CurrentURL(driver);

		String ExpectedTitle = "OrangeHRM";

		String ActualTitle = driver.getTitle();

		System.out.println(ActualTitle);

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not Matched");
		}

		driver.close();
		System.out.println("======================================================");

	}

	// ==============================================================================
	// Flipkart Login using Sikuli
	public void FlipkartloginUsingSikuli() throws Exception {
		System.out.println("OrangeHRM Loging using Sikuli");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		SeleniumUtilMethod.URL(driver, "https://www.flipkart.com/?gclid=EAIaIQobChMIloSbiI2E4gIVichkCh2img4wEAAYASAAEgKinfD_BwE&ef_id=EAIaIQobChMIloSbiI2E4gIVichkCh2img4wEAAYASAAEgKinfD_BwE:G:s&s_kwcid=AL!739!3!260704327909!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog", 10);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

		MR MRReference = new MR();
		MRReference.SikuliType("Flipkart\\UserName", SeleniumUtilMethod.GetPropertyKey("FlipkartUsername"));
		MRReference.SikuliType("Flipkart\\Password", SeleniumUtilMethod.GetPropertyKey("FlipkartPassword"));
		MRReference.SikuliClick("Flipkart\\login");

		System.out.println(MRReference.CurrentURL(driver));

		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		String ActualTitle = driver.getTitle();

		System.out.println(ActualTitle);

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title not Matched");
		}

		driver.close();
		System.out.println("======================================================");
	}

	// ==============================================================================
	// YouTube handle using Sikuli

	public void YouTubehandleusingSikuli() throws Exception {
		System.out.println("YouTube handle using Sikuli");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilMethod.URL(driver, "https://www.youtube.com/", 10);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		MR MRReference = new MR();
		MRReference.SikuliType("YouTube\\Find", "Zam Zam Kolkata");
		MRReference.SikuliClick("YouTube\\Place name");
		
		MRReference.SikuliClick("YouTube\\Placephotoclick");
					
		MRReference.SikuliDoubleClick("YouTube\\settingorg");

		driver.close();
		System.out.println("======================================================");

	}

	// ==============================================================================
	// Method for login in MercuryTuors bu robot

	public void OrangeHRMloginUsingRobot() throws Exception {
		System.out.println("OrangeHRM Loging using Robot");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilMethod.URL(driver, "https://opensource-demo.orangehrmlive.com", 10);
	   // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	//	driver.manage().window().maximize();

		Robot tt = new Robot();

		tt.keyPress(KeyEvent.VK_TAB);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_TAB);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		tt.keyPress(KeyEvent.VK_A);

     	tt.delay(1000);
        	
     	tt.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		Thread.sleep(1000);
				 
		tt.keyPress(KeyEvent.VK_D);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_M);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_I);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_D);
		
		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_M);
		
		Thread.sleep(1000);
		
		tt.keyPress(KeyEvent.VK_I);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_N);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_1);

		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_2);
		
		Thread.sleep(1000);

		tt.keyPress(KeyEvent.VK_3);
		
		Thread.sleep(1000);
		
		tt.keyPress(KeyEvent.VK_TAB);

		Thread.sleep(1000);
		
	    tt.keyPress(KeyEvent.VK_ENTER);
	    
		System.out.println("Done");
		
		driver.close();
		
		System.out.println("======================================================");
	}
	
	// ==============================================================================
   //  Method for login in Flipkart by robot

	public void FlipkartloginUsingRobot() throws Exception 
	{
		System.out.println("OrangeHRM Loging using Robot");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	  	SeleniumUtilMethod.URL(driver, "https://www.flipkart.com/?gclid=EAIaIQobChMIloSbiI2E4gIVichkCh2img4wEAAYASAAEgKinfD_BwE&ef_id=EAIaIQobChMIloSbiI2E4gIVichkCh2img4wEAAYASAAEgKinfD_BwE:G:s&s_kwcid=AL!739!3!260704327909!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog", 10);
		    //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
				
			Robot tt = new Robot();
			
			driver.findElement(By.xpath("//input[@class=\"_2zrpKA\"]")).sendKeys("");

			Thread.sleep(1000);
			
			tt.keyPress(KeyEvent.VK_9);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_7);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_4);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_8);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_8);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_3);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_5);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_1);
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_7);

			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_5);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_2);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_5);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_2);
            
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_6);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_9);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_3);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_4);
			
			Thread.sleep(1000);

			tt.keyPress(KeyEvent.VK_8);
			
			Thread.sleep(1000);
			
			tt.keyPress(KeyEvent.VK_TAB);

			Thread.sleep(1000);
			
		    tt.keyPress(KeyEvent.VK_ENTER);
		
		  driver.close();
		  System.out.println("======================================================");
		 
		}
	
	// ==============================================================================
		// Facebook Login using Robot
		public void FacebookLoginByRobot() throws Exception {
		System.out.println("Facebook Loging using Robot");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		SeleniumUtilMethod.URL(driver, "https://www.facebook.com/", 10);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Robot tt = new Robot();
		
		for(int i = 0 ; i<=61;i++)
		{
             Thread.sleep(1000);
			
			tt.keyPress(KeyEvent.VK_TAB);
		}
		
				  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_9);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_7);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_4);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_8);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_8);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_3);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_5);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_1);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_7);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_5);
		  
		 
		
		  Thread.sleep(1000);
		 
		  tt.keyPress(KeyEvent.VK_TAB);
		 
		   Thread.sleep(1000);
		 
		   tt.keyPress(KeyEvent.VK_L);
		 		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_A);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_L);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_T);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_U);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_B);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_A);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_G);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_C);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_H);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_I);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_2);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_5);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_2);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_6);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_9);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_3);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_4);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_8);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_TAB);
		  
		  Thread.sleep(1000);
		  
		  tt.keyPress(KeyEvent.VK_ENTER);
		 
		    driver.close();
		   
			 
			System.out.println("======================================================");
	
		}

		// ==============================================================================
		// Mercury Login using Robot
  
		public void MercuryTuorsloginByRobot() throws Exception 
		{
			System.out.println("MercuryTuors login using Robot");
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			SeleniumUtilMethod.URL(driver, "http://newtours.demoaut.com/", 10);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            
            
			Robot r = new Robot();
			
			for (int i=1 ;i<=14;i++)
			{
				Thread.sleep(5000); 
			    r.keyPress(KeyEvent.VK_TAB);
			    
			    if(i==12)
			    {
			    	r.keyPress(KeyEvent.VK_B);
			    	r.keyPress(KeyEvent.VK_I);
			    	r.keyPress(KeyEvent.VK_K);
			    	r.keyPress(KeyEvent.VK_R);
			    	r.keyPress(KeyEvent.VK_A);
			    	r.keyPress(KeyEvent.VK_M);
			    	
			    }
			    else if (i == 13)
			    {
			    	r.keyPress(KeyEvent.VK_2);
			    	r.keyPress(KeyEvent.VK_5);
			    	r.keyPress(KeyEvent.VK_2);
			    	r.keyPress(KeyEvent.VK_6);
			    	r.keyPress(KeyEvent.VK_9);
			    	r.keyPress(KeyEvent.VK_3);
			    	r.keyPress(KeyEvent.VK_4);
			    	r.keyPress(KeyEvent.VK_8);
			    	
			    	
			    }
			    
			    else if(i==14)
			    {
			    	r.keyPress(KeyEvent.VK_ENTER);
			    	
			    	
			    }
			
			
			}
			
		
			
			  driver.close();
			  
			  
			  System.out.println("======================================================");
			 

		}


    public void Uploadedphotobyscreenshot() throws Exception
    {
    	 System.out.println("Uploaded photo using AutoIt for all three scenarios");
    	
		 MR.Uploadedphotobyscreenshot1();
		 Thread.sleep(5000);
		 MR.Uploadedphotobyscreenshot2();
		 Thread.sleep(5000);
		 MR.Uploadedphotobyscreenshot3();
		 
		 System.out.println("======================================================");
		 
			
    }
    
      public static void Uploadedphotobyscreenshot1() throws Exception
      
      {
    	  System.out.println("Uploaded photo using AutoIt for imgbb.com");
    	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
  		   WebDriver driver = new ChromeDriver();
  		
  		  SeleniumUtilMethod.URL(driver, "https://imgbb.com/", 10);
  		  driver.findElement(By.xpath("//a[contains(text(),'Start uploading')]")).click(); 
  		  Thread.sleep(5000);
  		  Runtime.getRuntime().exec("./AutoItexeFile/imgbb22.exe");
  		  Thread.sleep(20000);
  		  driver.quit();
  		  
  		 System.out.println("======================================================");
      }
      
    public static void Uploadedphotobyscreenshot2() throws Exception
      
      {
    	 System.out.println("Uploaded photo using AutoIt for upload.photobox.com"); 
    	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
    	 SeleniumUtilMethod.URL(driver, "https://upload.photobox.com/en/", 10);
		  
		  MR MRRef = new MR();
		  
		  MRRef.SikuliClick("ScreenshotForSikuli\\Computer");
		  
		  driver.findElement(By.xpath("//button[@id=\"button_desktop\"]")).click();
		  
		  Runtime.getRuntime().exec("./AutoItexeFile/upload.photobox.exe");
		  
		  Thread.sleep(20000);
		  
		  driver.quit();
		  
		  System.out.println("======================================================");
      }
    
    public static void Uploadedphotobyscreenshot3() throws Exception
    
    {
    	System.out.println("Uploaded photo using AutoIt for uploadimgur.com");
    	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		  SeleniumUtilMethod.URL(driver, "https://imgur.com/upload", 10);
		  driver.findElement(By.xpath("//label")).click();
		  Runtime.getRuntime().exec("./AutoItexeFile/upload.photobox.exe");
		  Thread.sleep(20000); 
		  driver.quit();
		  
		  System.out.println("======================================================");
    }
     
    public void DataDrivenOrange() throws Exception
    {
          System.out.println("Data Driven Testing ");
    	
    	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		SeleniumUtilMethod.URL(driver, "https://opensource-demo.orangehrmlive.com/", 20);
		File file = new File("D:/jxlcall.xls");
		FileInputStream fin = new FileInputStream(file);
		Workbook sheet = Workbook.getWorkbook(fin);
		Sheet dd = sheet.getSheet("Login");
		int row_count = dd.getRows();
		System.out.println(row_count);
		for(int i=1 ; i<=row_count ; i++)
		{
		String UserName = dd.getCell(1, i).getContents();
		String Password = dd.getCell(2, i).getContents();
		System.out.println(UserName);
		Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys(UserName);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys(Password);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
            	    	       
    	String CurrentURl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    	
    	String UrlGet = driver.getCurrentUrl();
    	System.out.println(UrlGet);
    
    	if(CurrentURl.equals(UrlGet))
    	{
    		System.out.println("Pass");
    		
    		Thread.sleep(5000);
        	
        	driver.findElement(By.xpath("//a[@id=\"welcome\"]")).click();
        	
        	Thread.sleep(5000);
        	
        	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    	
    	
		}   
		
		 System.out.println("======================================================");
    }
    
    
}

