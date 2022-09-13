package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement search;

    public static final String PRODUCT = "Gorenje";

    public SearchResultsPage searchProduct(String name) {
        waitElementIsClickable(search);
        search.sendKeys(name);
        search.submit();
        return new SearchResultsPage();
    }
}

