package app.controller;

import app.business.PantryManager;
import app.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Pantry Management API responsible for operations related with
 * management of the available ingredients in the pantry
 *
 * The following operations are available:
 *
 * addIngredient(ingredient)
 *
 * updateIngredient(ingredient)
 *
 * removeIngredient(id)
 *
 * getIngredients(filter)
 *
 * getIngredient(id)
 */
@RestController
@RequestMapping("/pantry")
public class PantryManagementApi {

    @Autowired
    private PantryManager manager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/getIngredients", method = RequestMethod.GET)
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = manager.getIngredients();
        return ingredients;
    }

    @RequestMapping(value = "/getIngredient/{id}", method = RequestMethod.GET)
    public Ingredient getIngredient(@PathVariable double id){
        return manager.getIngredient(id);
    }

    @RequestMapping(value = "/addIngredient", method = RequestMethod.POST)
    public void addIngredient(@RequestBody Ingredient ingredient){
        manager.addIngredient(ingredient);
    }

    @RequestMapping(value = "/updateIngredient", method = RequestMethod.PUT)
    public void updateIngredient(@RequestBody Ingredient ingredient){
        manager.updateIngredient(ingredient);
    }

    @RequestMapping(value = "/removeIngredient/{id}", method = RequestMethod.DELETE)
    public void removeIngredient(@PathVariable double id){
        manager.removeIngredient(id);
    }
}
