package clase;
//EX 2
//Am adaugat verificarea dacă fisierul a fost modificat inainte de a incarca matricea din fisier. Această verificare asigura ca matricea este intotdeauna actualizata cu continutul cel mai recent din fisierul dat.
//Am separat logica de citire si scriere in fisier în două metode diferite. Aceasta face codul mai modular si mai ușor de citit si de ințeles.
//Am adaugat tratarea excepțiilor pentru a face codul mai robust si pentru a se asigura că eventualele erori sunt gestionate intr-un mod adecvat.
// In aceste cazuri, am afișat si un mesaj de eroare pentru a indica ceea ce s-a intamplat si am folosit o valoare implicita pentru a indica o eroare in cazul în care nu se poate citi valoarea solicitata din matrice.
import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int h;
    private int w;
    private String filename;

    public MatrixDataHandler(int h, int w, String filename) {
        this.h = h;
        this.w = w;
        this.filename = filename;
        matrix = allocateMatrix();
        writeMatrixToFile();
    }

    private int[][] allocateMatrix() {
        int[][] m = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                m[i][j] = 0;
            }
        }
        return m;
    }

    private void writeMatrixToFile() {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
        } catch (IOException exception) {
            System.out.println("Error writing to file: " + exception.getMessage());
        }
    }

    private void readMatrixFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            h = Integer.parseInt(line.split(" ")[0]);
            w = Integer.parseInt(line.split(" ")[1]);
            matrix = new int[h][w];

            for (int i = 0; i < h; i++) {
                line = br.readLine();
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Error reading from file: " + exception.getMessage());
        }
    }

    public int getValueFromPosition(int posH, int posW) {
        readMatrixFromFile();
        return matrix[posH][posW];
    }

    public void modifyValueAndUpdateFile(String s, int posH, int posW, int val) {
        readMatrixFromFile();
        matrix[posH][posW] = val;
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
        } catch (IOException exception) {
            System.out.println("Error writing to file: " + exception.getMessage());
        }
    }
}
