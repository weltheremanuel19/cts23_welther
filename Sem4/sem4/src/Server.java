//SERVER
//public class Server {
//    int portNr;
//    String name;
//    private static Server instance;
//    private Server()
//    {
//        this.portNr = 0;
//        this.name = null;
//    }
//    public static Server getInstance()
//    {
//        if(instance==null){
//            instance = new Server();
//            return Server.instance;
//        }
//        return Server.instance;
//    }
//
//    public String showStatus()
//    {
//        return "Serverul ruleaza pe portul " + portNr;
//    }
//}




//.................................................
//public class Singleton {
//    private static Singleton instance;
//    private String message;
//
//    private Singleton() {
//        // constructor privat
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}
//.................................................
//
//// SERVER
//public class Server {
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        singleton.setMessage("Mesaj de la server");
//
//        // codul serverului aici
//    }
//}
//
//// CLIENT
//public class Client {
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton.getMessage());
//
//        // codul clientului aici
//    }
//}

//Exemplu scris singelton
//O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei.
// Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului central,
// intr-un mediu securizat (sistemul va exista sub forma unui server dispus in datacentr-ul din HQ).Programatorii trebuie sa se asigure ca sistemul
// nu va putea fi replicat ca toate datele vor fi manageriate prin intermediul singurului server mentionat anterior