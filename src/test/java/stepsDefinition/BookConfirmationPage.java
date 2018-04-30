package stepsDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookConfirmationPage extends AbstractPage{

	public BookConfirmationPage(WebDriver driver) {
		super(driver);
	}
			public BookConfirmationPage checkPayment() throws InterruptedException {
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				//WebElement element = driver.findElement(By.xpath("//button[text()='Proceed to Payment']"));
				
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				
				Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Proceed to Payment']")));
				Thread.sleep(3000);
				
				return new BookConfirmationPage(driver);
			}
			
			
				public BookConfirmationPage checkTotal() throws InterruptedException {
				

				String element = driver.findElement(By.xpath("//*[text()='Total Amount']")).getText();
				
				
				Assert.assertTrue("Total Amount present", element.equals("Total Amount"));
				
				return new BookConfirmationPage(driver);
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
