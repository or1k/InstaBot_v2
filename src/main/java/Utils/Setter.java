package Utils;

import Pages.AccountPage;

import static com.codeborne.selenide.Selenide.page;

public class Setter {

    public String[] keyWords;


    public AccountPage setKeyWords(){
        keyWords = new String[]{
                "магазин",
                "грн",
                "#гельлакднепр",
                "маникюр",
                "ногти",
                "цена",
                "Direct",
                "brand",
                "заказ",
                "доставка",
                "одежда",
                "записаться",
                "заказа",
                "nails",
                "nails",
                "nails",
                "подарок",
                "косметика",
                "аксессуар",
        };
        return page(AccountPage.class);
    }
}
