package org.maumas.ECapitulo6.exercicios.AT6_26;

public class InvertendoDigitos {

    public static void main(String[] args) {

        System.out.println(inverterNumero(7631));

    }

    public static int inverterNumero(int numero) {

//        String s = String.valueOf(numero);
//        String next = "";
//
//        for (int i = s.length(); i > 0; i--) {
//            next += s.charAt(i - 1);
//        }
//
//        return Integer.valueOf(next);

        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // obtém o último dígito, pois /ntodo o numero mod 10, o resultado é o ultimo algarismo
            numeroInvertido = numeroInvertido * 10 + digito; // aqui trabalhamos com as dezenas (1,10,100)
            numero /= 10; // diminuimos uma dezena do numero original
        }

        return numeroInvertido;

    }

}
