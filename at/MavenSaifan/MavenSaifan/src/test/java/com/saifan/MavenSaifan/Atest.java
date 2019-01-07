package com.saifan.MavenSaifan;

public class Atest extends Base{
	Home home;
	NewArrivals newarrivals;
	CalvinClain calvinclain;
	Addidus addidus;
	HugoBoss hugoboss;
    TommyHill tommyhill;
    Nike nike;
    
   public void test() {
	   home = new Home(dr);
	   newarrivals=home.clickOnNewArrivals();
	   calvinclain = newarrivals.clickCalvinClain();
	   addidus = newarrivals.clickAddidas();
	   hugoboss=newarrivals.clickHugoBoss();
	   tommyhill=newarrivals.clickTommyHill();
       nike=newarrivals.clickNike();
   
   }
    
    
   
    
    
    
    
    
    
    
}
