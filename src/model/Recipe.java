package model;
import java.util.*;

import exceptions.DuplicatedIngredientException;
public class Recipe {
    private ArrayList<Ingredient> ingredients;  
    public Recipe(){
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String name, int weight){
        Ingredient newIngredient=new Ingredient();
        newIngredient.setName(name);
        newIngredient.setWeight(weight);
        for(int i=0; i<ingredients.size(); i++){
            if(ingredients.get(i).getName().equalsIgnoreCase(name)){
                ingredients.get(i).addWeight(weight);
                return;
            }
        }
        ingredients.add(newIngredient);
    }

    public void removeIngredient(String name){
        Ingredient newIngredient=new Ingredient();
        newIngredient.setName(name);
        for(int i=0; i<ingredients.size(); i++){
            if(name.equalsIgnoreCase(ingredients.get(i).getName())){
                ingredients.remove(i);
            }
        }
    }

    public boolean contains(String name){
        for(int i=0; i<ingredients.size();i++){
            if(ingredients.get(i).getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    public int weightCompare(String name){
        for(int i=0; i<ingredients.size();i++){
            if(ingredients.get(i).getName().equalsIgnoreCase(name)){
                return ingredients.get(i).getWeight();
            }
        }
        return 0;
    }
    public Ingredient getLast(){
        return ingredients.get(ingredients.size()-1);
    }
}
