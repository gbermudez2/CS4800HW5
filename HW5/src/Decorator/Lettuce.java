package Decorator;

public class Lettuce extends Topping{
    public Lettuce(FoodItem decoratedFoodItem){
        super(decoratedFoodItem);
    }

    public String getDescription(){
        return super.getDescription() + ", Lettuce";
    }

    public double getCost(){
        return super.getCost() + 0.8;
    }
}