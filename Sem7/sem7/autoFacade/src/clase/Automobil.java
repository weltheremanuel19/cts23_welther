package clase;
//De facut un exemplu in facade java: Sa contina clasa Automobil, descriere string , clasa MasinaFamilie care sa contina detalii specifice unei masini de familie, clasa MasinaSport care sa contina detalii specifice unei masini sport, clasa MasinaElectrica care sa contina detalii specifice unei masini electrice, si clasa DealerAuto care sa contina detalii despre masini
public class Automobil {
    private String descriere;

    public Automobil(String descriere) {
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }
}