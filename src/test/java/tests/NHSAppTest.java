package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NHSAppTest {

	WebDriver driver;

	@Test
	public void LaunchBrowser() {  

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to https://www.nhs.uk/
		driver.get("https://www.nhs.uk/");
		
		//2. Click Live Well
		driver.findElement(By.xpath("//*[@id='header-navigation']/ul/li[3]/a")).click();   

		//3. Click Exercise
		driver.findElement(By.xpath("//*[@id='maincontent']/div/div/article/div[1]/div[3]/div/a/div/h2")).click();   

		//4. Click aerobic workout videos 
		driver.findElement(By.xpath("//*[@id='what-counts-as-moderate-aerobic-activity']/p[3]/a")).click();   

		//5. Click Aerobic excercise
		driver.findElement(By.xpath("//*[@id='guides-nav__label-0']")).click();   

		//6. Click Aerobics (Level: Beginner)
		driver.findElement(By.xpath("//*[@id='guides-nav__contents-0']/div/a[1]")).click();   

		//7. Click and watch Aerobics (Level: Beginner)
		driver.findElement(By.xpath("//*[@id='video-aerobics-for-beginners']")).click();   
	}
}
