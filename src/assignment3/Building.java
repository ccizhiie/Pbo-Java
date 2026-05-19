package assignment3;

import java.util.Scanner;

public class Building {
    private String name;
    private String address;
    private int floors;

    public void addBuilding(Scanner input) {
        System.out.print("Enter Building Name: ");
        this.name = input.nextLine();

        System.out.print("Enter Building Address: ");
        this.address = input.nextLine();

        System.out.print("Enter Number of Floors: ");
        this.floors = input.nextInt();
        input.nextLine();
        System.out.println("Building added successfully!");
    }

    public void displayBuildingInfo() {
        if (name == null) {
            System.out.println("No building data available. Please add a building first.");
        } else {
            System.out.println("\n--- Building Details ---");
            System.out.println("Building Name: " + name);
            System.out.println("Building Address: " + address);
            System.out.println("Number of Floors: " + floors);
        }
    }
}