package tests;

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
    void RegistrationTest() {
            registrationPage.openPage()
                    .clickPersonalAccount()
                    .clickChangeWindow()
                    .setPhoneOrEmail("99999999999")
                    .setPassInput("hp121212")
                    .clickEnterAccount();
        }
    }
