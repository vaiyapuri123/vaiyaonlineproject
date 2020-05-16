package objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeobject extends Basepge{
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li/[1]/a")
	private WebElement womenTag;
	public Homeobject() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getWomenTag() {
		return womenTag;
	}

}
 