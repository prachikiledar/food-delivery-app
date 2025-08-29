package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class OrderTests extends BaseTest {

    @Test
    public void createOrder_ShouldReturn201() {
        String orderPayload = "{ \"userId\": 1, \"title\": \"Food Order\", \"body\": \"Pizza\" }";

        given()
            .header("Content-Type", "application/json")
            .body(orderPayload)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("Food Order"))
            .body("body", equalTo("Pizza"));
    }
}
