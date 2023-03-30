//Clasa PizzaBuilder - construiește obiectul Pizza în mai multe etape și returnează instanța finală.
package clase;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza("", "", "");
    }

    public PizzaBuilder adaugaBlat(String blat) {
        pizza.setBlat(blat);
        return this;
    }

    public PizzaBuilder adaugaSos(String sos) {
        pizza.setSos(sos);
        return this;
    }

    public PizzaBuilder adaugaToppinguri(String toppinguri) {
        pizza.setToppinguri(toppinguri);
        return this;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
