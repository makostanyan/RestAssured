package pojo;

import RestAssured.BaseTest;
import io.restassured.common.mapper.TypeRef;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class PrintNameAndEmail extends BaseTest {

    @Test
    public void UserNameTest() {

        List<User> returnedUserInfo = response.as(new TypeRef<>() {
        });
        List<String> nameAndEmail = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
            nameAndEmail.add(returnedUserInfo.get(i).getName());
            nameAndEmail.add(returnedUserInfo.get(i).getEmail());
        }

        for (String i : nameAndEmail) {
            System.out.println(i);
        }
    }
}
