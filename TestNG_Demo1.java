package kkcpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Demo1 {

	    @Test (groups= {"Sanity"})
	    public void login() {
		  	  System.out.println("code for login");
	    }
		@Test (groups= {"Sanity", "Regression"})
		public void launch() {
			  System.out.println("code for launch");
		}
	    @Test (groups= {"Sanity"})
	    public void registration() {
		  	  System.out.println("code for registration");
	    }
		@Test (groups= {"Smoke", "UAT"})
		@Parameters({"location","DCNO"})
		public void AddCart(String location, String DCNO) {
			  System.out.println("code for AddCart");
			  System.out.println(location);
			  System.out.println(DCNO);
		}

		@Test (groups= {"Regression", "UAT"})
		@Parameters({"location","DCNO"})
		public void RemoveCart(String location, String DCNO) {
			  System.out.println("code for RemoveCart");
			  System.out.println(location);
			  System.out.println(DCNO);
	  
  }
}
