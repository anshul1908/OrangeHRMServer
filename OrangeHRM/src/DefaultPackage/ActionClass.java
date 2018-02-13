package DefaultPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		 String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		System.setProperty("webdriver.gecko.driver", "E:\\JAVA\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(baseUrl);

		WebElement Link_Home=driver.findElement(By.linkText("Home"));
		WebElement td_Home=driver.findElement(By.xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));
		Actions builder=new Actions(driver);
		
		Action mouseOverHome=builder.moveToElement(Link_Home).build();
		
		String bgColor=td_Home.getCssValue("background-color");
		System.out.println("Before Hover: " + bgColor);
		
		mouseOverHome.perform();
		bgColor=td_Home.getCssValue("background-color");
		
		System.out.println("After Hover" + bgColor);
		driver.close();		
		driver.close();		
	}

}
