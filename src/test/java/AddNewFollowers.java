import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddNewFollowers {

    @Test
    public void Test(){
        LoginPage loginPage = open("https://www.instagram.com/?hl=ru", LoginPage.class);
        loginPage.loginPage();
        AccountPage accountPage = new AccountPage();
        accountPage.closePopup();
        open("https://www.instagram.com/dnepr_news/");
        accountPage.clickFollowersButton();
        sleep(10000);

    }
}
