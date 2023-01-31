package get_http_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest02 {

    @Test
    public void test02(){

      String url="https://regres.in/api/users";

      Response response=given().when().get(url);

    //sayfaya ulaşılmıyor




    }
}
