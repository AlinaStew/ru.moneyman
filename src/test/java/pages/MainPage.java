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
            gosUslugiButton = $(".rcalc__gos-link"),
            getMoneyButton = $x("//a[@data-test='calculator_submit']");

    @Step("Проверка открытия страницы по заголовку")
    public MainPage openPage(){
        open(baseUrl);
        titleH.shouldHave(matchText("^Первый.*"));
        return this;
    }

    @Step("Ввод номера для входа в лк")
    public MainPage setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    @Step("Ввод пароля для входа в лк")
    public MainPage setPassInput(String value) {
        passInput.setValue(value);
        return this;
    }

    @Step("Клик по кнопке 'Личный аккаунт'")
    public MainPage clickPersonalAccount() {
        personalAccount.click();
        return this;
    }

    @Step("Выбор окна 'Логин и пароль'")
    public MainPage clickLoginAndPasswordButton() {
        loginAndPasswordButton.click();
        return this;
    }

    @Step("Клик по нопке 'Войти'")
    public MainPage clickEnterAccountButton() {
        enterAccountButton.click();
        return this;
    }

    @Step("Клик по кнопке 'Госуслуги' и проверка перехода на сайт 'Госуслуги'")
    public void clickGosUslugiButton(){
        gosUslugiButton.click();
        $x("//button[text()='Понятно']").click();
    }

    @Step("Клик по кнопке 'Получить деньги'")
    public MainPage clickGetMoneyButton() {
        getMoneyButton.click();
        return this;
    }
}
