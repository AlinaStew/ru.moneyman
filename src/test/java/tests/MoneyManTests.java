package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HeaderBarPage;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class MoneyManTests extends BaseTest {

    @Test
    @Tag("negative")
    @DisplayName("Open registration form and enter incorrect data")
    public void checkRegistrationWithIncorrectPasswordTest() {
            mainPage.openPage()
                    .clickPersonalAccount()
                    .clickLoginAndPasswordButton()
                    .setPhoneNumber("99999999999")
                    .setPassInput("hp121212")
                    .clickEnterAccountButton();
    }


    @Test
    @DisplayName("Check go to gosuslugi site")
    public void checkToGosUslugiSite() {
        mainPage.openPage()
                .clickGosUslugiButton();
        sleep(5000);
        Assertions.assertTrue(url().contains("esia.gosuslugi.ru"),
                "Должен открыться сайт госуслуг. Фактический URL: " + url());
    }

    @Test
    @DisplayName("Header bar Вопросы и ответы, click Связаться с нами and find form Оставить запрос")
    public void findFormOstavitZapros() {
        mainPage.openPage();

        headerBarPage.hoverOnFaqLink();
        headerBarPage.clickOnContactLink();
        headerBarPage.verifyFormTitleText();
    }

    @Test
    @DisplayName("Check Contact Form from Tarif Start should be visible")
    public void checkContactFormOfStartTarif() {
        mainPage.openPage();

        headerBarPage.hoverOnProductsLink();
        headerBarPage.clickOnFirstZaymWithoutPercent();
        headerBarPage.clickOnTarifStartOformit();
        headerBarPage.checkContactForm();
    }
    }
