package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public Response response;

    @BeforeClass
    public void initTest(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        response = RestAssured.when().get("users/").andReturn();
    }
}
