package HiFi;


import java.util.Scanner;

public class CDplayer extends Radio {

    private String disc;
    private String tytul;
    private String wykonawca;

    public CDplayer() {
        this.disc = disc;
        this.tytul = tytul;
        this.wykonawca = wykonawca;
    }

    public String getTytul() {
        return tytul;
    }

    public String getWykonawca() {
        return wykonawca;
    }


    public void zbiorPłyt() {

        String[] cDplayers = {"Jesteś szalona", "Wszystkie dzieci nasze są", "Pan Kleks w kosmosie", "Ona tańczy dla mnie"};

        Scanner disc = new Scanner(System.in);
        System.out.println("Wpisz cyfrę od 1 do 4, aby wybrać, którą płytę chcesz słuchać.");
        int dysk = disc.nextInt();

            switch (dysk) {

                case 1:
                    System.out.println("Aktualnie słuchana płyta to: " + cDplayers[0]);
                    break;
                case 2:
                    System.out.println("Aktualnie słuchana płyta to: " + cDplayers[1]);
                    break;
                case 3:
                    System.out.println("Aktualnie słuchana płyta to: " + cDplayers[2]);
                    break;
                case 4:
                    System.out.println("Aktualnie słuchana płyta to: " + cDplayers[3]);
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }

        Scanner changeDisc = new Scanner(System.in);
        System.out.println("Wpisz cyfrę od 1 do 4, aby zmienić płytę.");
        int newDisc = changeDisc.nextInt();

        switch (newDisc) {

            case 1:
                System.out.println("Aktualnie słuchana płyta to: " + cDplayers[1]);
                break;
            case 2:
                System.out.println("Aktualnie słuchana płyta to: " + cDplayers[2]);
                break;
            case 3:
                System.out.println("Aktualnie słuchana płyta to: " + cDplayers[3]);
                break;
            case 4:
                System.out.println("Aktualnie słuchana płyta to: " + cDplayers[4]);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");

        }

    }
}