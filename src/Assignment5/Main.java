package Assignment5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Building> buildingList = new ArrayList<>();
        int menu;

        try {
            buildingList.add(new Cinema("XXI Malang", "Jl. Ijen", 3, BuildingStatus.ACTIVE, 50000000));
            buildingList.add(new Hospital("RS UMM", "Jl. Raya Tlogomas", 5, BuildingStatus.ACTIVE, 150));
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

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
                    try {
                        System.out.println("\nSelect Building Type:");
                        System.out.println("1. Cinema (Commercial)");
                        System.out.println("2. Hospital (Public Service)");
                        System.out.print("Choice: ");
                        int type = scan.nextInt();
                        scan.nextLine();

                        System.out.print("Name: ");
                        String name = scan.nextLine();

                        if (CheckDuplicate(buildingList, name)) {
                            throw new InvalidDataException("Duplicate building name found.");
                        }

                        System.out.print("Address: ");
                        String address = scan.nextLine();
                        System.out.print("Floors: ");
                        int floors = scan.nextInt();

                        if (type == 1) {
                            System.out.print("Revenue: ");
                            double revenue = scan.nextDouble();
                            Cinema c = new Cinema(name, address, floors, BuildingStatus.ACTIVE, revenue);
                            buildingList.add(c);
                        } else if (type == 2) {
                            System.out.print("Beds: ");
                            int beds = scan.nextInt();
                            Hospital h = new Hospital(name, address, floors, BuildingStatus.ACTIVE, beds);
                            buildingList.add(h);
                        }
                        System.out.println(">> Success: Building added.");

                    } catch (InputMismatchException e) {
                        System.out.println("[ERROR] Format input salah (masukkan angka untuk lantai/bed/revenue).");
                        scan.nextLine();
                    } catch (InvalidDataException e) {
                        System.out.println("[VALIDATION FAILED] " + e.getMessage());
                    }
                    break;

                case 2:
                    if (buildingList.isEmpty()) {
                        System.out.println("No building data available.");
                    } else {
                        System.out.println("\n--- Building Data View ---");
                        for (Building b : buildingList) {
                            b.showBuildings();
                            if (b instanceof Taxable) {
                                Taxable t = (Taxable) b;
                                System.out.println("Tax to Pay    : Rp" + t.calculateTax());
                            } else {
                                System.out.println("Tax to Pay    : Rp0 (Public Service)");
                            }
                            System.out.println("-----------------------------------");
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

    private static boolean CheckDuplicate(ArrayList<Building> list, String nameBuilding) {
        for (Building b : list) {
            if (b.getName().equalsIgnoreCase(nameBuilding)) {
                return true;
            }
        }
        return false;
    }
}