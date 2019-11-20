package Test;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testtest {

    @Test
    public void Test(){
        open("http://www.google.com");
        $(By.xpath("asdasda")).shouldBe();
    }
}
