package Decorator;
// HW5 CS 4800
// Gabriel Bermudez

public class Main {
    public static void main(String[] args) {
        FoodItem lettuceCheeseBurger = new Lettuce(new Cheese(new Burger()));
        System.out.println("Lettuce Cheese Burger: "+ "\nCost: $" + lettuceCheeseBurger.getCost());

        FoodItem ketchupHotDog = new Ketchup(new HotDog());
        System.out.println("Hot Dog w/ Ketchup: "+ "\nCost: $" + ketchupHotDog.getCost());

        Order order = new Order();
        order.addItem(lettuceCheeseBurger);
        order.addItem(ketchupHotDog);

        applyLoyaltyDiscount(order, Loyalty.Premium);
        System.out.println("Total Order Cost: $" + order.getTotalCost());
    }

    public static void applyLoyaltyDiscount(Order order, Loyalty status) {
        double discount = order.getTotalCost() * status.getDiscount();
        order.addItem(new applyDiscount(discount));
    }
}
