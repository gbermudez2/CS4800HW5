package Decorator;

public class HotDog implements FoodItem {
    public String getDescription() {
        return "Hot dog";
    }

    public double getCost(){
        return 7.0;
    }
}
