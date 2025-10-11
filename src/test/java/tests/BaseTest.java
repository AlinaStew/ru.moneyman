package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.HeaderBarPage;
import pages.MainPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest  {

   public MainPage mainPage = new MainPage();
    public HeaderBarPage headerBarPage = new HeaderBarPage();

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
