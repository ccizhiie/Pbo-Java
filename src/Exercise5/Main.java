package Exercise5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declare an ArrayList variable so it can contain characters (Halaman 35)
        List<Character> party = new ArrayList<>();
        boolean addMore = true;

        while (addMore) {
            try {
                // INPUT DATA DASAR (Halaman 36)
                System.out.print("Insert Name: ");
                String name = scanner.nextLine();

                System.out.print("Insert Age: ");
                // Jika user mengetik huruf, baris int akan melempar InputMismatchException (Halaman 36)
                int age = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline

                // EXCEPTION HANDLING (Custom Exception) (Halaman 36)
                if (age < 13) {
                    throw new InvalidGameRuleException("Player is too young to play! Minimum age is 13.");
                }

                // PENGGUNAAN ENUM (Halaman 36)
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

                // PEMILIHAN KELAS (Halaman 37)
                System.out.println("\nSelect Character Class:");
                System.out.println("1. Warrior");
                System.out.println("2. Mage");
                System.out.print("Choice (1-2): ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline

                Character newHero = null;
                switch (choice) {
                    case 1:
                        newHero = new Warrior(name, age, gender, "Sword", "Knight");
                        break;
                    case 2:
                        newHero = new Mage(name, age, gender, "Fire", 100);
                        break;
                    default:
                        // Melempar exception jika pilihan salah (Halaman 37)
                        throw new InvalidGameRuleException("Invalid class selection (Must be 1-2).");
                }

                // Menambahkan hero ke dalam LIST (Collection) (Halaman 35 & 37)
                party.add(newHero);
                System.out.println("Hero " + name + " added to the party!");

            } catch (InputMismatchException e) {
                // Menangkap error jika user memasukkan huruf saat diminta angka (Halaman 37)
                System.out.println("ERROR: Input must be a number! Please try again.");
                scanner.nextLine(); // Membersihkan buffer scanner agar tidak looping
            } catch (InvalidGameRuleException e) {
                // Menangkap error custom (aturan game) (Halaman 37)
                System.out.println("GAME RULE ERROR: " + e.getMessage());
            } catch (Exception e) {
                // Menangkap error umum lainnya (Halaman 37)
                System.out.println("UNKNOWN ERROR: " + e.getMessage());
            }

            // Opsi menambah hero lagi (Halaman 37)
            System.out.print("\nAdd another hero? (y/n): ");
            String ans = scanner.nextLine();
            if (!ans.equalsIgnoreCase("y")) {
                addMore = false;
            }
        }

        // Tampilkan Hasil Akhir Menggunakan Enhanced For-Loop (Halaman 26)
        System.out.println("\n=== FINAL PARTY MEMBERS ===");
        for (Character hero : party) {
            hero.displayBasicInfo();
            hero.displayClassInfo();
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}