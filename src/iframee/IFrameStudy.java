package iframee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Pooja\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
        System.out.println(text);
        
        
        driver.switchTo().frame(0);
        String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
        System.out.println(text1);
        
        //Thread.sleep(5000);
        //driver.switchTo().frame("Frame2");
        
        //String text2 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
        //System.out.println(text2);
       
        driver.switchTo().parentFrame();
       String text3 = driver.findElement(By.linkText("Pavilion")).getText();
       System.out.println(text3);
       
       Thread.sleep(5000);
       driver.switchTo().frame("Frame2");
       
       String text2 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
       System.out.println(text2);
       
       driver.switchTo().defaultContent();
       String text4 = driver.findElement(By.linkText("Blogger")).getText();
       System.out.println(text4);
        
	}
	
}
