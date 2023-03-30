package clase;

public class Pizzer {
    public void pregaTesteazaPizza(PizzaBuilder builder) {
        builder
                .adaugaBlat("Traditional")
                .adaugaSos("Rosii")
                .adaugaToppinguri("Mozzarella, Salam, Ciuperci, Masline");
    }

    public void pregaHawaiianPizza(PizzaBuilder builder) {
        builder
                .adaugaBlat("Pufos")
                .adaugaSos("Rosii")
                .adaugaToppinguri("Mozzarella, Sunca, Ananas");
    }
}
