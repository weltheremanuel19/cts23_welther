public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .setChifla("Simplă")
                .setCarne("Vită")
                .setSos("Ketchup")
                .setLegume("Roșii")
                .setCondimente("Sare și piper")
                .build();
        System.out.println("Burger: " + burger.getChifla() + " + " + burger.getCarne() + " + " + burger.getSos() + " + " + burger.getLegume() + " + " + burger.getCondimente());
    }

}
