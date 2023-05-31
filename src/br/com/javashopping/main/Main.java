package br.com.javashopping.main;
import br.com.javashopping.model.CreditCard;
import br.com.javashopping.model.Purchase;

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

            }

        }

    }
}
