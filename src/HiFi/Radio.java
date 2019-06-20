package HiFi;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Radio {

    boolean on;
    String stacja;
    double glosnosc;


    public Radio() {
        this.on = on;
        this.stacja = stacja;
        this.glosnosc = glosnosc;
    }


    public boolean isOn(boolean on) {
        if (on == true) {
            System.out.println("Radio jest włączone i możesz korzystać z innych funkcji.");
            ZonedDateTime dataCzas = ZonedDateTime.now();
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy, HH : mm");
            String dzien = dataCzas.format(f);
            System.out.println("Aktualna data i czas: " + dzien);
        } else
            System.out.println("Radio nie jest włączone i nie możesz korzystać z innych funkcji.");
        return on;
    }


    public void getGlosnosc(boolean on) {

        boolean flag = true;

        try {
            if (on == false) {
                System.out.println("Głośność nie może być teraz regulowana.");
                System.out.println("Aby włączyć radio wpisz:" + "  1");

                Scanner starter = new Scanner(System.in);
                int start = starter.nextInt();

                if (start == 1) {
                    isOn(true);
                    getGlosnosc(true);
                } else
                    System.out.println("Niestety niepoprawny wybór.");

            } else {

                // int[] volume = new int[30]; {
                // for (int i = 0; i <= volume.length; i++) {
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Zakres głośności od 0 do 30 - możesz teraz wybrać: ");
                    int vol = input.nextInt();

                    if (vol >= 0 && vol <= 30) {
                        System.out.println("Aktualny poziom głośności to: " + vol);

                    do {
                        String[] stations = {"Jazz", "Rock", "Blues", "Heavy Metal", "Disco", "Informacje", "POP", "Funky", "80's", "90's", "2000's"};
                        for (int j = 0; j <= stations.length; j++) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Wybierz stację radiową wpisując dowolną liczbę");
                            String stacja = scanner.nextLine();
                            System.out.println("Aktualnie słuchana stacja to: " + stations[j]);

                        }
                    } while (flag);

                }  else
                        System.out.println("Podałeś wartość spoza zakresu regulacji głośności.");
                        System.out.println("Nie możesz wybrać żadnej stacji.");

                } while (flag);
            }
        } catch (Exception e) {
            System.out.println("Podałeś wartość spoza zakresu regulacji głośności.");
            System.out.println("Wyszedłeś poza zakres stacji na tym odbiorniku.");
        }
    }
}










