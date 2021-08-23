package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayTwoCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'/SFA')]")).click();
	     driver.findElement(By.linkText("Contacts")).click();
	     driver.findElement(By.linkText("Create Contact")).click();
	     driver.findElement(By.id("firstNameField")).sendKeys("Test");
	     driver.findElement(By.id("lastNameField")).sendKeys("Leaf");
	     driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test");
	     driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Leaf");
	     driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer");
	     driver.findElement(By.id("createContactForm_description")).sendKeys("Creating contact as test leaf");
	     driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
	     WebElement state = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
	     Select stateDrp= new Select(state);
	     stateDrp.selectByVisibleText("Norway");
	     driver.findElement(By.className("smallSubmit")).click();
	     driver.findElement(By.linkText("Edit")).click();
	     driver.findElement(By.id("updateContactForm_description")).clear();
	     driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important note");
	     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	     String title = driver.getTitle();
	     System.out.println(title);
	     
	     
	     
	     
	}

}
