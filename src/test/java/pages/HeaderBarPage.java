package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HeaderBarPage {

    private final SelenideElement productsLink = $x("//a[text()='Продукты']"),
            firstZaymWithoutPercent = $x("//a[text()='Первый заем без процентов']");



    @Step("Клик по пункту 'Первый заем без процентов'")
    public HeaderBarPage clickOnFirstZaymWithoutPercent() {
        productsLink.hover();
        firstZaymWithoutPercent.click();
        return this;
    }
}
