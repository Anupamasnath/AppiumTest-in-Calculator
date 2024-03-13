package firstpackage;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Calculatoropen {

	public static void main(String[] args) {
		try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "OPPO A16");
            caps.setCapability("udid", "DQSSZDCMUSSGOBCQ");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "12");
            caps.setCapability("appPackage", "com.coloros.calculator");
            caps.setCapability("appActivity", "com.android.calculator2.Calculator");
            caps.setCapability("skipDeviceInitialization", true);
            caps.setCapability("automationName", "UiAutomator2");

            URL url = new URL("http://127.0.0.1:4723");
            AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);
//            ProcessBuilder pb = new ProcessBuilder("C:\\Windows\\System32\\cmd.exe", "/c" , "D:\\android-sdk\\platform-tools\\adb.exe",  "shell", "am", "start", "-n", "com.coloros.calculator/.Calculator");
//            Process pc = pb.start();
//            pc.waitFor(); 

            System.out.println("Application started");
            Thread.sleep(5000);
            driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
            driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
            driver.findElement(By.id("com.coloros.calculator:id/digit_5")).click();
            driver.findElement(By.id("com.coloros.calculator:id/img_eq")).click();
            WebElement e = driver.findElement(By.id("com.coloros.calculator:id/result"));
           
            System.out.println("Sum of 8 + 5 = " +e.getText());
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

	}

}
