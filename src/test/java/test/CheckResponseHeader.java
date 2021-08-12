package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.HTTPReq;

public class CheckResponseHeader extends BaseTest{

    @Test
    public void checkResponseHeaderTest() {
        Response response = HTTPReq.get(url);
        Assert.assertEquals(HTTPReq.getContentTypeAndCharset(response), "application/json; charset=utf-8", "Header type is not application/json");
    }
}
