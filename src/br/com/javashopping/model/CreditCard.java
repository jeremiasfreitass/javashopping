package br.com.javashopping.model;

import br.com.javashopping.function.CreditControl;

import java.util.ArrayList;
import java.util.List;

public class CreditCard implements CreditControl{
    private double limit;
    private double balance;
    private List<Purchase> purchases;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public boolean creditControl(Purchase purchase) {
        if (this.balance > purchase.getValue()){
            this.balance -= purchase.getValue();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }
}
