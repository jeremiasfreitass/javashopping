package br.com.javashopping.model;

public class Purchase implements Comparable<Purchase>{
    private double value;
    private String description;

    public Purchase(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Purchase purchase) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(purchase.value));
    }
}
