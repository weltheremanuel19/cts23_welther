package clase;

public class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;
    private MasinaElectrica masinaElectrica;

    public DealerAuto(String descriereMasinaFamilie, int numarLocuri, String descriereMasinaSport, int vitezaMaxima, String descriereMasinaElectrica, int autonomie) {
        this.masinaFamilie = new MasinaFamilie(descriereMasinaFamilie, numarLocuri);
        this.masinaSport = new MasinaSport(descriereMasinaSport, vitezaMaxima);
        this.masinaElectrica = new MasinaElectrica(descriereMasinaElectrica, autonomie);
    }

    public String getDetaliiMasinaFamilie() {
        return "Masina de familie: " + masinaFamilie.getDescriere() + ", numar locuri: " + masinaFamilie.getNumarLocuri();
    }

    public String getDetaliiMasinaSport() {
        return "Masina sport: " + masinaSport.getDescriere() + ", viteza maxima: " + masinaSport.getVitezaMaxima();
    }

    public String getDetaliiMasinaElectrica() {
        return "Masina electrica: " + masinaElectrica.getDescriere() + ", autonomie: " + masinaElectrica.getAutonomie();
    }
}