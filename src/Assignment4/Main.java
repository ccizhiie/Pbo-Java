package Assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Building savedBuilding = null;
        int menu;

        do {
            System.out.println("\n=== SMART CITY SYSTEM ===");
            System.out.println("1. Add Building");
            System.out.println("2. View Building Data");
            System.out.println("3. Exit");
            System.out.print("Choose Menu: ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nSelect Building Type:");
                    System.out.println("1. Cinema ");
                    System.out.println("2. Hospital");
                    System.out.print("Choice: ");
                    int type = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Building Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Address      : ");
                    String addr = scan.nextLine();
                    System.out.print("Number of Floors   : ");
                    int floors = scan.nextInt();

                    if (type == 1) {
                        System.out.print("Monthly Revenue    : ");
                        double revenue = scan.nextDouble();
                        // Upcasting Cinema ke Building
                        savedBuilding = new Cinema(name, addr, floors, BuildingStatus.ACTIVE, revenue);
                    } else if (type == 2) {
                        System.out.print("Number of Beds     : ");
                        int beds = scan.nextInt();
                        // Upcasting Hospital ke Building
                        savedBuilding = new Hospital(name, addr, floors, BuildingStatus.ACTIVE, beds);
                    }
                    System.out.println("Building Added Successfully!");
                    break;

                case 2:
                    if (savedBuilding == null) {
                        System.out.println("No building data yet!");
                    } else {
                        System.out.println("\n--- Building Data ---");
                        // Dynamic Binding: Java otomatis tahu panggil showBuildings milik siapa
                        savedBuilding.showBuildings();

                        // Cek Interface: Hanya Cinema yang akan masuk ke sini
                        if (savedBuilding instanceof Taxable) {
                            Taxable t = (Taxable) savedBuilding;
                            System.out.println("Tax to Pay       : Rp" + t.calculateTax());
                        } else {
                            System.out.println("Tax to Pay       : Rp0 (Public Service)");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting System... Bye!");
                    break;

                default:
                    System.out.println("Invalid menu option!");
            }
        } while (menu != 3);

        scan.close();
    }
}