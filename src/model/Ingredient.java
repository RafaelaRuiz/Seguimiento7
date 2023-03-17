package model;

import exceptions.InvalidNumberException;

public class Ingredient{
    private String name;
    private int weight;
    public Ingredient() {
        name = null;
        weight = 0;
    }
    public void addWeight(int plusWeight) {
        if(plusWeight<0){
            throw new InvalidNumberException(); 
        }else{
            this.weight= plusWeight+weight;
        }
    }
    public void removeWeight(int subsWeight) {
        if (subsWeight < 0) {
            throw new InvalidNumberException();
        }
        this.weight = weight-subsWeight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}