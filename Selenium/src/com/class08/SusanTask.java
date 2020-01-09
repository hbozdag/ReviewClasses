package com.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class SusanTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*Table headers and rows verification

Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name and credit card info
Verify updated customers name and credit card number is displayed in table
Close browser
*/

		setUp("chrome", Constants.TesterSiteUrl);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();


//		String expectedValue="Susan McLaren";
//		
//		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
//		for(int i=1; i<rows.size(); i++) {
//			String rowText=rows.get(i-1).getText();
//			System.out.println(rowText);
//			if(rowText.contains(expectedValue)) {
//				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
//			
//			}
//		}

		Thread.sleep(4000);
		driver.quit();







	}

}
