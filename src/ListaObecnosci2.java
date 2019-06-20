import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaObecnosci2 {


 public static void main(String[] args) throws FileNotFoundException {
            Map<String, Integer> listaObecnosci = new HashMap<>();

            File plik = new File("wynikMeczu.txt");
            Scanner scanner = new Scanner(plik);
            do {
                System.out.println("Ładowanie osoby z Pliku: ");
                String dane = scanner.nextLine();
                String[] lista = dane.split(";");
                System.out.println(String.format("Wczytano użytkownika %s", lista[0]));
                System.out.println(String.format("Liczba jego obecności to: %s", lista[1]));
            } while (scanner.hasNext());

        }
 }
