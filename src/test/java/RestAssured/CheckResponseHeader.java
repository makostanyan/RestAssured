package RestAssured;

import RestAssured.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckResponseHeader extends BaseTest {

    @Test
    public void checkResponseHeaderTest() {
       Assert.assertEquals(response.getHeader("Content-Type"), "application/json; charset=utf-8", "Header type is not application/json");
    }
}
