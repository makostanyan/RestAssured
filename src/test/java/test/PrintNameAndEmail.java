package test;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.User;
import requests.HTTPReq;

import java.util.List;

public class PrintNameAndEmail extends BaseTest {

    @Test
    public void UserNameTest() {
        Response response = HTTPReq.get(url);
        List<User> returnedUserInfo = response.as(new TypeRef<>() {});
        HTTPReq.printList(returnedUserInfo);
    }
}
