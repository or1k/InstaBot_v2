package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public AccountPage loginPage(){
        $(By.xpath("//*[contains(@href,'login')]")).click();
        $(By.xpath("//div[@class='yOZjD _80tAB']")).shouldNotBe(Condition.visible);
        $(By.name("username")).val("Kriorika77");
        $(By.name("password")).val("orionchik31");
        $(By.xpath("//button/div")).click();
        return page(AccountPage.class);
    }

}
