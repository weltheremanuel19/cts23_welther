package clase;

public class FabricaDeMasini {

    private static FabricaDeMasini instance;

    private FabricaDeMasini() {
        // constructor privat pentru a preveni instantierea obiectelor din exteriorul clasei
    }

    public static synchronized FabricaDeMasini getInstance() {
        if (instance == null) {
            instance = new FabricaDeMasini();
        }
        return instance;
    }

    public <Masina> void adaugaDateMasina(Masina masina) {
        // implementare adaugare date in sistemul centralizat
    }

    public <Masina> void modificaDateMasina(Masina masina) {
        // implementare modificare date in sistemul centralizat
    }

    // alte metode necesare pentru gestionarea sistemului de monitorizare

}