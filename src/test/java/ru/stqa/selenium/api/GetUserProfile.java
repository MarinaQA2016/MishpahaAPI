package ru.stqa.selenium.api;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;
import ru.stqa.selenium.util.UserProfileDTO;

/**
 * Created by Inka on 21-Jun-18.
 */
public class GetUserProfile extends AuthorizedApiBase{
    String method = "/user/profile";

    @Test
    public void apiAuthorizedTest(){

        ResponseEntity<UserProfileDTO> response = restTemplate.exchange(url+method, HttpMethod.GET, requestEntity, UserProfileDTO.class);
        System.out.println("Common Information: " + response.getBody());

    }
}
