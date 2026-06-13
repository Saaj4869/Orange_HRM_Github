package allAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertcase02 {
	
	@Test
	void username()
	{
		String expected_title = "Amazon";
		String actual_title = "Amazon";
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		
//		Assert.assertEquals(expected_title, actual_title);
	}

}
