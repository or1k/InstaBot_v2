package Test;

import Pages.AccountPage;
import Pages.LoginPage;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddNewFollowers {

    @BeforeTest
    public void setup(){
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
    }


    @Test()
    public void Test() throws InterruptedException {
        LoginPage loginPage = open("https://www.instagram.com/?hl=ru", LoginPage.class);
        loginPage.loginPage();
        sleep(30000);
        AccountPage accountPage = new AccountPage();
        accountPage.closePopup();
        open("https://www.instagram.com/explore/locations/749889026/dnipro/?hl=ru");
        accountPage.moreFollowersFromGeo();

    }
}
