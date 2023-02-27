package clase;
//EX 1
public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5-a si y ridicat la puterea a-7-a.
     * @return Returneaza rezultatul calculat.
     */
    public double calculateX5PlusY7() {
        double x = 2.0;  // înlocuiți 2.0 cu valoarea dorită pentru x
        double y = 3.0;  // înlocuiți 3.0 cu valoarea dorită pentru y

        double x5 = power(x, 5);
        double y7 = power(y, 7);

        return x5 + y7;
    }

    /**
     * Aceasta metoda calculeaza o baza ridicata la o anumita putere.
     * @param base Baza care trebuie ridicata la putere.
     * @param exponent Puterea la care trebuie ridicata baza.
     * @return Returneaza rezultatul ridicarii la putere.
     */
    private double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
