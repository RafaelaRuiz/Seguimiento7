package exceptions;

public class DuplicatedIngredientException extends RuntimeException{
    public DuplicatedIngredientException(){
        super("ingrediente ya existe");
    }
}
