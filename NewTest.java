package by.htp.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {

	private WebDriver driver;
	public static final String CHROME_PATH = "/Users/elenaskorodilo/Documents/chromedriver";
	public static final String CHROME = "webdriver.chrome.driver";

	@Test
	public void prepare() {

		driver.get("https://www.it-academy.by/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
			WebElement learn = driver.findElement(By.xpath("//div/ul/li/a/span[contains(text(), 'Обучение')]"));
			action.moveToElement(learn).build().perform();
			
			WebElement title = learn.findElement(By.xpath("/html/body/div[1]/main/section[1]/section[1]/div/ul/li[10]/a/span"));
			title.click();
			List<WebElement> x = driver.findElements(By.xpath("//div[@class =\"course-item-block\"]"));
		
			Assert.assertTrue(x.size()>0);
			System.out.println(x.size());
			
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
