/*Exemplu main*/

public class Main {
    public static void main(String[] args) {
        // crearea unei mașini cu o valoare de 10.000
        Car car = new Car();
        car.setValue(10000);
        // calcularea valorii mașinii utilizând implementarea clasei Car a metodei calculateValue()
        double carValue = car.calculateValue();
        System.out.println("Valoarea mașinii este: " + carValue);

        // crearea unui camion cu o valoare de 20.000
        Truck truck = new Truck();
        truck.setValue(20000);
        // calcularea valorii camionului utilizând implementarea clasei Truck a metodei calculateValue()
        double truckValue = truck.calculateValue();
        System.out.println("Valoarea camionului este: " + truckValue);

        // crearea unui vehicul cu o valoare de 15.000
        Vehicle vehicle = new Vehicle() {
            // clasă internă anonimă pentru a seta valoarea vehiculului la 15.000
            { setValue(15000); }
        };
        // calcularea valorii vehiculului utilizând implementarea implicită a metodei calculateValue() din clasa Vehicle
        double vehicleValue = vehicle.calculateValue();
        System.out.println("Valoarea vehiculului este: " + vehicleValue);

        // crearea unui obiect VehicleCalculations pentru a demonstra polimorfismul
        VehicleCalculations vehicleCalculations = new VehicleCalculations();

        // calcularea valorii mașinii utilizând metoda calculateVehicle() din clasa VehicleCalculations
        double carValue2 = vehicleCalculations.calculateVehicle(car);
        System.out.println("Valoarea mașinii calculată utilizând VehicleCalculations este: " + carValue2);

        // calcularea valorii camionului utilizând metoda calculateVehicle() din clasa VehicleCalculations
        double truckValue2 = vehicleCalculations.calculateVehicle(truck);
        System.out.println("Valoarea camionului calculată utilizând VehicleCalculations este: " + truckValue2);

        // calcularea valorii vehiculului utilizând metoda calculateVehicle() din clasa VehicleCalculations
        double vehicleValue2 = vehicleCalculations.calculateVehicle(vehicle);
        System.out.println("Valoarea vehiculului calculată utilizând VehicleCalculations este: " + vehicleValue2);
    }
}
