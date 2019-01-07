package com.saifan.MavenSaifan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewArrivals {
	WebDriver dr;
	NewArrivals(WebDriver dr){
		this.dr=dr;
	}
	public void clickBrand() {
		Share.click(dr.findElement(By.xpath(".//*[@id='BRAND']/h2")));
	}

	public CalvinClain clickCalvinClain() {
		Share.click(dr.findElement(By.xpath(".//*[@id='all_brands_list']/li[4]/a/span[2]")));
		return new CalvinClain(dr);
	}
	public Addidus clickAddidas() {
		Share.click(dr.findElement(By.xpath(".//*[@id='all_brands_list']/li[1]/a/span[2]")));
		return new Addidus();
	}
	public HugoBoss clickHugoBoss() {
		Share.click(dr.findElement(By.xpath(".//*[@id='all_brands_list']/li[7]/a/span[2]")));
		return new HugoBoss();
	}
	public TommyHill clickTommyHill() {
		Share.click(dr.findElement(By.xpath(".//*[@id='all_brands_list']/li[15]/a/span[2]")));
	return new TommyHill();
	}
	public Nike clickNike() {
		Share.click(dr.findElement(By.xpath(".//*[@id='all_brands_list']/li[12]/a")));
	return new Nike();
	}
}
