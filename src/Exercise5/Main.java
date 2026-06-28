package Exercise5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> party = new ArrayList<>();
        boolean addMore = true;

        while (addMore) {
            try {
                System.out.print("Insert Name: ");
                String name = scanner.nextLine();

                System.out.print("Insert Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                if (age < 13) {
                    throw new InvalidGameRuleException("Player is too young to play! Minimum age is 13.");
                }

                Gender gender = null;
                while (gender == null) {
                    System.out.print("Gender (M/F): ");
                    String gInput = scanner.nextLine();
                    if (gInput.equalsIgnoreCase("M")) {
                        gender = Gender.MALE;
                    } else if (gInput.equalsIgnoreCase("F")) {
                        gender = Gender.FEMALE;
                    } else {
                        System.out.println("Invalid input. Please type M or F.");
                    }
                }

                System.out.println("\nSelect Character Class:");
                System.out.println("1. Warrior");
                System.out.println("2. Mage");
                System.out.println("3. Archer");
                System.out.print("Choice (1-3): ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                Character newHero = null;
                switch (choice) {
                    case 1:
                        newHero = new Warrior(name, age, gender, "Sword", "Knight");
                        break;
                    case 2:
                        newHero = new Mage(name, age, gender, "Fire", 100);
                        break;
                    case 3:
                        newHero = new Archer(name, age, gender, 10, "Longbow");
                        break;
                    default:
                        throw new InvalidGameRuleException("Invalid class selection (Must be 1-3).");
                }

                party.add(newHero);
                System.out.println("Hero " + name + " added to the party!");

            } catch (InputMismatchException e) {
                System.out.println("ERROR: Input must be a number! Please try again.");
                scanner.nextLine();
            } catch (InvalidGameRuleException e) {
                System.out.println("GAME RULE ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("UNKNOWN ERROR: " + e.getMessage());
            }

            System.out.print("\nAdd another hero? (y/n): ");
            String ans = scanner.nextLine();
            if (!ans.equalsIgnoreCase("y")) {
                addMore = false;
            }
        }

        System.out.println("\n=== FINAL PARTY MEMBERS ===");
        for (Character hero : party) {
            hero.displayBasicInfo();
            hero.displayClassInfo();
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}