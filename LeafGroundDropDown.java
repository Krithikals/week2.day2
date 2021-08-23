package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropDwn1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dropDwn1);
		drop1.selectByIndex(1);
		WebElement dropDwn2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dropDwn2);
		drop2.selectByVisibleText("UFT/QTP");
		WebElement dropDwn3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dropDwn3);
		drop3.selectByValue("4");
		WebElement dropDwn4 = driver.findElement(By.className("dropdown"));
		Select drop4 = new Select(dropDwn4);
		int size = drop4.getOptions().size();
		System.out.println("The Number of options are " + size);
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Selenium");
		WebElement dropDwn6 = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
		Select drop6 = new Select(dropDwn6);
		drop6.selectByValue("4");
		

	}

}
