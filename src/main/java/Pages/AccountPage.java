package Pages;

import Model.Setter;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;


public class AccountPage {
    private final static SelenideElement PopUp = $(By.xpath("//button[@class='aOOlW   HoLwm ']"));
    private SelenideElement ButtonWithFollowers = $(By.xpath("//li[2]//a/span"));
    private String followingButtonText = "Подписки";
    private String requestedButtonText = "Запрос отправлен";
    private int randomNum = ThreadLocalRandom.current().nextInt(28000, 38000);
    private SelenideElement FirstPicture = $(By.xpath("//div[@class='_9AhH0']"));
    private SelenideElement ButtonAddFollower = $(By.xpath("//button[text()= 'Подписаться']"));
    private SelenideElement FirstComment = $(By.xpath("//ul[@class='XQXOT']//li[1]"));

    private final String[] phraseOne = new String[]{
            "Какое замечательное фото, ",
            "Вау, ",
            "Ничего себе, ",
            "Вот это да, ",
            "Супер, ",
            "Я такого еше не видела, ",
            "Воу-Воу, "
            //"\uD83D\uDE03✌ "
    };

    private final String[] phraseTwo = new String[]{
            "я в восторге:)",
            "я удивлена o_0",
            "класс!",
            "шикарно :)",
            "",
            "обалденно! ^)"
            //"\uD83D\uDE03✌"
    };

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
    private String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

//    private AccountPage clickLikeAndADDComent() throws InterruptedException {
//        FirstPicture.click();
//        $(By.xpath("//section[@class='ltpMr Slqrh']")).shouldBe(Condition.visible);
//        if(!$(By.xpath("//button/span[@class='glyphsSpriteHeart__filled__24__red_5 u-__7']")).isDisplayed()) {
//            try{
//                $(By.xpath("//button/span[@class='glyphsSpriteHeart__outline__24__grey_9 u-__7']")).shouldBe(Condition.visible).click();
//            }catch (Exception ex){
//            }
//        }else {
//            System.out.println("Like уже есть");
//        }
//        if ($(By.xpath("//ul[@class='XQXOT']//a[contains (@title, 'kriorika77')]")).isDisplayed()) {
//            System.out.println("Коммент уже есть.");
//            WebDriverRunner.getWebDriver().navigate().back();
//        } else {
//            SelenideElement CommentArea = $(By.xpath("//textarea[@class='Ypffh']"));
//            CommentArea.click();
//            CommentArea.val(getRandom(phraseOne) + getRandom(phraseTwo)).pressEnter();
//            sleep(500);
//            System.out.println("коммент оставил");
//            WebDriverRunner.getWebDriver().navigate().back();
//        }
//        return this;
//    }



//    public AccountPage moreFollowersFromGroup(){
//        int count = 1;
//        int countAddFollowers = 0;
//        for (int i = 1; i < 1000; i++) {
//            try{
//                /**
//                 * Проверяем на скольких мы подписались.
//                 * Если 1000 - выключаем бота.
//                 */
//                if(countAddFollowers == 1000){
//                    break;
//                }
//                /**
//                 * Берем пользователя в списке и проверяем
//                 * Если он не подписан или не ожидается подтверждение подписки
//                 * Заходим в его аккакунт
//                 */
//                String LocatorName = "//li[" + count + "]//a[@class='FPmhX notranslate _0imsa ']";
//                System.out.println("Проверяю подписчика № " + count);
//                /**
//                 * Если подписан или ожидается подписка
//                 * переходим к другому пользователю
//                 */
//                SelenideElement followerAccount = $(By.xpath(LocatorName));
//                followerAccount.scrollIntoView(true);
//                String LocatorButtonText = $(By.xpath("//li[" + count + "]//button")).getText();
//                if (LocatorButtonText.equals(followingButtonText) || LocatorButtonText.equals(requestedButtonText)) {
//                    count++;
//                    continue;
//                }
//                /**************************/
//
//                sleep(randomNum);
//                //Переходим в него пользователя.
//                sleep(500);
//                System.out.println(LocatorName);
//                followerAccount.click();
//
//                /**
//                 * Проверяем на количество постов
//                 * Если меньше 10 - возвращаемся назад
//                 * Если больше - заходим в первый пост
//                 * Ставим лайк, возвращаемся в аккаунт - подписываемся.
//                 */
//                String countPost = $(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/ul/li[1]/span/span")).getText().replaceAll(",", "");
//                int getAccPosts = Integer.parseInt(countPost);
//                if (getAccPosts < 10) {
//                    WebDriverRunner.getWebDriver().navigate().back();
//                }else{
//                    if(FirstPicture.isDisplayed()){
//                        try {
//                            clickLikeAndADDComent();
//                        }catch (Exception ex){
//                            System.out.println(ex.getMessage());
//                        }
//                        try {
//
//                            ButtonAddFollower.click();
//                        }catch (Exception ex){
//                            System.out.println(ex.getMessage());
//                        }
//                       WebDriverRunner.getWebDriver().navigate().back();
//                    }else {
//                        try {
//                            ButtonAddFollower.click();
//                        }catch (Exception ex){
//                            System.out.println(ex.getMessage());
//                        }
//                        WebDriverRunner.getWebDriver().navigate().back();
//                    }
//                    countAddFollowers++;
//                    System.out.println("Подписались на " + countAddFollowers + " аккаунтов");
//                }
//            }catch (Exception ex){
//                System.out.println(ex.getMessage());
//            }
//            count++;
//        }
//        return this;
//    }

