package ro.ase.cts.s04;

public class ElectricCar implements Car {
    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String charger;

    @Override
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setInsideDesign(String insideDesign) {
        this.insideDesign = insideDesign;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String showDetails() {
        return "MasinaElectrica{" +
                "sasiu='" + chassis + '\'' +
                ", roti='" + wheels + '\'' +
                ", motor='" + engine + '\'' +
                ", interior='" + insideDesign + '\'' +
                ", incarcator='" + charger + '\'' +
                '}';
    }
}
