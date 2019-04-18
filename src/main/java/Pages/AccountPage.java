package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    private final static SelenideElement PopUp = $(By.xpath("//button[@class='aOOlW   HoLwm ']"));
    private SelenideElement ButtonWithFollowers = $(By.xpath("//li[2]//a/span"));

    public AccountPage closePopup(){
        if(PopUp.isEnabled()){
            PopUp.click();
        }else {
            System.out.println("nixuya");
        }
        return this;
    }

    public AccountPage clickFollowersButton(){
        ButtonWithFollowers.click();
        return this;
    }










}
