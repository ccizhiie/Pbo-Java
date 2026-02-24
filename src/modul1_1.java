import java.util.Scanner;
public class modul1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Labit RPG!");
        System.out.print("Insert your name: ");
        String name = scanner.nextLine();

        System.out.print("Insert your home region: ");
        String region = scanner.nextLine();

        System.out.print("Insert your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 13) {
            System.out.println("Sorry, you must be at least 13 years old to play this game.");
            scanner.close();
            return;
        } else {
            System.out.printf("Hello %s dari %s, age %d! Let's start your adventure!\n", name, region, age);
        }

        boolean continueCreation = true;
        do {
            System.out.println("\nLet's Make some Character!");
            System.out.println("Choose your class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");

            System.out.print("Enter the number of your choice: ");
            int classChoice = scanner.nextInt();
            scanner.nextLine();

            switch (classChoice) {
                case 1:
                    System.out.println("You have chosen the Warrior class! Strong and brave!");
                    continueCreation = false;
                    break;
                case 2:
                    System.out.println("You have chosen the Mage class! Wise and powerful!");
                    continueCreation = false;
                    break;
                case 3:
                    System.out.println("You have chosen the Archer class! Agile and precise!");
                    continueCreation = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid class.");
                    break;
            }
        } while (continueCreation);

        System.out.println("Character creation complete! Get ready for your adventure!");
        scanner.close();
    }
}