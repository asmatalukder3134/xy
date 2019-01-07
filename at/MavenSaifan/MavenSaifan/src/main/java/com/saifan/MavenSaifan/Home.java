package com.saifan.MavenSaifan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Sho.MavenSho.Share;
import com.Sho.MavenSho.homeandkitchen;

public class Home {
	WebDriver dr;
	Home(WebDriver dr){
		this.dr =dr;
	}

	
	public void hoverOnShopBydepartment() {
		Share.hoverOver(dr, dr.findElement(By.xpath(".//*[@id='shopByDepartmentLabelText']")));
	}
	public void hoverMen() {
		Share.hoverOver(dr, dr.findElement(By.xpath(".//*[@id='flexid_1']/a/span")));
	}
	public NewArrivals  clickOnNewArrivals() {
		Share.click(dr.findElement(By.xpath(".//*[@id='mainNavigationFlyouts']/div[3]/div[1]/ul/li[2]/a")));
	return new NewArrivals(dr);
	
	}
	public Cellphone clickCellPhone(WebElement e, Cellphone CellPhone) {
		Share.click(e);
		return CellPhone;
	}
	
	public computer clickComputers(WebElement e, computer computer) {
		Share.click(e);
		return computer;
	}
	public officeproduct clickOfficeProduct(WebElement e, officeproduct officeproduct) {
		Share.click(e);
		return officeproduct;
	}

	 public void shopAllDepartment(By by) {
		 Share.hoverOver(dr, dr.findElement(by));}
	 
public homeandkitchen clickHomeAndKitchen(By by, homeandkitchen homeandkitchen) {
	Share.click(dr.findElement( by));
	return homeandkitchen;}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
