package org.maumas.AFCapitulo7.exercicios.AF7_20;

public class Tartaruga {
    private int x;
    private int y;
    private boolean isCanetaBaixo;

    /**
     * define a direção que a tartaruga irá se mover
     * <p>
     * {x = 1, y = 0} >
     * {x = 0, y = 1} ^
     * {x = -1, y = 0} <
     * {x = 0, y = -1} baixo
     */

    private int[] direcao;

    public Tartaruga() {
        x = 0;
        y = 0;

        direcao = new int[]{1, 0};
    }

    public void vireEsquerda() {
        int[] direcao = this.getDirecao();

        int x = direcao[0];
        int y = direcao[1];

        if (x == 1 && y == 0) {
            this.setDirecao(new int[]{0, 1});
        } else if (x == 0 && y == 1) {
            this.setDirecao(new int[]{-1, 0});
        } else if (x == -1 && y == 0) {
            this.setDirecao(new int[]{0, -1});
        } else if (x == 0 && y == -1) {
            this.setDirecao(new int[]{1, 0});
        }
    }

    public void vireDireita() {
        int[] direcao = this.getDirecao();

        int x = direcao[0];
        int y = direcao[1];

        if (x == 1 && y == 0) {
            this.setDirecao(new int[]{0, -1});
        } else if (x == 0 && y == 1) {
            this.setDirecao(new int[]{1, 0});
        } else if (x == -1 && y == 0) {
            this.setDirecao(new int[]{0, 1});
        } else if (x == 0 && y == -1) {
            this.setDirecao(new int[]{-1, 0});
        }
    }

    public void canetaCima() {
        this.setCanetaBaixo(false);
    }

    public void canetaBaixo() {
        this.setCanetaBaixo(true);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCanetaBaixo() {
        return isCanetaBaixo;
    }

    public void setCanetaBaixo(boolean canetaBaixo) {
        isCanetaBaixo = canetaBaixo;
    }

    public int[] getDirecao() {
        return direcao;
    }

    public void setDirecao(int[] direcao) {
        this.direcao = direcao;
    }
}
