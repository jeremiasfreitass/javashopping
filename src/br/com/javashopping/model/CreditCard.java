package br.com.javashopping.model;

import br.com.javashopping.function.CreditControl;

public class CreditCard implements CreditControl{
    private double limit;
    private double balance;

    public CreditCard(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean creditControl(Purchase purchase) {
        if (purchase.getValue() > this.getLimit()){
            System.out.println("Saldo insuficiente!");
            return false;
        }else {
            this.balance = this.getLimit();
            this.balance -= purchase.getValue();
            return true;
        }
    }
}
