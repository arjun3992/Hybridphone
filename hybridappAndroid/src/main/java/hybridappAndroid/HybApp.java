package hybridappAndroid;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybApp {
	public static AndroidDriver<AndroidElement> hybrid() throws MalformedURLException{
		
	
		
		
	
	DesiredCapabilities cp = new DesiredCapabilities();
	
	cp.setCapability(MobileCapabilityType.DEVICE_NAME, "vinay");
	cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//this for native app
	cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
	cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
	
	cp.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	
	cp.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C://chromedriver_win32 (3)//chromedriver.exe");
	
	// if you want to make default
 
	
//	AndroidDriver<AndroidElement> driver = new AndroidDriver(cp)<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);

	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);


	return driver;
}
}
