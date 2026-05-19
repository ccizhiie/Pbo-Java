package ExerciseV3;

public class Warrior extends Character {
    String weapon;
    String skin;

    public Warrior(String name, int age, boolean gender, String weapon, String skin) {
        super(name, age, gender);
        this.weapon = weapon;
        this.skin = skin;
        System.out.println("Warior Created!");
    }

    @Override
    public void displayCharInfo() {
        super.displayCharInfo(); // Memanggil info dari parent
        System.out.println("Class: Warior");
        System.out.println("Weapon: " + weapon);
        System.out.println("Skin: " + skin);
    }

    @Override
    public void attack() {
        // Overriding
        System.out.println(name + " attacks with a weapon!");
    }

    // Overloading: Nama sama, parameter beda
    public void attack(String specialMove) {
        System.out.println(name + " performs a special move: " + specialMove + " with a " + weapon + "!");
    }
}