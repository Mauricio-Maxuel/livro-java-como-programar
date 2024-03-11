package org.maumas.AFCapitulo7.exercicios.AH7_28;

import java.security.SecureRandom;

public class Turtle {
    private int posicao;

    public Turtle() {
        this.posicao = 0;
    }

    private void caminhadaRapida() {
        this.posicao += 3;
    }

    private void escorregao() {
        if (this.posicao <= 6) {
            this.posicao = 0;
        } else {
            this.posicao -= 6;
        }
    }

    private void caminhadaLenta() {
        ++this.posicao;
    }

    public void obterAcao() {
        SecureRandom secureRandom = new SecureRandom();
        int acao = 1 + secureRandom.nextInt(10);

        if (acao <= 5) {
            caminhadaRapida();
        } else if (acao <= 7) {
            escorregao();
        } else {
            caminhadaLenta();
        }
    }

    public int getPosicao() {
        return posicao;
    }
}
