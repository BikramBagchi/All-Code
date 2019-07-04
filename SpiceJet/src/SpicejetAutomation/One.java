package SpicejetAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) throws Exception {

		MR MRref = new MR();
		

		MRref.BookFlightOneWay();
	}

}
