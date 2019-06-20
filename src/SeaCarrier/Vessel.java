package SeaCarrier;

public class Vessel {

    private String name;
    private String yearOfBuild;
    private String speed;
    private String capacity;

    public Vessel (String name, String yearOfBuild, String speed, String capacity) {
        this.name = name;
        this.yearOfBuild = yearOfBuild;
        this.speed = speed;
        this.capacity = capacity;
    }

    public String getName() {return name; }

    public String getYearOfBuild() {return yearOfBuild; }

    public String getSpeed() {return speed; }

    public String getCapacity() {return capacity; }

}
