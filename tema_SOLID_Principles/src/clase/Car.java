package clase;

public class Car { // Declara clasa "Car"
    private Engine engine; // Declara membrul privat "engine" de tipul "Engine"

    public Car(Engine e) { // Declara constructorul "Car" care primeste un obiect "Engine" ca parametru
        engine = e; // Atribuie valoarea primita ca parametru membrului privat "engine"
    }

    public void start() { // Declara metoda publica "start"
        engine.start(); // Apeleaza metoda "start" a obiectului "engine"
    }
}
