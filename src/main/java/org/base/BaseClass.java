package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver diver;
	
	public static void   browser() {
	 WebDriverManager.chromedriver().setup();
	  diver =new ChromeDriver();

	}
	
	
	
}
