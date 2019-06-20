package SeaCarrier;

public class OnwerMain {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Vessel[] statki ={
                fleet.giveVesselList("Hoegh London", "2000", "19,5", "5000"),
                fleet.giveVesselList("Hoegh Brasil", "2001", "18", "4800"),
                new Vessel("Hoegh Traveller", "2016", "20", "6500"),
                new Vessel("Hoegh Trooper", "2016", "20", "6500"),
        };

        fleet.setListaStatków(statki);
        fleet.podajListeStatkow();
        fleet.wyswietlIlosc();
        fleet.vslMove();

    }


}
