package SeleniumUtilPakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SeleniumUtilClass

{

  public static void URL(WebDriver d , String url , int pageloadtime)
  {
	  d.get(url);
      d.manage().timeouts().pageLoadTimeout(pageloadtime, TimeUnit.SECONDS);
      d.manage().window().maximize();
	  
  }

}
