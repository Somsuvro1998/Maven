package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {
public static void main(String[] args) throws Throwable {
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Cars");
    
	//driver.quit();
	
	
}
	
	
	
}
