package sample;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Chromedriver {
	   
	   public static void main(String[] args) {
		   WebDriver driver = new FirefoxDriver();
		   driver.get("https://www.facebook.com/");
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  try {
			  FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\debadutta.nayak\\Documents\\Images"));
			  
		  }
}
   }

