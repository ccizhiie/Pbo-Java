package assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Building myBuilding = new Building();

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    myBuilding.addBuilding(scanner);
                    break;
                case 2:
                    myBuilding.displayBuildingInfo();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}