package githubautomationtestscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {
	static ChromeDriver driver;
	static FileInputStream file;
	static Properties prop;
	
	
	public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
			file=new FileInputStream("src//repository.properties");
			prop= new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void navigate(String data) {
		driver.get(data);
		
	}
	public String verifytitle() {
		String actualvalue=driver.getTitle();
		return actualvalue;
	}
	public void input(String data,String objectname) throws Exception{
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
	}
public void click(String objectname) {
	driver.findElement(By.xpath(prop.getProperty(objectname))).click();
}
public void clickcs(String objectname) {
	driver.findElement(By.cssSelector(prop.getProperty(objectname))).click();;
}
public void terminate() {
	driver.quit();
}
public void radio(String objectname) {
	
	WebElement radioElement =driver.findElement(By.xpath(prop.getProperty(objectname)));
	boolean selectState = radioElement.isSelected();
	 
	//performing click operation only if element is not selected
	if(selectState == false) {
	 radioElement.click();
	}
}

public void check(String objectname) {
	WebElement checkBoxElement = driver.findElement(By.xpath(prop.getProperty(objectname)));
	boolean isSelected = checkBoxElement.isSelected();
	 
	//performing click operation if element is not checked
	if(isSelected == false) {
	 checkBoxElement.click();
	}
}


}
