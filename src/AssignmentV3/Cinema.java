package AssignmentV3;

//  'extends' untuk Inheritance
public class Cinema extends Building {
    // Atribut privat
    private int numberOfScreens;
    private double monthlyRevenue;

    //
    public Cinema(String name, String address, int numberOfFloors, int numberOfScreens, double monthlyRevenue) {
        super(name, address, numberOfFloors);
        this.numberOfScreens = numberOfScreens;
        this.monthlyRevenue = monthlyRevenue;
    }

    //
    @Override
    public void showbuildings() {
        System.out.println("\n Detail Of Cinema");
        super.showbuildings();
        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Monthly Revenue  : Rp " + monthlyRevenue);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}