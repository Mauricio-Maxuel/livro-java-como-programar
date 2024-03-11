package org.maumas.AFCapitulo7.exercicios.AG7_27;

public class CrivoEratostenes {

    public static void main(String[] args) {


        boolean[] array = new boolean[1000];


        for (int i = 0; i < array.length; i++) { // replaceable for Arrays.fill(array, true)
            array[i] = true;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                for (int j = i + 1; j < array.length; j++) {
                    if (j % i == 0) {
                        array[j] = false;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                System.out.println(i);
            }
        }


    }

}
