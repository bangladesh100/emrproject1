package emr.utilities;


import cucumber.api.java.After;


public class AfterActions {

	
		@After
		public void afterAction(){
			SetupDriver.tearDown();
			System.out.println("----------");
		}
	}


