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

public class Academy {

	private WebDriver driver;
	public static final String CHROME_PATH = "/Users/elenaskorodilo/Documents/chromedriver";
	public static final String CHROME = "webdriver.chrome.driver";

	@Test
	public void checkAmount() {

		driver.get("https://www.it-academy.by/");

		Actions action = new Actions(driver);
		WebElement learn = driver.findElement(By.xpath("//div/ul/li/a/span[contains(text(), 'Обучение')]"));
		action.moveToElement(learn).build().perform();

		WebElement menu = driver
				.findElement(By.xpath("//ul[@class=\"panel-section-list panel-section-list_columns\"]"));

		List<WebElement> points = menu.findElements(By.xpath("//a//span[@class=\"list-item__category-header\"]"));
		System.out.println(points.size());
		Assert.assertEquals(11, points.size());
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
