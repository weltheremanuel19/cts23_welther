package clase;

public class MasinaSport extends Automobil {
    private int vitezaMaxima;

    public MasinaSport(String descriere, int vitezaMaxima) {
        super(descriere);
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
}