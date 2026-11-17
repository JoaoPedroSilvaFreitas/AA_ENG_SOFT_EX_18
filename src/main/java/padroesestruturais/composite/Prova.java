package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Prova extends Item {

    private List<Item> itens;

    public Prova(String descricao) {
        super(descricao);
        this.itens = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public String getItem() {
        String saida = "";
        saida = "Prova: " + this.getDescricao() + "\n";
        for (Item item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}
