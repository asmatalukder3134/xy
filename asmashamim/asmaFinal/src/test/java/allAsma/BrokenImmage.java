package allAsma;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenImmage {
	WebDriver dr;
	@Test
	public void openBrowser() throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shapl\\Documents\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.target.com/");
		JavascriptExecutor exe=(JavascriptExecutor)dr;
		exe.executeScript("window.scrollTo(0,2000)", "");
		dr.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		List<WebElement> elements=dr.findElements(By.xpath("//img"));
		int size=elements.size();
		System.out.println("size is:"+size);
		for(int i=0;i<size;i++) {
			String links=elements.get(i).getAttribute("href");
			System.out.println("link is"+links);
			URL url=new URL(links);
			URLConnection httpconnection=(HttpURLConnection)url.openConnection();
			httpconnection.connect();
			Thread.sleep(3000);
			int code=((HttpURLConnection) httpconnection).getResponseCode();
			if(code>=400) {
				String httpUrl=elements.get(i).getAttribute("href");
				System.out.println("broken image:"+"  " +httpUrl);
			}else {
				System.out.println("image is not broken");
			}
			//dr.quit();
			
		}
		
		
		
	}
	
	
	
}
