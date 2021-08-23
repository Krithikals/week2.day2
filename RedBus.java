package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * 1.Go to https://www.redbus.in/ in chrome 2.Type Chennai in From textBox and
		 * ENTER 3.Type Bengaluru in Destination textBox and ENTER 4.Choose any date in
		 * JULY 5.Click Search Buses 6.Close the popup using the X button at the right
		 * corner 7.Print the number of search results 8.Choose only Sleeper Bus 9.Print
		 * the number of search results 10.Deselect the sleeper Bus and select the AC
		 * bus alone 11.Print the number of search results 12.Choose also Non AC buses
		 * 13.Print the number of search results
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Go to https://www.redbus.in/ in chrome
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 2.Type Chennai in From textBox and ENTER
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Chennai");
		Thread.sleep(10000);
		source.sendKeys(Keys.TAB);
		// 3.Type Bengaluru in Destination textBox and ENTER
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Bengaluru");
		Thread.sleep(10000);
		destination.sendKeys(Keys.TAB);
		// 4.Choose any date in JULY
		// driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='we day']")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		System.out.println("Pass");
		// 7.Print the number of search results
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the buses " + text);
		 //8.Choose only Sleeper Bus
		 //9.Print the number of search results 
		WebElement sleeper = driver.findElementByXPath("//input[@id='bt_SLEEPER']/following-sibling::label");	
		driver.executeScript("arguments[0].scrollIntoView();", sleeper);
		sleeper.click();
		String sleeperSrc = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the Sleeper buses" + sleeperSrc);
		Thread.sleep(20000);
		//10.Deselect the sleeper Bus and select the AC bus alone
		sleeper.click();
		System.out.println("Sleeper De-selected");
		Thread.sleep(50000);
		WebElement ac = driver.findElementByXPath("//input[@id='bt_AC']/following-sibling::label[1]");
		//driver.executeScript("arguments[0].scrollIntoView();", ac);
		Thread.sleep(10000);
		ac.click();
		System.out.println("The AC clicked");
		Thread.sleep(20000);
		//11.Print the number of search results
		String acSrc = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the AC buses" + acSrc);
		//12.Choose also Non AC buses
		//13.Print the number of search results
		Thread.sleep(20000);
		WebElement nonAc = driver.findElementByXPath("(//input[@id='bt_NONAC']/following-sibling::label)[1]");
		nonAc.click();
		//Thread.sleep(20000);
		String overAll = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of the Non Ac + AC buses" + overAll);
		System.out.println("Done");
		
	}

}
