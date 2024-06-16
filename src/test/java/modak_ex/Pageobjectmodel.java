package modak_ex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pageobjectmodel {
	@FindBy(how=How.ID,using="unique-form-control")
	public static WebElement poxysearch;
	@FindBy(how=How.ID,using="unique-btn-blue")
	public static WebElement poxybutton;
	@FindBy(how=How.ID,using="search-words")
	public static WebElement alisearch;
	@FindBy(linkText="2")
	public static WebElement page2;
	
}
