import java.util.Scanner; 

public class City {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Welcome to Smart City Management System ===");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            
            int choice = input.nextInt();
            input.nextLine(); // Membersihkan sisa Enter (buffer)

            switch (choice) {
                case 1:
                    System.out.print("Enter Building Name: ");
                    String name = input.nextLine();
                    
                    System.out.print("Enter Building Address: ");
                    String address = input.nextLine();
                    
                    System.out.print("Enter Number of Floors: ");
                    int floors = input.nextInt();
                    input.nextLine(); // Membersihkan buffer lagi

                    System.out.println("\nBuilding Name: " + name);
                    System.out.println("Building Address: " + address);
                    System.out.println("Number of Floors: " + floors);
                    System.out.println("Building added successfully!\n");
                    break;

                case 2:
                    System.out.println("Coming Soon\n");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    running = false; 
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        }
        input.close(); // Mencegah memory leak
    }
}
