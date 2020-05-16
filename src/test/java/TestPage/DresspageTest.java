package TestPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import objectpage.Basepge;
import objectpage.Dresspage;
import objectpage.Homeobject;

public class DresspageTest {
	Basepge bp;
	Homeobject hp;
	Dresspage dp;
	
	
	public DresspageTest() {
		bp=new Basepge();
		hp=new Homeobject();
		dp=new Dresspage();
		
	}
	@Test
	public void verifySsize() {
		hp.getWomenTag().click();
		dp.getProductImg();
		bp.driver.switchTo().frame(dp.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
		dp.getbtn();
		
	}

}
