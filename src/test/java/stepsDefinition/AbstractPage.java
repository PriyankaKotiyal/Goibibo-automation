package stepsDefinition;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

	WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage navigateToGoibibo() throws InterruptedException {
	
		driver.get("http://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		return new LandingPage(driver);
	
	}
		
}
