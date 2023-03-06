package clase;
//Acest cod reprezintă o clasă Java numită "CalculatorRefactored", care conține o metodă numită "calculatePowXPlusPowY" și două metode private numite "calculatePower" și "readDoubleValueFromConsole".
//
//Metoda "calculatePowXPlusPowY" citește două numere de la tastatură, calculează fiecare număr ridicat la o anumită putere și apoi returnează suma acestor numere.
//
//Metoda "calculatePower" primește două argumente: baza și exponentul, și returnează baza ridicată la exponent.
//
//Metoda "readDoubleValueFromConsole" primește un mesaj de afișat la consolă, citește un număr de la tastatură, încercând să îl convertească la tipul "double" și returnează valoarea citită. În cazul în care apare o excepție de tipul "NumberFormatException" sau "IOException",
// se afișează un mesaj de eroare și se apelează din nou metoda "readDoubleValueFromConsole" pentru a citi din nou un număr de la tastatură.
//
//Acest cod respectă principiile de bune practici de programare, cum ar fi împărțirea codului în metode mai mici și utilizarea unor nume de variabile și metode semnificative și ușor de înțeles. De asemenea,
// codul utilizează un try-catch bloc pentru a gestiona excepțiile și a asigura că programul continuă să ruleze în cazul în care apare o excepție.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class CalculatorRefactored {

    public double calculatePowXPlusPowY() throws IOException {
        double x = readDoubleValueFromConsole("Tastati valoare pentru X:");
        double y = readDoubleValueFromConsole("Tastati valoare pentru Y:");
        double xToThePowerOfFive = calculatePower(x, 5);
        double yToThePowerOfSeven = calculatePower(y, 7);
        double result = xToThePowerOfFive + yToThePowerOfSeven;
        return result;
    }

    private double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    private double readDoubleValueFromConsole(String messageToShow)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(messageToShow);
            return Double.parseDouble(reader.readLine());
        }
        catch (NumberFormatException | IOException exception)
        {
            System.out.println(exception.getMessage());
            if(exception.getMessage().contains("#STOP"))
                System.exit(-1);
            return readDoubleValueFromConsole(messageToShow);
        }
    }
}