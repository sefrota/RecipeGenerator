package app.business;

import app.dao.PantryDao;
import app.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sergioletras on 29/11/17.
 */
@Service
public class PantryManager {

    @Autowired
    PantryDao dao;

    public void addIngredient(Ingredient ingredient){
        dao.addIngredient(ingredient);
    }

    public void updateIngredient(Ingredient ingredient){
        dao.updateIngredient(ingredient);
    }

    public void removeIngredient(double id){
        dao.removeIngredient(id);
    }

    public List<Ingredient> getIngredients(){
        return dao.getIngredients();
    }

    public Ingredient getIngredient(double id) {
        return dao.getIngredient(id);
    }
}
