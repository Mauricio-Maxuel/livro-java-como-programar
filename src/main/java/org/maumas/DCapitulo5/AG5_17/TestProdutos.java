package org.maumas.DCapitulo5.AG5_17;

import java.util.Scanner;

public class TestProdutos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo a loja");

        double total = 0.0;

        System.out.println("você deseja comprar: 1 -> sim, 2 -> finalizar ");
        int escolha = scanner.nextInt();
        while (escolha != 2) {

            System.out.println(
                    "produto 1, US$ 2,98;\n" +
                            "produto 2, US$ 4,50;\n" +
                            "produto 3, US$ 9,98;\n" +
                            "produto 4, US$ 4,49;\n" +
                            "e produto 5, US$ 6,87;\n");

            System.out.println("Numero do produto");
            int numeroProduto = scanner.nextInt();

            System.out.println("Quantidade");
            int quantidadeProduto = scanner.nextInt();

            switch (numeroProduto) {
                case 1:
                    total += 2.98 * quantidadeProduto;
                    break;
                case 2:
                    total += 4.50 * quantidadeProduto;
                    break;
                case 3:
                    total += 9.98 * quantidadeProduto;
                    break;
                case 4:
                    total += 4.49 * quantidadeProduto;
                    break;
                case 5:
                    total += 6.87 * quantidadeProduto;
                    break;
            }

            System.out.println("Deseja continuar comprando? 1 -> sim, 2 -> finalizar");
            escolha = scanner.nextInt();
        }


        System.out.println("o total da compra foi : " + total + "US$");

    }

}
