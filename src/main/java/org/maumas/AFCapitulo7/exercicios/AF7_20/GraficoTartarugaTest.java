package org.maumas.AFCapitulo7.exercicios.AF7_20;

public class GraficoTartarugaTest {


    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        Tartaruga tartaruga = new Tartaruga();

        executaComandos(new int[]{1, 5, 10, 3, 5, 10}, floor, tartaruga);

    }

    private static void executaComandos(int[] comandos, int[][] floor, Tartaruga tartaruga) {
        for (int i = 0; i < comandos.length; i++) {
            if (comandos[i] == 9) {
                break;
            }

            if (comandos[i] == 5) {
                separaComandos(new int[]{comandos[++i]}, floor, tartaruga);
            } else {
                separaComandos(comandos[i], floor, tartaruga);
            }
        }
    }

    private static void separaComandos(int[] valorArray, int[][] floor, Tartaruga tartaruga) {
        int valor = valorArray[0];
        andar(floor, tartaruga, valor);
    }

    private static void separaComandos(int comando, int[][] floor, Tartaruga tartaruga) {
        switch (comando) {
            case 1 -> tartaruga.canetaCima();
            case 2 -> tartaruga.canetaBaixo();
            case 3 -> tartaruga.vireDireita();
            case 4 -> tartaruga.vireEsquerda();
            case 6 -> exibirGrafico(floor, tartaruga);
        }
    }


    private static void andar(int[][] floor, Tartaruga tartaruga, int valor) {
        int x = tartaruga.getX();
        int y = tartaruga.getY();
        int valorX = x;
        int valorY = y;

        int[] direcao = tartaruga.getDirecao();

        if (direcao[0] == 0) {
            if (direcao[1] == 1) {
                valorY = y - valor;
            } else if (direcao[1] == -1) {
                valorY = y + valor;
            }

        } else if (direcao[1] == 0) {
            if (direcao[0] == 1) {
                valorX = x + valor;
            } else if (direcao[0] == -1) {
                valorX = x - valor;
            }
        }

        if (direcao[0] > 0 || direcao[1] < 0) {
            for (; x <= valorX; x++) {
                for (; y <= valorY; y++) {
                    if (tartaruga.isCanetaBaixo()) {
                        floor[tartaruga.getX()][tartaruga.getY()] = 1;
                    }
                    tartaruga.setY(y);
                }
                if (tartaruga.isCanetaBaixo()) {
                    floor[tartaruga.getX()][tartaruga.getY()] = 1;
                }
                tartaruga.setX(x);
            }
        } else {
            for (; x >= valorX; x--) {
                for (; y > valorY - 1; y--) {
                    if (tartaruga.isCanetaBaixo()) {
                        floor[tartaruga.getX()][tartaruga.getY()] = 1;
                    }
                    tartaruga.setY(y);
                }
                if (tartaruga.isCanetaBaixo()) {
                    floor[tartaruga.getX()][tartaruga.getY()] = 1;
                }
                tartaruga.setX(x);
            }
        }

        exibirGrafico(floor, tartaruga);
    }

    private static void exibirGrafico(int[][] floor, Tartaruga tartaruga) {
        System.out.println();
        for (int y = 0; y < floor.length; y++) {
            for (int x = 0; x < floor[y].length; x++) {
                if (x == tartaruga.getX() && y == tartaruga.getY()) {
                    System.out.print("T");
                } else if (floor[x][y] == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("s");
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
