package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioApp {

	public static void main(String[] args) throws InterruptedException {
		//Setup the Driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Pass the URL
		driver.get("https://www.ajio.com/");
				
	// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//div[@class='searchbar-view']//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
	//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
	//Wait Time for loading the page
		Thread.sleep(2000);
	//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
	//Wait Time for loading the page	
		Thread.sleep(2000);
	//Print the count of the items Found. 
		List<WebElement> item = driver.findElements(By.className("items"));
		System.out.println(item.size());
		
	//Get the list of brand of the products displayed in the page and print the list.
		
		  List<WebElement> brand=driver.findElements(By.className("brand"));
		  System.out.println("Get the List of Brand Names...."); 
		  
		  for(WebElement w:brand) {
		  System.out.println("The Brand Names are:"+w.getText()); 
		  }
		 
		//Get the list of names of the bags and print it
		List<WebElement> bagName=driver.findElements(By.className("nameCls"));
		System.out.println("Before Bag Name....");
	
		for(WebElement b:bagName) {
			System.out.println("The Bag Names are:"+b.getText());
		}

	}

}
