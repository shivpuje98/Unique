package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=ipl+points+table+2021");
        Thread.sleep(1000);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        System.out.println(rows.size());
        Thread.sleep(1000);
        
        List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
        System.out.println(columns.size());
        Thread.sleep(1000);
        
        for( WebElement hdr:columns)
        {
       	 System.out.print(hdr.getText()+ "  ");
        }
        
        List<WebElement> allrowsdata = driver.findElements(By.xpath("//table//tr"));
		  Iterator<WebElement> it = allrowsdata.iterator();
		  while(it.hasNext())
		  {
			  System.out.print(it.next().getText()+ " ");
			  System.out.println();
		  }
        
	}

}
