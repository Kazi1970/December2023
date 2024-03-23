package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		
     WebElement p2=driver.findElement(By.xpath("//img[@alt='User Avatar'])[2]"));
     
     WebElement vp2=driver.findElement(By.xpath("(//a[test()='View profile'])"));
     
     Actions a1=new Actions(driver);
     a1.moveToElement(p2).moveToElement(vp2).click().build().perform();

	}

}
