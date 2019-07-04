package Question1Answer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question25 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
		
		
		driver.navigate().to("https://www.google.com/");// by string
		
		driver.navigate().to("https://www.iplt20.com/");// by URL
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		/*
		 What is the difference between 
		 driver.navigate().to() and driver.get()
		 
		 driver.get() : It's used to go to the particular website , 
		 But it doesn't maintain the browser History and cookies so ,
		 we can't use forward and backward button , if we click on that
		 , page will not get schedule

           driver.navigate().to() : it's used to go to the particular website ,
            but it maintains the browser history and cookies, 
            so we can use forward and backward button to navigate
             between the pages during the coding of Testcase
		 
		 This is an important interview question 
		 
		 As of their is no difference between them but 
		 for   driver.get()  we have no maintain of 
		 browser History and cookies
		 
		 where as for  driver.navigate().to()  we have 
		 maintain of 
		 browser History and cookies
		 
		 that why we can do 
		 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 
		 */

		driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		
		
		
	}

}
