package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HeaderBarPage {

    private final SelenideElement faqLink = $(byText("Вопросы и ответы")),
            contactLink = $(byText("Связаться с нами")),
            formTitle = $(byText("Оставить запрос")),
            getMoneyButton = $x("//a[@data-test='calculator_submit']"),
            productsLink = $x("//a[text()='Продукты']"),
            firstZaymWithoutPercent = $x("//a[text()='Первый заем без процентов']"),
            tarifStartOformit = $x("//a[text()='Оформить']"),
            contactForm = $x("//*[@id='root']/div/div/div[2]");

    @Step("Hover on Вопросы и ответы")
    public void hoverOnFaqLink() {
        faqLink.hover();
    }

    @Step("Click on Связаться с нами")
    public void clickOnContactLink() {
        contactLink.click();
    }

    @Step("Click on button Получить деньги")
    public void clickGetMoneyButton() {
        getMoneyButton.click();
    }

    public void verifyFormTitleText() {
        formTitle.shouldHave(text("Оставить запрос"));
    }

    @Step("Hover on Продукты")
    public void hoverOnProductsLink() {
        productsLink.hover();
    }

    @Step("Click on Первый заем без процентов")
    public void clickOnFirstZaymWithoutPercent() {
        firstZaymWithoutPercent.click();
    }

    @Step("Click on Start tarif Оформить")
    public void clickOnTarifStartOformit() {
        tarifStartOformit.scrollTo().click();
    }

    @Step("Check Contact Form should be visible")
    public void checkContactForm() {
        contactForm.shouldBe(visible);
    }
}
