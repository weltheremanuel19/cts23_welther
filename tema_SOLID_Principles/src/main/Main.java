package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        // Cream o mașina cu motor pe benzina
        Engine gasEngine = new PetrolEngine();
        Car car1 = new Car(gasEngine);

        // Pornim motorul cu benzina
        car1.start();

        // Cream o masina cu motor diesel
        Engine dieselEngine = new DieselEngine();
        Car car2 = new Car(dieselEngine);

        // Pornim motorul cu diesel
        car2.start();

        // Cream o masina cu motor electric
        Engine electricEngine = new ElectricEngine();
        Car car3 = new Car(electricEngine);

        // Pornim motorul electric
        car3.start();
    }
}
