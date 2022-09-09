package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	private AndroidDriver<MobileElement> driver;
	
	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	//Locator
	By btnEmpat = By.id("com.miui.calculator:id/btn_4_s");
	By btnDua = By.id("com.miui.calculator:id/btn_2_s");
//	By btnTambah = By.id("com.miui.calculator:id/btn_plus_s");
	By btnKurang = By.id("com.miui.calculator:id/btn_minus_s");
	By btnKali = By.id("com.miui.calculator:id/btn_mul_s");
	By btnBagi = By.id("com.miui.calculator:id/btn_div_s");
	By btnSamaDengan = By.id("com.miui.calculator:id/btn_equal_s");
	By hasil = By.id("com.miui.calculator:id/result");
	
	//Method
//	public void calcAdd() {
//		driver.findElement(btnSatu).click();  //eror
//		driver.findElement(btnTambah).click();
//		driver.findElement(btnDua).click();
//		driver.findElement(btnSamaDengan).click();
//		
//	}
	
	public void calcKurang() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnKurang).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcKali() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnKali).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcBagi() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnBagi).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	
	
	public String getTxtResult() {
		return driver.findElement(hasil).getText();
	}
}
