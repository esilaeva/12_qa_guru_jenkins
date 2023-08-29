package guru.qa.properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {

    @Test
    void systemPropertiesTest(){
        String browser = System.getProperty("browser");

        System.out.println(browser);
    }

    @Test
    void systemProperties1Test(){
        System.setProperty("browser", "Chrome");
        String browser = System.getProperty("browser");

        System.out.println(browser);
    }

    @Test
    void systemProperties2Test(){
        String browser = System.getProperty("browser", "Mozilla");

        System.out.println(browser);
    }

    @Test
    void systemProperties3Test(){
        System.setProperty("browser", "Chrome");
        String browser = System.getProperty("browser", "Mozilla");

        System.out.println(browser);
    }

    @Test
    @Tag("property")
    void systemProperties4Test(){
        String browser = System.getProperty("browser", "Mozilla");

        System.out.println(browser);
    }

    @Test
    @Tag("hello")
    void systemProperties5Test(){
        String name = System.getProperty("name", "default student");
        String message = format("Hello, %s!", name);

        System.out.println(message);
    }
}
