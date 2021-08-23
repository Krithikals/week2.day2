package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEditfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Complete all the 5 activities in Edit Page: http://leafground.com/pages/Edit.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("krithilsk@gmail.com");
		WebElement append = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]"));
		String attribute = append.getAttribute("value");
		append.clear();
		append.sendKeys(attribute + "hello");
		append.sendKeys(Keys.TAB);
		System.out.println(attribute + append.getAttribute("value"));
		WebElement text = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[3]"));
		String getTxt = text.getAttribute("value");
		System.out.println("Text in 3rd field is " + getTxt);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[4]")).clear();
		WebElement element = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[5]"));
		if (element.isEnabled()==true)
		{
			System.out.println("The button is enabled");
			
		}
		else System.out.println("The Button is disabled");
	
		
		
	}

}
