package Decorator;

public class Fries implements FoodItem {
    public String getDescription() {
        return "French fries";
    }

    public double getCost(){
        return 3.0;
    }
}
