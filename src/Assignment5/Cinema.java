package Assignment5;

public class Cinema extends Building implements Taxable {
    private double monthlyRevenue;

    public Cinema(String name, String address, int floors, BuildingStatus status, double revenue) throws InvalidDataException {
        super(name, address, floors, status);
        this.monthlyRevenue = revenue;
    }

    @Override
    public void showBuildings() {
        System.out.println("Cinema Name   : " + name + " | Revenue: Rp" + monthlyRevenue + " | Status: " + status);
    }

    @Override
    public double calculateTax() {
        return monthlyRevenue * BASE_TAX_RATE;
    }
}