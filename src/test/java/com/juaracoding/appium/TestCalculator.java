package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	private AndroidDriver<MobileElement> driver;
	private Calculator calculator;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:deviceName", "Xiaomi Redmi Note 9 Pro");
		capabilities.setCapability("appium:uuid", "6e7765e7");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appium:platformVersion", "11");
		capabilities.setCapability("appium:appPackage", "com.miui.calculator");
		capabilities.setCapability("appium:appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}
	
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
		
	}
	
	
//	public void testAdd() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		calculator.calcAdd(); //error
//		System.out.println("Hasil = "+calculator.getTxtResult());
//		assertEquals(calculator.getTxtResult(), "= 3");
//	}
	
	@Test
	public void testKurang() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculator.calcKurang();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "= 2");
	}
	
	@Test 
	public void testKali() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculator.calcKali();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "= 8");
	}
	
	@Test 
	public void testBagi() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculator.calcBagi();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "= 2");
	}
	
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
