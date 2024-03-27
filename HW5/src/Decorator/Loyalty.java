package Decorator;

public enum Loyalty {
    Gold(0.1),
    Premium(0.2),
    Ultra(0.3);

    private final double discount;

    Loyalty(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
