package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.HTTPReq;

public class CheckResponseBody extends BaseTest {

    @Test
    public void checkResponseBodyTest() {
        Response response = HTTPReq.get(url);
        Assert.assertEquals(HTTPReq.getBodySize(response), 10, "Body size is not 10");
    }
}
