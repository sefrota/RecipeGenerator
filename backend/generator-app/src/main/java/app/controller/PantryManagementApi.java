package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Pantry Management API responsible for operations related with
 * management of the available ingredients in the pantry
 *
 * The following operations are available:
 *
 * addIngredient(ingredient)
 *
 * updateIngredient(id, ingredient)
 *
 * removeIngredient(id)
 *
 * getIngredients(filter)
 */
@RestController
@RequestMapping("/pantry")
public class PantryManagementApi {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/getIngredients", method = RequestMethod.GET)
    public String getIngredients() {
        return "Greetings from Spring Boot!";
    }

}
