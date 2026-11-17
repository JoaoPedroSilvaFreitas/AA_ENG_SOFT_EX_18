package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcursoTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Prova linguaPortuguesa = new Prova("Língua Portuguesa");

        Prova matematica = new Prova("Matemática");
        QuestaoObjetiva itemMT1 = new QuestaoObjetiva("2 + 2?", 4);
        matematica.addItem(itemMT1);

        Prova geografia = new Prova("Geografia");
        QuestaoObjetiva itemGEO1 = new QuestaoObjetiva("Capital do Brasil?", 3);
        QuestaoObjetiva itemGEO2 = new QuestaoObjetiva("Bioma predominante em Juiz de Fora?", 4);
        geografia.addItem(itemGEO1);
        geografia.addItem(itemGEO2);

        Prova avaliacao_mista = new Prova("Avaliacao Mista de LP - MT - GEO");
        avaliacao_mista.addItem(linguaPortuguesa);
        avaliacao_mista.addItem(matematica);
        avaliacao_mista.addItem(geografia);

        Concurso concurso = new Concurso();
        concurso.setItem(avaliacao_mista);

        assertEquals("Prova: Avaliacao Mista de LP - MT - GEO\n" +
        "Prova: Língua Portuguesa\n" +
        "Prova: Matemática\n" +
        "Item: 2 + 2? - Quantidade de alternativas: 4\n" +
        "Prova: Geografia\n" +
        "Item: Capital do Brasil? - Quantidade de alternativas: 3\n" +
        "Item: Bioma predominante em Juiz de Fora? - Quantidade de alternativas: 4\n", concurso.getItem());
    }




    @Test
    void deveRetornarExecacaoConcursoSemItem() {
        try {
            Concurso disciplina = new Concurso();
            disciplina.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Concurso sem Item", e.getMessage());
        }
    }
}