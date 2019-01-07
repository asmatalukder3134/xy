package com.saifan.MavenSaifan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Share {
	
public static void click(WebElement e) {
	e.click();
}

public static void waitForelement(WebElement e) {
	ExpectedConditions.visibilityOf(e);
}
public static void  hoverOver(WebDriver dr,WebElement e) {
	Actions ac= new Actions(dr);
	ac.moveToElement(e).build().perform();
}




}
