package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WindowType;
import utilities.ConfigReader;
import utilities.Driver;

public class Netflix extends TestBase {
    @Given("SearchCode sayfasina gidilir")
    public void searchcodeSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlSearchCode"));
    }

    @And("netflix")
    public void netflix() {
        searchCode.searchCodeInpt.sendKeys(ConfigReader.getProperty("netflix"));
    }

    @And("Search butonuna tiklanir")
    public void searchButonunaTiklanir() {
        searchCode.searchBtn.click();
    }

    @And("Yeni sekme acilir")
    public void yeniSekmeAcilir() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    }






}



















