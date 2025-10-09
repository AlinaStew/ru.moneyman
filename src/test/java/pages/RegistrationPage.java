package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Step;

public class RegistrationPage {

    private final SelenideElement phoneNumberInput = $("#login"),
            passInput = $("#password"),
            titleH = $(".promo__title"),
            personalAccount = $(".header__privat"),
            loginAndPasswordButton = $x("//button[@data-test='button_switcher_login_0']"),
            enterAccountButton = $x("//button[@data-test='login_enter_by_email_phone']");

    @Step("Cheсk H1 title")
    public RegistrationPage openPage(){
        open(baseUrl);
        titleH.shouldHave(text("Первый онлайн заём без процентов*"));
        return this;
    }

    @Step("Set number")
    public RegistrationPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    @Step("Set password")
    public RegistrationPage setPassInput(String value) {
        passInput.setValue(value);
        return this;
    }

    @Step("Click on personal account")
    public RegistrationPage clickPersonalAccount() {
        personalAccount.click();
        return this;
    }

    @Step("Change window")
    public RegistrationPage clickLoginAndPasswordButton() {
        loginAndPasswordButton.click();
        return this;
    }

    @Step("Enter account")
    public RegistrationPage clickEnterAccountButton() {
        enterAccountButton.click();
        return this;
    }
}
