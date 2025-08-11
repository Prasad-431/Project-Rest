package Objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	protected WebDriver driver;
	Properties prop= new Properties();

	
	public Properties loadpropertiesfile() throws IOException {
		String path = "C:\\Users\\lenovo\\Eswarworkspace77\\Practiseproject\\src\\main\\java\\Data\\Data.properties";
		FileReader fir = new FileReader(path);
		prop.load(fir);
		return prop;

	}

	public void launchurl() throws IOException {
	prop=	loadpropertiesfile();
		driver.get(prop.getProperty("Url"));
	}
	
	public void getscreenshot() throws IOException
	{
		TakesScreenshot scrshot=((TakesScreenshot) driver);
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\lenovo\\Eswarworkspace77\\Practiseproject\\screenshots");
		FileUtils.copyFile(srcfile, dest);
		
		
	}
}
