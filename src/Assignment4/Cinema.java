package Assignment4;

public class Cinema extends Building implements Taxable {
    private double monthlyRevenue;

    public Cinema(String name, String address, int floors, BuildingStatus status, double revenue) {
        super(name, address, floors, status);
        this.monthlyRevenue = revenue;
    }

    @Override
    public void showBuildings() {
        System.out.println("Cinema Name   : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Status        : " + status);
        System.out.println("Revenue       : Rp" + monthlyRevenue);
    }

    @Override
    public double calculateTax() {
        return monthlyRevenue * BASE_TAX_RATE;
    }
}