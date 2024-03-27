package Decorator;

public class Cheese extends Topping{
    public Cheese(FoodItem decoratedFoodItem){
        super(decoratedFoodItem);
    }

    public String getDescription(){
        return super.getDescription() + ", Cheese";
    }

    public double getCost(){
        return super.getCost() + 1.0;
    }
}