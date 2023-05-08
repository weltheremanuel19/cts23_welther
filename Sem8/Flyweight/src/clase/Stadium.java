package clase;
//nu am gasit pe platforma exemplu cu Flyweight, asa ca l-am scris :)
public class Stadium {
    private final String name;
    private final String city;
    private static final int DEFAULT_CAPACITY = 10000; // valoarea implicita a capacitatii unui stadion
    private final int capacity;

    public Stadium(String name, String city) {
        this(name, city, DEFAULT_CAPACITY);
    }

    public Stadium(String name, String city, int capacity) {
        this.name = name;
        this.city = city;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " in " + city + " with capacity of " + capacity + " seats");
    }
}
