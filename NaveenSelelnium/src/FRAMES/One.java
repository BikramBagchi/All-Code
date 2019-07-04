package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		int Tag_List_Count = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(Tag_List_Count);
		
		WebElement IF1= driver.findElement(By.xpath("//iframe[@name=\"iframe1\"]"));
		
		driver.switchTo().frame(IF1); // this one is for switch to a particular frame
		
		driver.findElement(By.xpath("//input[@value=\"Female\"]")).click();
		
		//driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		driver.switchTo().defaultContent();//this one is use to come for default page
		
		//driver.switchTo().parentFrame(); this will also work
		
		WebElement IF2 = driver.findElement(By.xpath("//iframe[@name=\"iframe2\"]"));
		
		driver.switchTo().frame(IF2);// this one is for switch to a particular frame
		
	    Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		System.out.println("Why kabla");
		
		/*
		 What if we have nested frame then new have to do 
		 
		 driver.switchTo().frame(Parent); this one is for parent frames
		 
		 now we have to point to the frame inside the parent frames 
		 so we will do
		 
		 driver.switchTo().frame(Child);
		 
		 Again to move to parent frame we will do 
		 
		 driver.switchTo().parentFrame();
		 
		 */
		
		/*
		  What is the exact difference between between frames and iframes in selenium? 
		  IFrame is just an "internal frame". ... The IFrame is often used to insert 
		  content from another source,such as an advertisement, into a Web page. 
		  The <iframe> tag specifies an inline frame.
		 */
		
		/*
		 what is the difference between driver.switchTo().parentFrame();
		 and driver.switchTo().defaultContent();
		 
		 Scenario : When there are multiple frames and some of them are nested.

          iframeMain
          iframeParent
          iframechild

          Assume you are in ifrmaechild :

          When you do driver.switchTo().parentFrame(); : you will go to iframeParent .
          But when you do driver.switchTo().defaultContent(); : you will go to main HTML of page.
          Note that in this case you will not go to iframeMain .
		 
		 */
		
		
		
		

	

}

}
