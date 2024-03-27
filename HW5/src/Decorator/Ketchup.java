package Decorator;

public class Ketchup extends Topping{
    public Ketchup(FoodItem decoratedFoodItem){
        super(decoratedFoodItem);
    }

    public String getDescription(){
        return super.getDescription() + ", Ketchup";
    }

    public double getCost(){
        return super.getCost() + 1.0;
    }
}
