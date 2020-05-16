package objectpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage extends Basepge {
	@FindBy
	private WebElement checksize;
	
	@FindBy
	private WebElement productImage;
	@FindBy
	private WebElement subBtn;
	public Dresspage() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSsize() {
		return checksize;
		
	}
	public WebElement getProductImg()
	{
		return productImage;
		
	}	
	public WebElement getbtn()
	{
		return subBtn;
	}
	
}
