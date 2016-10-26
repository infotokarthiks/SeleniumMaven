package karthik.kselenium;

import io.github.bonigarcia.wdm.MarionetteDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class toolsqa1 {
	public static void main(String[] args) {
		/*
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\karthik\\Desktop\\TestLeaf\\Materials\\64 bit\\driver\\chromedriver.exe");
		 */
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\karthik\\Desktop\\TestLeaf\\Materials\\64 bit\\driver\\chrome.exe");
		/* WebDriver driver = new ChromeDriver(); */
//		MarionetteDriverManager.getInstance().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		String title = driver.getTitle();
		String winhandle = driver.getWindowHandle();
		System.out.println("The Window Handle is :" + winhandle);
		String contents = driver.getPageSource();
		System.out.println("The PageContent is :" + contents);
		driver.close();
	}

}
