package clase;

public class Pizza {
    
    public String blat;
    public String sos;
    public String toppinguri;

    public Pizza(String blat, String sos, String toppinguri) {
        this.blat = blat;
        this.sos = sos;
        this.toppinguri = toppinguri;
    }

    public String getBlat() {
        return blat;
    }

    public void setBlat(String blat) {
        this.blat = blat;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getToppinguri() {
        return toppinguri;
    }

    public void setToppinguri(String toppinguri) {
        this.toppinguri = toppinguri;
    }

    @Override
    public String toString() {
        return "Pizza { " +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", toppinguri='" + toppinguri + '\'' +
                '}';
    }
}
