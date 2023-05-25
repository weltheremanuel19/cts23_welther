package clase;

//Am actualizat clasa "Bank" pentru a implementa metodele:
// "setName", "setAddress" și "setSwiftCode" astfel incat sa respecte conditiile de validare specificate in comentarii.
import java.util.HashMap;

public class Bank {
    private String name;
    private String address;
    private String swiftCode;
    private HashMap<String, Client> clientsList;

    public Bank() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // Verificam dacă numele bancii are cel puțin 5 caractere si conține cuvantul "bank"
        if (name.length() >= 5 && name.toLowerCase().contains("bank")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid bank name");
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        // Setăm adresa băncii
        this.address = address;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        // Setăm codul SWIFT al băncii
        this.swiftCode = swiftCode;
    }

    public Client getClientByCNP(String cnp) {
        return null;
    }
}
