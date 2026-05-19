package Assignment4;

public class Hospital extends Building {
    private int numberOfBeds;

    public Hospital(String name, String address, int floors, BuildingStatus status, int beds) {
        super(name, address, floors, status);
        this.numberOfBeds = beds;
    }

    @Override
    public void showBuildings() {
        System.out.println("Hospital Name : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Status        : " + status);
        System.out.println("Total Beds    : " + numberOfBeds);
    }
}