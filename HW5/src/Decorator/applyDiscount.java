package Decorator;

public class applyDiscount implements FoodItem {
    private final double discount;

    public applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return "Discount";
    }

    @Override
    public double getCost() {
        return -discount;
    }
}