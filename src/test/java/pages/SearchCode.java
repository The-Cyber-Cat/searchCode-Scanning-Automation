package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchCode {
    public  SearchCode(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".searchInput")
    public WebElement searchCodeInpt;

    @FindBy(css = "input[type='submit']")
    public WebElement searchBtn;




}
