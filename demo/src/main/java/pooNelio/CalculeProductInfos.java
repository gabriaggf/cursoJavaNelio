package pooNelio;

import entities.Product;

import java.util.Scanner;

public class CalculeProductInfos {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "TV";
        product1.price = 900;
        product1.quantity = 10;

        System.out.println("Deseja adicionar ou remover produtos? Para adicionar digite 1, para remover digite 2: ");
        var response = sc.nextInt();
        switch (response) {
            case 1:
                System.out.println("Quantos produtos deseja adicionar? ");
                int quantityToAdd = sc.nextInt();
                product1.addProducts(quantityToAdd);
                break;
            case 2:
                System.out.println("Quantos produtos deseja remover? ");
                int removeProducts = sc.nextInt();
                product1.removeProducts(removeProducts);
                break;
            default:
                System.out.println("ERRO");
                break;

        }

    }

}
