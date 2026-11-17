package padroesestruturais.composite;

public class QuestaoObjetiva extends Item {

    private int numeroAlternativa;

    public QuestaoObjetiva(String descricao, int numeroAlternativa) {
        super(descricao);
        this.numeroAlternativa = numeroAlternativa;
    }

    public int getNumeroAlternativa() {
        return numeroAlternativa;
    }

    public void setQtdAlternativa(int numeroAlternativa) {
        this.numeroAlternativa = numeroAlternativa;
    }

    public String getItem() {
        return "Item: " + this.getDescricao() + " - Quantidade de alternativas: " + this.numeroAlternativa + "\n";
    }

}
