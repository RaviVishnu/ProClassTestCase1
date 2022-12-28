package org.bank;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcCust {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"H:\\Selenium\\Greens\\Workspace\\Selenium Day3 task\\Amazon\\Drssiver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
			
		//custId.switchTo.frame(mainFrameindex);
		
		WebElement frame1 = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Raja123");
						
		
	}

}
