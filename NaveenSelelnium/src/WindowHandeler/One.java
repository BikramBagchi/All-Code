package WindowHandeler;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {


		System.out.println("WindowPopup");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
       /*
          driver.getWindowHandles() return a set of window handles and is mainly 
          used to get the window handle of all the current windows. ... 
          "getWindowHandle()" method will provide a unique identifier(handle) of 
          the current browser window which is being controlled by the WebDriver.
        */
		
		// This will retuen us all the windows uniq id in set 
		Set<String> Window_ID = driver.getWindowHandles();
		
		System.out.println(Window_ID);
		
		//Set does't store by indexing so to get the next value we will use IteratorI
		Iterator<String> Window_ID_Itrator = Window_ID.iterator();
		
		System.out.println(Window_ID_Itrator);
		
		//At stat Itrator on the start linr after the method .next it come to first element
		String Parent_Window_ID = Window_ID_Itrator.next();
		
		//To switch to the particular window by id
		driver.switchTo().window(Parent_Window_ID);
		
		System.out.println(driver.getCurrentUrl());
		
		String Child_Window_ID = Window_ID_Itrator.next();
		
		//To switch to the particular window by id				
		driver.switchTo().window(Child_Window_ID);
		
		System.out.println(driver.getCurrentUrl());
		
		//It will close the current window and driver.quite will close all the window
		
		driver.close();
		
		driver.switchTo().window(Parent_Window_ID);
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #2')]")).click();
		
		Set<String> NewWindowHandel = driver.getWindowHandles();
		
		System.out.println(NewWindowHandel);
		
		
		Iterator<String> NewWindowHandel_Iterator = NewWindowHandel.iterator();
		
		String NewWindowHandel_Iterator_Parent = NewWindowHandel_Iterator.next();
		
		/*
		 * driver.switchTo().window(NewWindowHandel_Iterator_Parent);
		 * 
		 * System.out.println("Parent URL " +driver.getCurrentUrl());
		 */
		
		String NewWindowHandel_Iterator_Child = NewWindowHandel_Iterator.next();
		
		driver.switchTo().window(NewWindowHandel_Iterator_Child);
		
		System.out.println("Child URL " +driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(NewWindowHandel_Iterator_Parent);
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		Set<String> Windowpopup4 = driver.getWindowHandles();
		
		System.out.println(Windowpopup4);
		
		Iterator<String> Windowpopup4_Iterator = Windowpopup4.iterator();
		
		String Windowpopup4_Iterator_WindowName_Parent = Windowpopup4_Iterator.next();
		
		String Windowpopup4_Iterator_WindowName_Child = Windowpopup4_Iterator.next();
		
		driver.switchTo().window(Windowpopup4_Iterator_WindowName_Child);
		
		driver.manage().window().maximize();
		
		System.out.println("Windowpopup4 Child URL " + driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(Windowpopup4_Iterator_WindowName_Parent);
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #4')]")).click();
		
		Set<String> tt = driver.getWindowHandles();
		
		System.out.println(tt);
		
		Iterator<String> tt1 = tt.iterator();
		
		String tt_parent = tt1.next();
		
		String tt_Child = tt1.next();
	
		driver.switchTo().window(tt_Child);
		
		System.out.println("tt "+driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(tt_parent);
		
		System.out.println("tt_parent "+driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
