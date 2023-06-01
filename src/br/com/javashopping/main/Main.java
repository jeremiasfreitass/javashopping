package br.com.javashopping.main;
import br.com.javashopping.model.CreditCard;
import br.com.javashopping.model.Purchase;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limit = scanner.nextDouble();
        CreditCard creditCard = new CreditCard(limit);


        int stop = 1;
        while (stop != 0){
            System.out.println("Digite a descrição da compra: ");
            String description = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double value = scanner.nextDouble();

            Purchase purchase = new Purchase(value,description);

            boolean sucess = creditCard.creditControl(purchase);

            if (sucess == true){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para terminar ou 1 para registrar nova compra.");
                stop = scanner.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                stop = 0;
                //System.out.println(creditCard.getLimit());
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(creditCard.getPurchases());

        for (Purchase purchase : creditCard.getPurchases()) {
            System.out.println(purchase.getDescription() + " - " +purchase.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + creditCard.getBalance());

    }
}
