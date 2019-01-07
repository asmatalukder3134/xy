package testngfrijavaproject;

import org.junit.Test;

public class D1 {
	@Test
	public void  abc() { 
	int[] a= {18,7,9,20};
	int max=a[0];
	int secondMax=a[1];
	for(int i=2;i<a.length;i++)
	{
		if(a[i]>max) {
		max=secondMax;
		
			max=a[i];
		}
		System.out.println(max);
			
	}
    
}

		
	

}
