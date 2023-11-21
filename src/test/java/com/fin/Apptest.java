package com.fin;

import org.testng.Assert;
import org.testng.annotations.*;

public class Apptest {

	@Test
//negative test case failure
  
	public void testlogin1() {
	valuser myapp= new valuser();
	Assert.assertEquals(0, myapp.userlogin("abc", "123"));
	}
	
	@Test
	//positive testcase
	public void testlogin2() {
		valuser myapp=new valuser();
		Assert.assertEquals(1, myapp.userlogin("ram", "3025"));
	}

}
