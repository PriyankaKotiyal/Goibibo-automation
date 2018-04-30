package Testgoibibo.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmationPage {
	WebDriver driver;

	public BookConfirmationPage(WebDriver driver) {
		
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	  @FindBy(how=How.XPATH,using = "//*[text()='Total Amount']") 
	   WebElement total;
	
	
			public void checkPayment() throws InterruptedException {
				
				  JavascriptExecutor js = (JavascriptExecutor)driver;
				
				//WebElement element = driver.findElement(By.xpath("//button[text()='Proceed to Payment']"));
				
				   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				   Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Proceed to Payment']")));
				
				   Thread.sleep(3000);
		
			}
			
				public void checkTotal() {
				
				  String element = total.getText();
				
				  Assert.assertTrue("Total Amount not present", element.equals("Total Amount"));
				
				
			}
			
			private boolean isElementPresent(By by) {
				
				try {
			      driver.findElement(by);
			      return true;
			    } catch (NoSuchElementException e) {
			      return false;
			    }
				
			}
}
