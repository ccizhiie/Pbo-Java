package AssignmentV3;

public class Hospital extends Building {
    private int numberOfBeds;

     public Hospital(String name, String address, int numberOfFloors, int numberOfBeds) {
        super(name, address, numberOfFloors);
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void showbuildings() {
        super.showbuildings(); // Memanggil data dasar dari induk
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("---------------------");
    }
}