package app.dao;

import app.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by sergioletras on 29/11/17.
 */
@Repository
public class PantryDao {
    private List<Ingredient> ingredientList = new ArrayList<>();

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    public void updateIngredient(Ingredient ingredient){
        for(int i = 0; i < ingredientList.size(); i++) {
            if(ingredient.getId() == ingredientList.get(i).getId())
                ingredientList.set(i, ingredient);
        }
    }

    public void removeIngredient(double id){
        ingredientList.removeIf(i -> id == i.getId());
    }

    public List<Ingredient> getIngredients(){
        return ingredientList;
    }

    public Ingredient getIngredient(double id) {
        Optional<Ingredient> first = ingredientList.stream().filter(i -> i.getId() == id).findFirst();
        if(first.isPresent())
            return first.get();
        else
            return null;
    }
}
