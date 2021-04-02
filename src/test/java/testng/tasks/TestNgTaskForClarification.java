package testng.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTaskForClarification {
	
//	@Test(groups="smoke")
//	private void kinderJoy() {
//		System.out.println("kinderJoy chocki");
//	}
//
//	@Test(groups="reg",dependsOnGroups="smoke")
//	private void geams()  {
//		System.out.println("geams chocki");
//	}
//	@Test(groups="sanity",dependsOnGroups="reg")
//	private void cadberry() {
//		System.out.println("kids cadberry");
//		Assert.assertTrue(false, "execution getting fails");
//	}
//	@Test(groups="smoke")
//	private void chockychocky() {
//		System.out.println("chockychocky chocki");
//	}
//	@Test(groups="sanity")
//	private void lollypop() {
//		System.out.println("lollypop chocki");
	
//	}
	
	//how will you use cross browser executions
//	@Parameters({"browser"})
//	@Test
//	public void crossBrowserExecution(String s) {
//		if (s.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver =  new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.get("https://www.mwave.com.au/");
//			}
//		else if (s.equalsIgnoreCase("ff")) {
//			WebDriverManager.firefoxdriver().setup();
//			WebDriver driver = new FirefoxDriver();
//			driver.get("https://www.mwave.com.au/");
//			}
//		else if (s.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			WebDriver driver = new EdgeDriver();
//			driver.get("https://www.mwave.com.au/");
//			}
//		else {
//			System.out.println("there is wont have a browser of that operation ");
//		}
//
//	}



//to print common value in dropdown
	@Test
	
	public void Web() throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=apoxymedia&affExtParam1=couponvita-29-nght&affExtParam2=428e4d4b31f1f9871abe7c340716cc9b&gclid=Cj0KCQjwl9GCBhDvARIsAFunhsmwcd-Q01RavmFAJdyGS4jNZG3BxowZBVrYWA-3Hv-wnP_K9nbMYhkaAqDtEALw_wcB&affExtParam2=428e4d4b31f1f9871abe7c340716cc9b");		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement findElement = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(findElement).perform();
		List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
		System.out.println(findElements);
		List<Object> li =new ArrayList<Object>();
		li.addAll(findElements);
		
		
		
		findElement.click();
		String cssValue = findElement.getCssValue("color");
		System.out.println(cssValue);
	}





















}