    private AccountPage clickLikeAndADDComentFromGEO() throws InterruptedException {
        $(By.xpath("//section[@class='ltpMr Slqrh']")).shouldBe(Condition.visible);
        if(!$(By.xpath("//button/span[@class='glyphsSpriteHeart__filled__24__red_5 u-__7']")).isDisplayed()) {
            try{
                $(By.xpath("//button/span[@class='glyphsSpriteHeart__outline__24__grey_9 u-__7']")).shouldBe(Condition.visible).click();
            }catch (Exception ex){
                ex.getStackTrace();
            }
        }else {
            System.out.println("Like уже есть");
        }
        if ($(By.xpath("//ul[@class='XQXOT']//a[contains (@title, 'kriorika77')]")).isDisplayed()) {
            System.out.println("Коммент уже есть.");
        } else {
            SelenideElement CommentArea = $(By.xpath("//textarea[@class='Ypffh']"));
            CommentArea.click();
            CommentArea.val(getRandom(phraseOne) + getRandom(phraseTwo)).pressEnter();
            sleep(500);
            System.out.println("коммент оставил");
        }
        return this;
    }

    public boolean checkKeyWordsIntText(){
        Setter setter = new Setter();
        setter.setKeyWords();
        for(int i=0;i<setter.keyWords.length; i++){
            if(FirstComment.getText().contains(setter.keyWords[i])){
                System.out.println("Аккаунт похож на магазин. Скипаем.");
                return true;
            }
        }
        System.out.println("Аккаунт чистый. кек");
        return false;
    }

    public AccountPage moreFollowersFromGeo() throws InterruptedException {

        int countAddFollowers = 0;
        System.out.println(countAddFollowers);
        /**
         * Заходим в первую фотку
         */
        FirstPicture.click();

        for (int i = 1; i < 1000; i++) {
            try {
                /**
                 * Првоверяем подписаны мы на человека или нет
                 */
                String LocatorButtonText = $(By.xpath("//header//button")).getText();
                if (LocatorButtonText.equals(followingButtonText) || LocatorButtonText.equals(requestedButtonText)) {
                    $(By.xpath("//a[text()='Далее']")).click();
                    continue;
                }
                System.out.println("Проверка подписаны мы на человека пройдена \n--------------------------");


                /**
                 * Проверка на Магазин
                 */

                if(checkKeyWordsIntText()){
                    System.out.println("LOX");
                    $(By.xpath("//a[text()='Далее']")).click();
                    continue;
                }
                System.out.println("Проверка на магаз пройдена \n--------------------------");


                /**
                 * Проверяем на скольких мы подписались.
                 * Если 1000 - выключаем бота.
                 */
                if (countAddFollowers == 1000) {
                    break;
                }
                System.out.println("Проверка на кол-во подписок пройдена \n--------------------------");


                /**
                 * Ставим Лайк + камент. если их нету
                 */
                clickLikeAndADDComentFromGEO();
                ButtonAddFollower.click();
                countAddFollowers++;
                System.out.println("Подписались на " + countAddFollowers + " аккаунтов\n--------------------------");
                $(By.xpath("//a[text()='Далее']")).click();
                sleep(randomNum);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }
        return this;
    }


}