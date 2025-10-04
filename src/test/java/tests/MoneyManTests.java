import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class MoneyManTests {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Open registration form and enter incorrect data")
    void RegistrationTest() {
        step("Открываем сайт", () -> {
            registrationPage.openPage();
        });

        step("Переходим в форму входа и вводим данные", () -> {
            $x("//a[text()='Личный кабинет']").click();
            $x("//button[@data-test='button_switcher_login_0']").click();
            registrationPage.setPhoneOrEmail("99999999999");
        });
    }
}
