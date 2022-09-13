package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends HomePage {

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> products;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private WebElement product;

    @FindBy(xpath = "//a[contains(@data-ecomm-cart,'\"id\":30681')]")
    private WebElement buy;

    @FindBy(xpath = "//input[@class='js-changeAmount count']")
    private WebElement count;

    @FindBy(css = "label[for='fltr-category-850']")
    private WebElement filter;

    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> coffee;

    public static final int PRODUCTS_PER_PAGE = 12;
    public static final int COFFEE_PER_PAGE = 7;

    public int getAllFoundProductsSize() {
        return products.size();
    }

    public String getFoundProductsLabel() {
        waitElementIsVisible(product);
        return product.getText();
    }

    public String getAllFoundProductsLabels() {
        for (WebElement label : products) {
            return label.getText();
        }
        return null;
    }

    public WebElement addToCart() {
        buy.click();
        waitElementIsVisible(count);
        return count;
    }

    public int searchCoffeeMachine() {
        filter.click();
        waitElementIsVisible(coffee);
        return coffee.size();
    }
}
