package HiFi;

import java.util.Scanner;

public class HiFiSuperStar {


    public static void main(String[] args) throws InterruptedException {

        Radio radio = new Radio();
        CDplayer cDplayer = new CDplayer();

        Runnable radios = new Runnable() {
            @Override
            public void run() {
                radio.getGlosnosc(radio.isOn(true));
            }
        };

        Runnable cdPlayers = new Runnable() {
            @Override
            public void run() {
                cDplayer.zbiorPłyt();
            }
        };

        Thread watek1 = new Thread(radios);
        Thread watek2 = new Thread(cdPlayers);

        watek1.start();
        watek2.start();



            //radio.getGlosnosc(radio.isOn(true));
            //cDplayer.zbiorPłyt();

        }
    }

