import io.restassured.specification.Argument;

import java.util.List;

import static io.restassured.RestAssured.given;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;
import static org.hamcrest.Matchers.equalTo;

public class BodyTest {

    @org.junit.jupiter.api.Test
    void shouldReturn() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Спасибо, Женя") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .contentType("text/plain; charset=UTF-8")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                //       .body(/* --> ваша проверка здесь <-- */)
                .body("data", equalTo("Спасибо, Женя"))
        ;
    }
}



