package Assignment5;

public class Hospital extends Building {
    private int numberOfBeds;

    public Hospital(String name, String address, int floors, BuildingStatus status, int beds) throws InvalidDataException {
        super(name, address, floors, status);
        this.numberOfBeds = beds;
    }

    @Override
    public void showBuildings() {
        System.out.println("Hospital Name : " + name + " | Beds: " + numberOfBeds + " | Status: " + status);
    }
}