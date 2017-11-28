package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sergioletras on 27/11/17.
 */
@RestController
@RequestMapping("/recipes")
public class RecipeManagementApi {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
