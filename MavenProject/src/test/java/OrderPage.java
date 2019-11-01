import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    public static String addressFromId = "#addressFrom";
    public static String addressToId = "#addressTo";
    public static String timeId = "#datetimeSelect";
    public static String timeTextId = "#datetimeSelect span";
    public static String phoneId = "#phoneNumber";
    public static String tariffId = "#uniq15578202915844";
    public static String commentId = "#uniq15578202915845";
    public static String routePriceId = "#routestats";
    public static String priceTextId = "#routestats span.button__text";
    public static String demoButtonId = "//div[@class='grid-taxi__col grid-taxi__col_float_left grid-taxi__col_width_1-of-3']/button/span[@class='button__text']";
    public static String rotateAdressesId = ".geo-group__swap";
    public static String clearAddressFromId = "//span[@class='input__clear input__clear_visibility_visible']";

    public static void EnterValues()
    {
        $(By.xpath(clearAddressFromId)).click();
        $(addressFromId).sendKeys("Университетская улица, 28");
        $(addressToId).sendKeys("улица Авиастроителей, 3");
        $(phoneId).sendKeys("694-694");

    }
}
