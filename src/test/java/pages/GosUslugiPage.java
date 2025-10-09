package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class GosUslugiPage {

    private final SelenideElement gosUslugiButton = $(".rcalc__gos-link");

    public GosUslugiPage openPage() {
        open("/"); // или нужный URL
        return this;
    }

    @Step("Click on GosUslugi button and go to page gosuslugi")
    public void clickGosUslugiButton(){
        gosUslugiButton.click();
        $x("//button[text()='Понятно']").click();
    }

    @Step("Check site gosuslugi is open")
    public boolean isGosUslugiSiteOpened() {
        // Проверка, что открылся сайт госуслуг
        return url().contains("https://esia.gosuslugi.ru/login/");
    }
}
