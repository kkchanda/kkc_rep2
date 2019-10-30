package kkcpkg;

import org.testng.annotations.Test;

public class NewTestNG {
  @Test (priority=2)
  public void registration() {
	  System.out.println("code for registration");
	  
  }
  @Test (priority=1)
  public void login() {
	  System.out.println("code for login");
	  
  }
  @Test (enabled=false)  // for blocking a test case from Execution
  public void forgotpswrd() {
	  System.out.println("code for forgotpswrd");
	  
  }
  
}
