package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppoinmentElements {

	
	//report menu
		@FindBy(xpath="//*[@id=\"menu_logo\"]/div/div/span[10]/div/div")
		public 	WebElement reportMenu;
	
	
		//visit menu
		@FindBy(xpath="//*[@id=\"menu_logo\"]/div/div/span[10]/div/ul/li[3]/div")
		//@FindBy(xpath="//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span/div[@class='menuSection']/ul[@name='menuEntries']/li[3]/div[1]/div[1]")
		public 	WebElement visitMenu;
	
		//appoinment menu
		@FindBy(xpath="//*[@id=\"menu_logo\"]/div/div/span[10]/div/ul/li[3]/div/ul/li[2]/div")
		public 	WebElement appoinmenttMenu;
	
	
		
	
	
	
	
	
	
}
