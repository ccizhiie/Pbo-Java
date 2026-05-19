package AssignmentV3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nWelcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. Add New Hospital");
            System.out.println("3. Add New Cinema");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter Building Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Building Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Enter Number of Floors: ");
                    int numberOfFloors = scanner.nextInt();

                    Building building = new Building(name, address, numberOfFloors);
                    building.showbuildings();
                    System.out.println("Building added successfully!");
                    break;

                case 2:
                    System.out.println("Enter Hospital Name: ");
                    String hospitalName = scanner.nextLine();
                    System.out.println("Enter Hospital Address: ");
                    String hospitalAddress = scanner.nextLine();
                    System.out.println("Enter Number of Floors: ");
                    int hospitalFloors = scanner.nextInt();
                    System.out.println("Enter Number of Beds: ");
                    int numberOfBeds = scanner.nextInt();

                    // Inheritance: Membuat objek Hospital yang merupakan subclass  Building
                    Hospital hospital = new Hospital(hospitalName, hospitalAddress, hospitalFloors, numberOfBeds);
                    hospital.showbuildings(); //  method hasil Overriding
                    break;

                case 3:
                    System.out.println("Enter Cinema Name: ");
                    String cinemaName = scanner.nextLine();
                    System.out.println("Enter Cinema Address: ");
                    String cinemaAddress = scanner.nextLine();
                    System.out.println("Enter Number of Floors: ");
                    int cinemaFloors = scanner.nextInt();
                    System.out.println("Enter Number of Screens: ");
                    int numberOfScreens = scanner.nextInt();
                    System.out.println("Enter Monthly Revenue: ");
                    double revenue = scanner.nextDouble();

                    // Inheritance: Membuat objek Cinema
                    Cinema cinema = new Cinema(cinemaName, cinemaAddress, cinemaFloors, numberOfScreens, revenue);
                    cinema.showbuildings(); //  method hasil Overriding
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }
}