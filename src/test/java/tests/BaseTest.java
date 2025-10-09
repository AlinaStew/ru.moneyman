package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.GosUslugiPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest  {

   public RegistrationPage registrationPage = new RegistrationPage();
   public GosUslugiPage gosUslugiPage = new GosUslugiPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://moneyman.ru/";
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    public void beforeEach() {
        open(baseUrl);
    }
}
