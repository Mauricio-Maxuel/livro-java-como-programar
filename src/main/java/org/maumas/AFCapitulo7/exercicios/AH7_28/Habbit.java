package org.maumas.AFCapitulo7.exercicios.AH7_28;

import java.security.SecureRandom;

public class Habbit {
    private int posicao;

    public Habbit() {
        this.posicao = 0;
    }

    private void saltoGrande() {
        this.posicao += 9;
    }

    private void saltoPequeno() {
        this.posicao += 1;
    }

    private void escorregaoGrande() {
        if (this.posicao <= 12) {
            this.posicao = 0;
        } else {
            this.posicao -= 12;
        }
    }

    private void escorregaoPequeno() {
        if (this.posicao <= 2) {
            this.posicao = 0;
        } else {
            this.posicao -= 2;
        }
    }

    private void caminhadaLenta() {
        ++this.posicao;
    }

    public void obterAcao() {
        SecureRandom secureRandom = new SecureRandom();
        int acao = 1 + secureRandom.nextInt(10);

        if (acao <= 2) {
            saltoGrande();
        } else if (acao == 3) {
            escorregaoGrande();
        } else if (acao <= 6) {
            saltoPequeno();
        } else if (acao <= 8) {
            escorregaoPequeno();
        }

        // else omitido representando dormir
    }

    public int getPosicao() {
        return posicao;
    }

}
