package Assignment4;

public abstract class Building {
    protected String name;
    protected String address;
    protected int numberOfFloors;
    protected BuildingStatus status;

    public Building(String name, String address, int numberOfFloors, BuildingStatus status) {
        this.name = name;
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.status = status;
    }

        public abstract void showBuildings();

    public String getName() {
        return name;
    }
}