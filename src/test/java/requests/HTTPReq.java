package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import pojo.User;
import java.util.ArrayList;
import java.util.List;

public class HTTPReq {

    public static Response get(String url){
        Response response;
        return response = RestAssured.when().get(url).andReturn();
    }

    public static Response post(String url, ResponseBody body, Response response){
        return response;
    }

    public static boolean isStatusCode(Response response, int code){
        if(response.getStatusCode() == code){
          return true;
        }
        return false;
    }

    public static String getContentTypeAndCharset(Response response){
       return response.getHeader("Content-Type");
    }

    public static int getBodySize(Response response){
        return response.jsonPath().getList("id").size();

    }
    public  static int getIdListSize(Response response, List<User> returnedUserInfo){
        List<Integer> id = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
            id.add(returnedUserInfo.get(i).getId());
        }
        return id.size();
    }

    public static List<String> getNameList(Response response, List<User> returnedUserInfo){
        List<String> name = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
            name.add(returnedUserInfo.get(i).getName());
        }
        return name;
    }

    public static boolean isListContainName(List<String> names, String name){
        for (String i : names) {
            if (!i.contains(name)){
                continue;
            }
        } return true;
    }

    public static List<String> getNameAndEmailList(List<User> returnedUserInfo){
        List<String> nameAndEmail = new ArrayList<>();

        for (int i = 0; i < returnedUserInfo.size(); i++) {
            nameAndEmail.add(returnedUserInfo.get(i).getName());
            nameAndEmail.add(returnedUserInfo.get(i).getEmail());
        }
        return nameAndEmail;
    }

    public static void printList(List<User> list){
        for (String i : getNameAndEmailList(list)) {
            System.out.println(i);
        }
    }
}
