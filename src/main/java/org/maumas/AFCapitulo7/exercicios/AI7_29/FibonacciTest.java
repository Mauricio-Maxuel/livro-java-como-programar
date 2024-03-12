package org.maumas.AFCapitulo7.exercicios.AI7_29;

public class FibonacciTest {


    public static void main(String[] args) {
        System.out.println(fibonacci(46));
    }

    static int fibonacci(int n) {

        int a = 0, b = 1, c;


        for (int i = 2; i <= n; i++) {

            c = a + b;

            a = b;
            b = c;
        }

        return b;
    }

}
