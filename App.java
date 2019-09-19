package MavenProj;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
    	chromeOptions.addArguments("--no-sandbox");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	chromeOptions.addArguments("--headless");
    	driver.get("http://35.224.206.189:8081/");
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	driver.findElement(By.id("About Us")).click();
    	String test = driver.findElement(By.id("PID-ab2-pg")).getText();
    	assertEquals(test, "This is about page. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,    	but also the leap into electronic typesetting, remaining essentially unchanged. It    	was popularised in the 1960s with the release of Letraset sheets containing Lorem    	Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    	System.out.println("Test Succeeded!!");
    	driver.quit();
    }
}
