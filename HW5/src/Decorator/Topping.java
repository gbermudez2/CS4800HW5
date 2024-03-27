package Decorator;

public abstract class Topping implements FoodItem{
    protected FoodItem decoratedFoodItem;

    public Topping(FoodItem decoratedFoodItem){
        this.decoratedFoodItem = decoratedFoodItem;
    }

    public String getDescription(){
        return decoratedFoodItem.getDescription();
    }

    public double getCost(){
        return decoratedFoodItem.getCost();
    }
}
