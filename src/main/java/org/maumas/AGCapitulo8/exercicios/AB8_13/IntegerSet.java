package org.maumas.AGCapitulo8.exercicios.AB8_13;

import java.util.Arrays;

public class IntegerSet {
    private boolean[] a;

    public IntegerSet() {
        this.a = new boolean[100];
    }

    public boolean[] union(boolean[] elements) {
        boolean[] elementsUnion = new boolean[100];

        for (int i = 0; i < elementsUnion.length; i++) {
            if (a[i] || elementsUnion[i]) {
                elementsUnion[i] = true;
            }
        }
        return elementsUnion;
    }

    public boolean[] intersection(boolean[] elements) {
        boolean[] elementsIntersection = new boolean[100];

        for (int i = 0; i < elementsIntersection.length; i++) {
            if (a[i] && elementsIntersection[i]) {
                elementsIntersection[i] = true;
            }
        }
        return elementsIntersection;
    }

    public void insertElement(int k) {
        a[k] = true;
    }

    public void deleteElement(int m) {
        a[m] = false;
    }

    @Override
    public String toString() {

        StringBuilder number = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < this.a.length; i++) {
            if (a[i]) {
                number.append(i);
                number.append(" ");
                isEmpty = false;
            }
        }

        return isEmpty ? "---" : number.toString();
    }
}
