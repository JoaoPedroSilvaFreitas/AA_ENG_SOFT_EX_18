package padroesestruturais.composite;

public class Concurso {

    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Concurso sem Item");
        }
        return this.item.getItem();
    }
}
