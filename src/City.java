import java.util.Scanner;
//modul 1 smart city
public class City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nWelcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Building Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Building Address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter Number of Floors: ");
                    int floors = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nBuilding Name: " + name);
                    System.out.println("Building Address: " + address);
                    System.out.println("Number of Floors: " + floors);
                    System.out.println("Building added successfully!");
                    break;

                case 2:
                    System.out.println("Coming Soon");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 3);

        scanner.close();
    }
}