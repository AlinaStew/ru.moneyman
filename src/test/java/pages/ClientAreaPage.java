package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClientAreaPage {
    private final SelenideElement contactForm = $x("//*[@id='root']/div/div/div[2]");

    @Step("Проверка видимости формы с контактными данными")
    public void checkContactForm() {
        contactForm.shouldBe(visible);
    }
}
