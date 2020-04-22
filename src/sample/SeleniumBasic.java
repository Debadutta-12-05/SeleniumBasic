package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumBasic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.primevideo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("pv-nav-sign-in")).click();
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("9008205050");
		driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("kabab@1599");
		driver.findElement(By.id("signInSubmit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("img[src = 'https://images-eu.ssl-images-amazon.com/images/S/sgp-catalog-images/region_GLOBAL/nbcuniversal-9559-A30F-8454-018F-2E08-S_IN-Full-Image_GalleryCover-rw-RW-1516215309137._UR1920,1080_RI_SX356_FMjpg_.jpg']")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("span[class = 'Gpyvwj _18GlHj YUZveH']")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.close();
	
	}

}
