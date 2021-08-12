package test;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.User;
import requests.HTTPReq;

import java.util.List;

public class TestUserCount extends BaseTest {

    @Test
    public void UserCountTest(){
        Response response = HTTPReq.get(url);
        List<User> returnedUserInfo = response.as(new TypeRef<>() {});
        Assert.assertEquals(HTTPReq.getIdListSize(response, returnedUserInfo), 10);
    }
}
