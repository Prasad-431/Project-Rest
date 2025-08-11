package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Firstpage extends Baseclass{
	WebDriver driver;
public Firstpage(WebDriver driver)	{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	
	
}
public void navigatetourl()
{
	


}

}
