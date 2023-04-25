package clase;

public class MasinaFamilie extends Automobil {
    private int numarLocuri;

    public MasinaFamilie(String descriere, int numarLocuri) {
        super(descriere);
        this.numarLocuri = numarLocuri;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }
}