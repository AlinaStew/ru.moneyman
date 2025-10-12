package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FaqContactPage {

    private final SelenideElement faqLink = $(byText("Вопросы и ответы")),
            contactLink = $(byText("Связаться с нами")),
            formTitle = $(byText("Оставить запрос"));

    @Step("Клик по пункту 'Связаться с нами'")
    public FaqContactPage clickOnContactLink() {
        faqLink.hover();
        contactLink.click();
        return this;
    }

    @Step("Проверка открытия формы 'Оставить запрос'")
    public void verifyFormTitleText() {
        formTitle.shouldHave(text("Оставить запрос"));
    }
}
