package TestFirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium1 {

	public static void main(String[] args) throws InterruptedException {
		TestSelenium1 obj = new TestSelenium1();
		
		System.out.println("First Coide");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("bikrambagchi1994@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("laltubagchi25269348");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"z0\"]//div")).click();
		driver.findElement(By.xpath("//textarea[@name ='to']")).sendKeys("bikrambagchi1994@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Subject\"]")).sendKeys("TestMailviaSelenium");
		driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("TestMailViaAutomation to create a gmail");
		driver.findElement(By.xpath("//div[contains(@class,\"QT aaA aMZ\")]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search emojis')]")).sendKeys("happy");
        Thread.sleep(5000); 
		driver.findElement(By.xpath("//button[@title=\"Show object emoticons\"]")).click();
		driver.findElement(By.xpath("//button[contains(@title,\"Show nature emoticons\")]")).click();
		driver.findElement(By.xpath("//button[contains(@title,\"Show transportation emoticons\")]")).click();
		driver.findElement(By.xpath("//button[contains(@title,\"Show symbol emoticons\")]")).click();
		
		

	}

	
}
