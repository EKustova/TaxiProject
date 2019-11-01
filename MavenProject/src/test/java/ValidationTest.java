import org.openqa.selenium.By;
import org.testng.annotations.*;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class ValidationTest {

    String URL = "https://taxi.yandex.ru/?from=taxi&utm_medium=cpc&utm_source=adwords&utm_campaign=DT_RU-MOWMSK_Brand&utm_term=yandex.taxi&utm_content=52761256223_262965563656&gclid=CjwKCAjwjZjZBRAZEiwAPeLSK3NJIxlOAXK9YiM_oSbAwe3pze4iEptPdkU715Dm6NfjUOjDljpghRoCjn4QAvD_BwE#index";

    @BeforeMethod
    public void start() {
        Configuration.startMaximized = true;
        open(URL);
    }
    //@Parameters({ "address-from", "time", "price" })
    @Test
    public void ValidateInitialFields() //@Optional String addressFrom,@Optional String time, @Optional String price)
     {
        $(OrderPage.addressFromId).shouldBe(Condition.value("улица имени А.Н. Радищева, 39"));
        $(OrderPage.addressToId).shouldBe(Condition.empty);
        $(OrderPage.timeTextId).shouldBe(Condition.text("На ближайшее время"));
        $(OrderPage.phoneId).shouldBe(Condition.empty);
        $(By.xpath(OrderPage.demoButtonId)).shouldBe(Condition.text("Демо-заказ"));
        $(OrderPage.priceTextId).shouldBe(Condition.text("Эконом от 59 Р"));
    }

    @Test
    public void SelectNewParameters() {
        OrderPage.EnterValues();
    }

    @AfterMethod
    public void done() {

        close();
    }
}
