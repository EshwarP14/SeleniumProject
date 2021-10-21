package parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="getData")
public class TestParameterization {
	
	public void doLogin(String username , String password)
	{
		System.out.println(username+"----"+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="trainer@testing.com";
		data[0][1]="dugsaifu";
		
		data[1][0]="data@testing.com";
		data[1][1]="sdhdsiftasie";
		
		data[2][0]="corporate@testing.com";
		data[2][1]="dsiugfcisuehec";
		
		return data;
		
	}

}
