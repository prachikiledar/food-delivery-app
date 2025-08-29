package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setup() {
        // Public JSONPlaceholder API for demo purpose
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
