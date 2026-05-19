package ExerciseV3;

public class MainExc {
    public static void main(String[] args) {
        // Contoh Archer
        Archer archer = new Archer("Cintaa", 17, true, 50, "Longbow");
        System.out.println("\n===== CHARACTER CREATED =====");
        archer.displayCharInfo();
        archer.attack();
        archer.attack(3); // Overloading

        // Contoh Warrior
        Warrior warrior = new Warrior("Ragaa", 20, false, "Sword", "Legendary");
        System.out.println("\n===== CHARACTER CREATED =====");
        warrior.displayCharInfo();
        warrior.attack();
        warrior.attack("Ground Smash"); // Overloading

        // Contoh Mage
        Mage mage = new Mage("Lia", 25, false, "Fire", 100);
        System.out.println("\n===== CHARACTER CREATED =====");
        mage.displayCharInfo();
        mage.attack();
        mage.castUltimateSpell();
    }
}