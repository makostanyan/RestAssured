package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.HTTPReq;

public class CheckStatusCode extends BaseTest{

    @Test
    public void StatusCodeTest() {
        Response response = HTTPReq.get(url);
       Assert.assertTrue(HTTPReq.isStatusCode(response,200), "Status code is not 200");
    }
}
