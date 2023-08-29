package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.utils.WebSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegistrationPageObjectsWithFakerTests extends TestBase {

    @Tag("smoke")
    @Tag("all")
    @Test
    void successRegistrationFullTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.deleteBanners();
        steps.fillForm();
        steps.checkResult();
    }

    @Test
    @Tag("all")
    void successRegistrationTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.deleteBanners();
        steps.fillForm();
        steps.checkResult();
    }
}
