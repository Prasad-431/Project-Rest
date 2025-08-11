package Testsuites;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practisetest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.xpath("//div[@class='srcDestWrapper___bc5ef1']"));
		WebElement to = driver.findElement(By.xpath("(//div[@class='srcDestWrapper___bc5ef1'])[2]"));
		WebElement calander = driver.findElement(By.xpath("//*[@class='icon___1e68c6 icon icon-date_range']"));
		WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Search buses')]"));
		Actions act= new Actions(driver);
		act.moveToElement(from).sendKeys("Hyderabad").build().perform();
		//from.sendKeys("Hyderabad");
		act.moveToElement(to).sendKeys("Banglore").build().perform();
		//to.sendKeys("Banglore");
		act.moveToElement(calander).click().build().perform();
		search.click();

	}

	public void redbus() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.xpath("//div[contains(text(),'From')]"));
		WebElement to = driver.findElement(By.xpath("//div[contains(text(),'To')]"));
		WebElement calander = driver.findElement(By.xpath("//div[@class='dateWrapper___29a9c9']"));
		WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Search buses')]"));
		from.sendKeys("Hyderabad");
		to.sendKeys("Banglore");
		calander.sendKeys("17-07-2025");
		search.click();
	}
}