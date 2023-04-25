package clase;

public class MasinaElectrica extends Automobil {
    private int autonomie;

    public MasinaElectrica(String descriere, int autonomie) {
        super(descriere);
        this.autonomie = autonomie;
    }

    public int getAutonomie() {
        return autonomie;
    }
}