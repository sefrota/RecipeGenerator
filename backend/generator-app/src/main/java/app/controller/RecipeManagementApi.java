package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Recipe Management API responsible for operations related with
 * management and search of recipes
 *
 * It uses Api https://developer.edamam.com/
 *
 * The following operations are available:
 *
 * generateRecipe(listIngredientIds)
 *
 * chooseRecipe(recipe)
 *
 * saveRecipe(recipe)
 *
 * generateShoppingList(listRecipes)
 *
 */
@RestController
@RequestMapping("/recipes")
public class RecipeManagementApi {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
