package Exercise5;

public class Warrior extends Character {
    private String weapon;
    private String type;

    public Warrior(String name, int age, Gender gender, String weapon, String type) {
        super(name, age, gender);
        this.weapon = weapon;
        this.type = type;
    }

    @Override
    public void displayClassInfo() {
        System.out.println("Class: Warrior | Weapon: " + weapon + " | Type: " + type);
    }
}