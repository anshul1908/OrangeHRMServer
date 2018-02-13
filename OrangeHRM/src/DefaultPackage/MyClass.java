package DefaultPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {
	public static String driverPath = "E:\\JAVA\\";
	 public static WebDriver driver;
	 
	public static void main(String[] args) {
	
		String baseURL="http://demo.guru99.com/test/link.html";		
	
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.get(baseURL);
		driver.findElement(By.partialLinkText("click here")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
