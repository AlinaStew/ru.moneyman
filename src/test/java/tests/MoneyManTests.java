package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MoneyManTests extends BaseTest {

    @Test
    @Tag("negative")
    @DisplayName("Open registration form and enter incorrect data")
    void checkRegistrationWithIncorrectPasswordTest() {
            registrationPage.openPage()
                    .clickPersonalAccount()
                    .clickLoginAndPasswordButton()
                    .setPhoneNumber("99999999999")
                    .setPassInput("hp121212")
                    .clickEnterAccountButton();
    }


    @Test
    @DisplayName("Check go to gosuslugi site")
    void checkToGosUslugiSite() {
    gosUslugiPage.openPage()
            .clickGosUslugiButton();
    Assertions.assertTrue(gosUslugiPage.isGosUslugiSiteOpened(),
                "GosUslugi site should be opened after click");
}
    }
