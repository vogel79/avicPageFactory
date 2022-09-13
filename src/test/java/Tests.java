import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import properties.BaseTest;

public class Tests extends BaseTest {

    @Test
    public void searchGorenje() {
        Assert.assertTrue(new HomePage()
            .searchProduct(HomePage.PRODUCT)
            .getFoundProductsLabel().contains(HomePage.PRODUCT));
    }

    @Test
    public void productsQuantity() {
        Assert.assertEquals(new HomePage()
            .searchProduct(HomePage.PRODUCT)
            .getAllFoundProductsSize(), SearchResultsPage.PRODUCTS_PER_PAGE);
    }

    @Test
    public void searchResults() {
        Assert.assertTrue(new HomePage()
            .searchProduct(HomePage.PRODUCT)
            .getAllFoundProductsLabels().contains(HomePage.PRODUCT));
    }

    @Test
    public void addToCart() {
        Assert.assertEquals("1", new HomePage()
            .searchProduct(HomePage.PRODUCT)
            .addToCart().getAttribute("value"));
    }

    @Test
    public void searchCoffeeMachine() {
        Assert.assertEquals(new HomePage()
            .searchProduct(HomePage.PRODUCT)
            .searchCoffeeMachine(), SearchResultsPage.COFFEE_PER_PAGE);
    }
}
