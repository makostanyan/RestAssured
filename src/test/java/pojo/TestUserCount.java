package pojo;

import RestAssured.BaseTest;
import io.restassured.common.mapper.TypeRef;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TestUserCount extends BaseTest {

    @Test
    public void UserCountTest(){

        List<User> returnedUserInfo = response.as(new TypeRef<>() {});
        List<Integer> id = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
           id.add(returnedUserInfo.get(i).getId());
        }

        Assert.assertEquals(id.size(), 10);
    }
}
