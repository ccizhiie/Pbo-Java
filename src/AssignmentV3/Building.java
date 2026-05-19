package AssignmentV3;

public class Building {
    private String name;
    private String address;
    private int numberOfFloors;

    public Building(String name, String address, int numberOfFloors) {
        this.name = name;
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }

    public void showbuildings() {
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Building Name: " + name);
        System.out.println("Building Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }
}