package org.maumas.ZFazendoADiferencaExercicios.capitulo5.exercicios5_11_more.fazendoADiferenca5_31;

public class Pergunta {

    private String contexto;
    private String[] perguntas;
    private int respostaCorreta;

    private Pergunta(String contexto, String[] perguntas, int respostaCorreta) {
        this.contexto = contexto;
        this.perguntas = perguntas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getContexto() {
        return contexto;
    }

    public String[] getPerguntas() {
        return perguntas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public static Pergunta[] populaPerguntas() {
        return new Pergunta[]{
                new Pergunta("O aquecimento do globo é um processo natural, mas que vem sendo intensificado pelas ações humanas, especialmente por meio da",
                        new String[]{
                                "utilização de recursos renováveis.",
                                "elevação do volume de água do mar.",
                                "acentuação do processo de arenização.",
                                "concentração de chuvas nas cidades.",
                                "emissão de poluentes na atmosfera."},
                        4),

                new Pergunta("Qual fenômeno natural está diretamente relacionado à ocorrência do aquecimento global?",
                        new String[]{
                                "Efeito estufa",
                                "Chuva ácida",
                                "Inversão térmica",
                                "Ilhas de calor",
                                "Arenização"},
                        0),

                new Pergunta("Assinale a alternativa que apresenta uma consequência do aquecimento global:",
                        new String[]{
                                "aumento da biodiversidade",
                                "diminuição da temperatura",
                                "degelo das calotas polares",
                                "inalteração do clima global",
                                "incremento da agropecuária"},
                        2),

                new Pergunta("Indique a alternativa que apresenta um impacto ambiental diretamente relacionado ao aquecimento global:",
                        new String[]{
                                "remoção da vegetação nativa",
                                "poluição visual nas metrópoles",
                                "assoreamento de cursos de água",
                                "depósito irregular de resíduos",
                                "contaminação química da água"},
                        0),

                new Pergunta("O fenômeno do aquecimento glocal marca a história da humanidade, especialmente devido à",
                        new String[]{
                                "realização das grandes Guerras Mundiais.",
                                "retração da população dos países ricos.",
                                "existência de grandes epidemias globais.",
                                "ocorrência das Revoluções Industriais.",
                                "atenuação do impacto no meio ambiente."},
                        3)

        };
    }
}
