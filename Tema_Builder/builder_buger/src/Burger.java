//Să se implementeze un builder pentru crearea unui obiect de tip Burger, având câmpurile "tip de chiflă", "carne", "sos", "legume" și "condimente".
// Builderul trebuie să ofere metode pentru a seta fiecare câmp în parte, respectiv "setChifla(String)", "setCarne(String)", "setSos(String)", "setLegume(String)" și "setCondimente(String)".
// De asemenea, builderul trebuie să ofere o metodă "build()" pentru a crea obiectul Burger cu valorile setate în câmpuri.
// Trebuie să se asigure că obiectul Burger creat are toate câmpurile setate corect.
public class Burger {
    private String chifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;

    private Burger(BurgerBuilder builder) {
        this.chifla = builder.chifla;
        this.carne = builder.carne;
        this.sos = builder.sos;
        this.legume = builder.legume;
        this.condimente = builder.condimente;
    }

    public String getChifla() {
        return chifla;
    }

    public String getCarne() {
        return carne;
    }

    public String getSos() {
        return sos;
    }

    public String getLegume() {
        return legume;
    }

    public String getCondimente() {
        return condimente;
    }

    public static class BurgerBuilder {
        private String chifla;
        private String carne;
        private String sos;
        private String legume;
        private String condimente;

        public BurgerBuilder setChifla(String chifla) {
            this.chifla = chifla;
            return this;
        }

        public BurgerBuilder setCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public BurgerBuilder setSos(String sos) {
            this.sos = sos;
            return this;
        }

        public BurgerBuilder setLegume(String legume) {
            this.legume = legume;
            return this;
        }

        public BurgerBuilder setCondimente(String condimente) {
            this.condimente = condimente;
            return this;
        }

        public Burger build() {
            if (chifla == null || carne == null || sos == null || legume == null || condimente == null) {
                throw new IllegalStateException("Toate câmpurile trebuie setate");
            }
            return new Burger(this);
        }
    }
}
