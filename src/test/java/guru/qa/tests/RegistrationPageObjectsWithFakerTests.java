package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.pages.TestBase;
import guru.qa.utils.WebSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class RegistrationPageObjectsWithFakerTests extends TestBase {

    @Test
    void successRegistrationFullTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.deleteBanners();
        steps.fillForm();
        steps.checkResult();
    }
}
