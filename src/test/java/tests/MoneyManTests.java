package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;
import static utils.TestData.INVALID_PASSWORD;
import static utils.TestData.INVALID_PHONE;

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
    @Tag("regression")
    @DisplayName("Нажать кнопку Гоуслуги, проверить переход на сайт Госуслуги")
    public void checkToGosUslugiSite() {
        mainPage.clickGosUslugiButton();
        sleep(6000);
        Assertions.assertTrue(url().contains("esia.gosuslugi.ru"),
                "Должен открыться сайт госуслуг. Фактический URL: " + url());
    }

    @Test
    @Tag("smoke")
    @Tag("regression")
    @DisplayName("Нажать 'Вопросы и ответы', 'Связаться с нами' и проверить наличие формы для заявки")
    public void findFormOstavitZaprosAfterClickSvyazatsyaSNami() {
        faqContactPage.clickOnContactLink()
                .verifyFormTitleText();
    }

    @Test
    @Tag("smoke")
    @Tag("regression")
    @DisplayName("Нажать 'Получить деньги', проверить открытие формы заявки ")
    public void findFormOstavitZaprosAfterClickPoluchitDengi() {
        mainPage.clickGetMoneyButton();

        clientAreaPage.checkContactForm();
    }

    @Test
    @Tag("smoke")
    @Tag("regression")
    @DisplayName("Нажать 'Продукты', 'Первый заем без процентов', выбрать тариф 'Старт', нажать 'Оформить' и проверить наличие формы для заявки")
    public void checkContactFormOfStartTarif() {
        headerBarPage.clickOnFirstZaymWithoutPercent();

        firstZaymWithoutPercentPage.clickOnTarifStartOformit();

        clientAreaPage.checkContactForm();
    }
}
