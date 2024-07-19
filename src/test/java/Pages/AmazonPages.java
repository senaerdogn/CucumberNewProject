package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    //accept buttonun idsi
    static By accept = By.id("sp-cc-accept");

    static By search = By.xpath("//input[@id='twotabsearchtextbox']");

    static By searchButton = By.id("nav-search-submit-button");

    static By amazonFilter = By.xpath("//span[contains(text(),'Amazon tarafından gönderilir')]");

    static By appleFilter = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");

    static By firstProduct = By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");

    static By add = By.id("add-to-cart-button");

    static By cart = By.cssSelector("#nav-cart-count");

    static By check = By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    //config.properties'ten url'i alıyor
    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
