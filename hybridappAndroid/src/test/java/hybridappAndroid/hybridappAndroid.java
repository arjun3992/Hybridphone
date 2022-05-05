package hybridappAndroid;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class hybridappAndroid extends HybApp {
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException{
		
		driver= hybrid();
		Thread.sleep(3000);
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("shyam");
		Thread.sleep(3000);
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		Thread.sleep(3000);
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		Thread.sleep(3000);
		//driver.findElementById("com.androidsample.generalstore:id/productAddCart").click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		//driver.findElementById("com.androidsample.generalstore:id/productAddCart").click();
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new Uiselector().textMatches(\"PG 3\"))"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\"))"));
		
		
		//check how many product is listed
		
/*		int namecount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<namecount;i++)
		{
			String productName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(productName.equalsIgnoreCase("PG 3"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
			
		}*/

   driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
   Thread.sleep(3000);
   String Amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
   
   //this will remove the first character which is $
   Amount1 = Amount1.substring(1);
   Double Amount1value = Double.parseDouble(Amount1);
   System.out.println(Amount1value);
   
  String Amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
   
   //this will remove the first character which is $
   Amount2 = Amount2.substring(1);
   Double Amount2value = Double.parseDouble(Amount2);
   
   Double ExpectedTotalvalue = Amount1value+Amount2value;
   System.out.println(ExpectedTotalvalue);
   
   
   String  Totalvalue = driver.findElements(By.id("com.androidsample.generalstore:id/totalAmountLbl")).get(0).getText();
   Totalvalue = Totalvalue.substring(1);
   Double finalTotalValue = Double.parseDouble(Totalvalue);
   
   Assert.assertEquals(ExpectedTotalvalue,finalTotalValue);
   
   
   
   
   




		
	}
	@Test
	public void testCase1() {
		
		
		
	}

}
