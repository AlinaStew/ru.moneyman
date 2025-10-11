package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class MainPage {

    private final SelenideElement phoneNumberInput = $("#login"),
            passInput = $("#password"),
            titleH = $(".promo__title"),
            personalAccount = $(".header__privat"),
            loginAndPasswordButton = $x("//button[@data-test='button_switcher_login_0']"),
            enterAccountButton = $x("//button[@data-test='login_enter_by_email_phone']"),
            gosUslugiButton = $(".rcalc__gos-link");

    @Step("Cheсk H1 title")
    public MainPage openPage(){
        open(baseUrl);
        titleH.shouldHave(matchText("^Первый.*"));
        return this;
    }

    @Step("Set number")
    public MainPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    @Step("Set password")
    public MainPage setPassInput(String value) {
        passInput.setValue(value);
        return this;
    }

    @Step("Click on personal account")
    public MainPage clickPersonalAccount() {
        personalAccount.click();
        return this;
    }

    @Step("Change window")
    public MainPage clickLoginAndPasswordButton() {
        loginAndPasswordButton.click();
        return this;
    }

    @Step("Enter account")
    public MainPage clickEnterAccountButton() {
        enterAccountButton.click();
        return this;
    }

    @Step("Click on GosUslugi button and go to page gosuslugi")
    public void clickGosUslugiButton(){
        gosUslugiButton.click();
        $x("//button[text()='Понятно']").click();
    }
}
