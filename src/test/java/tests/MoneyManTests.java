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
import static utils.TestData.*;

public class MoneyManTests extends BaseTest {

    @Test
    @Tag("negative")
    @DisplayName("Открыть сайт, нажать 'Личный кабинет' и ввести неправильный логин и пароль")
    public void checkRegistrationWithIncorrectPasswordTest() {
            mainPage.clickPersonalAccount()
                    .clickLoginAndPasswordButton()
                    .setPhoneNumber(INVALID_PHONE)
                    .setPassInput(INVALID_PASSWORD)
                    .clickEnterAccountButton();
        }


    @Test
    @DisplayName("Нажать кнопку Гоуслуги, проверить переход на сайт Госуслуги")
    public void checkToGosUslugiSite() {
        mainPage.clickGosUslugiButton();
        sleep(5000);
        Assertions.assertTrue(url().contains("esia.gosuslugi.ru"),
                "Должен открыться сайт госуслуг. Фактический URL: " + url());
        }

    @Test
    @DisplayName("Нажать 'Вопросы и ответы', 'Связаться с нами' и проверить наличие формы для заявки")
    public void findFormOstavitZaprosAfterClickSvyazatsyaSNami() {

        faqContactPage.clickOnContactLink()
                .verifyFormTitleText();
        }

    @Test
    @DisplayName("Нажать 'Получить деньги', проверить открытие формы заявки ")
    public void findFormOstavitZaprosAfterClickPoluchitDengi() {

        mainPage.clickGetMoneyButton();

        clientAreaPage.checkContactForm();
        }

    @Test
    @DisplayName("Нажать 'Продукты', 'Первый заем без процентов', выбрать тариф 'Старт', нажать 'Оформить' и проверить наличие формы для заявки")
    public void checkContactFormOfStartTarif() {

        headerBarPage.clickOnFirstZaymWithoutPercent();

        firstZaymWithoutPercentPage.clickOnTarifStartOformit();

        clientAreaPage.checkContactForm();
        }
    }
