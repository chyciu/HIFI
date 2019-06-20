package SeaCarrier;

import java.lang.invoke.SwitchPoint;

public class Fleet {

    public Vessel[] listaStatków;

    public void setListaStatków(Vessel[] listaStatków) {
        this.listaStatków = listaStatków;
    }

    public void podajListeStatkow() {
        for (int i = 0; i < listaStatków.length; i++) {
            System.out.println(String.format("Nazwa statku: %s, Rok budowy: %s, Prędkość: %s knots, Ładowność: %s cars",
                    listaStatków[i].getName(),
                    listaStatków[i].getYearOfBuild(),
                    listaStatków[i].getSpeed(),
                    listaStatków[i].getCapacity()
            ));

        }
    }

    public Vessel giveVesselList(String name, String yearOfBuild, String speed, String capacity) {
        return new Vessel(name, yearOfBuild, speed, capacity);
    }

    public int iloscStatkow() {
        return listaStatków.length;
    }

    public void wyswietlIlosc() {
        System.out.println("\nLiczba statków zatrudnionych w naszej flocie: " + iloscStatkow());
    }

    public boolean sail(boolean inMove) {
        inMove = false;
        return inMove;
    }


    public void vslMove () {
        if (sail(true)) {
        System.out.println("Statek płynie");
        } else
            System.out.println("Statek przy nabrzeżu");
    }


}


