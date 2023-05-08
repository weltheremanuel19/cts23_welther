package main;

import clase.Stadium;

public class Main {
    public static void main(String[] args) {
        Stadium stadium1 = new Stadium("Wembley", "London");
        Stadium stadium2 = new Stadium("Allianz Arena", "Munich");
        Stadium stadium3 = new Stadium("Wembley", "London");

        stadium1.display();
        stadium2.display();
        stadium3.display();
        System.out.println(stadium1 == stadium3);
    }
}
