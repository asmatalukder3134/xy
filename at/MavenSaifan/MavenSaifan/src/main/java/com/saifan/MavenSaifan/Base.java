package com.saifan.MavenSaifan;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.j2objc.annotations.Property;

public class Base {
	WebDriver dr;
	public void openBrowser() {
		Properties prop= ReadProperty.fileRead("C:\\Users\\shapl\\Downloads\\apache-maven-3.5.4-bin (1)");
	String b=	prop.getProperty("Browser");
	String r=prop.getProperty("runmode");
	
	if(b.equals("chrome"))
	{if(r.equals("local"))
		System.setProperty("ChromeDriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver();
	}else if(b.equals("firefox"))
	{if(r.equals("remote")) {
		System.out.println("run remotly");
	}
	dr.get(prop.getProperty("url"));
		
	}
	
	
	
	
	}

}
