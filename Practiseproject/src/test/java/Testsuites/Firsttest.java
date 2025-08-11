package Testsuites;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Baseclass;


class Firsttest extends Baseclass
{
	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	
	
@Test
public void navigatetosite() throws IOException {
	

	launchurl();
	
}

}






