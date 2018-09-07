package ru.stqa.selenium.api;

import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;
import ru.stqa.selenium.util.PostDTO;

/**
 * Created by Inka on 21-Jun-18.
 */
public class GetUserStaticfieldsTest extends UnAuthorizedApiBase {
    String method = "/user/staticfields";

    @Test
    public void apiUnauthorizedTest(){

        ResponseEntity<PostDTO> response = restTemplate.getForEntity(url + method,PostDTO.class);
        System.out.println("Common Information: " + response.getBody());

    }
}
