package Decorator;

public class Burger implements FoodItem {
    public String getDescription() {
        return "Burger";
    }

    public double getCost() {
        return 10.0;
    }
}
