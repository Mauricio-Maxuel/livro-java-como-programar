package org.maumas.AGCapitulo8.exercicios.AC8_17;

import java.util.Scanner;

public class TicTacToe {
    private enum Positions {
        X, O, EMPTY
    }

    private Positions[][] place;

    public TicTacToe() {
        this.place = fillPlace();
    }


    public void start() {
        System.out.println("Bem vindo ao Jogo da velha");
        showThing();

        run();

    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("sua jogada");

            System.out.println("X : (Linha)");
            int x = scanner.nextInt();

            System.out.println("Y : (Coluna)");
            int y = scanner.nextInt();

            if (isPlayed(x, y)) {
                break;
            }


        }
    }

    private boolean isPlayed(int x, int y) {
        if ((x < 0 || x > 2) && (y < 0 || y > 2)) {
            System.out.println("Entre com um valor de 1 a 3");
        }

        if (this.place[x][y] != Positions.EMPTY) {
            System.out.println("Já foi posicionado aqui!");
        }

        this.place[x][y] = Positions.X;

        showThing();

        return verifyStatusGame();
    }

    private boolean verifyStatusGame() {
        Positions[][] positions = this.place;

        int linha = 0;
        int coluna = 0;
        int transversal = 0;
        int transversalInvertida = 0;


        for (int i = 0; i < positions.length; i++) {

            if (transversal > 2) {
                break;
            } else {
                transversal = 0;
            }

            if (linha > 2) {
                break;
            } else {
                linha = 0;
            }

            if (coluna > 2) {
                break;
            } else {
                coluna = 0;
            }

            for (int j = 0; j < positions.length; j++) {
                if (positions[i][j] == Positions.X) {
                    linha++;
                }

                if (positions[j][i] == Positions.X) {
                    coluna++;
                }

                if (positions[i][i] == Positions.X) {
                    transversal++;
                }
            }
        }


        for (int i = positions.length - 1; i > 0; i--) {
            if (transversalInvertida > 2) {
                break;
            } else {
                transversalInvertida = 0;
            }
            if (positions[i][i] == Positions.X) {
                transversalInvertida++;
            }
        }


        return linha > 2;
    }


    private Positions[][] fillPlace() {
        Positions[][] place = new Positions[3][3];

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                place[i][j] = Positions.EMPTY;
            }
        }

        return place;
    }

    void showThing() {
        for (int i = 0; i < this.place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                switch (place[i][j]) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                        System.out.print(" - ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
