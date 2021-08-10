package pojo;

import RestAssured.BaseTest;
import io.restassured.common.mapper.TypeRef;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TestUserName extends BaseTest {

    @Test
    public void UserNameTest() {

        List<User> returnedUserInfo = response.as(new TypeRef<>() {});
        List<String> name = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
            name.add(returnedUserInfo.get(i).getName());
        }

        for (String i : name) {
            if (!i.contains("Clementina DuBuque")){
                continue;
            }

            System.out.println("Clementina DuBuque");
        }
    }
}
