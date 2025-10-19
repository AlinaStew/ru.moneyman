package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class FirstZaymWithoutPercentPage {

    private final SelenideElement tarifStartOformit = $x("//a[text()='Оформить']");

    @Step("Клик по кнопке 'Оформить' в тарифе 'Старт'")
    public FirstZaymWithoutPercentPage clickOnTarifStartOformit() {
        tarifStartOformit.scrollTo().click();
        return this;
    }
}
