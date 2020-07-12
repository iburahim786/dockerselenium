package docker.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testappchrome {
	
	@Test
	public void dcokertestff() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName(BrowserType.CHROME);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://164.99.185.185:4545/wd/hub"), dc);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Mohamed Iburahimsha");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
