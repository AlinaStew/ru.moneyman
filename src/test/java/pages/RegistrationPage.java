package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    private final SelenideElement phoneOrEmailInput = $("#login"),
            passInput = $("#password");

    public RegistrationPage openPage(){
        open("https://moneyman.ru");
        $(".promo__title").shouldHave(text("\n" +
                "                                            Первый онлайн заём "));
        return this;
    }

    public RegistrationPage setPhoneOrEmail(String value) {
        phoneOrEmailInput.setValue(value);
        return this;
    }
}
