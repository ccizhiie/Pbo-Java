package Exercise4;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int age, Gender gender, int mana) {
        super(name, age, gender);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a magic bolt!");
    }

    @Override
    public void displayClassInfo() {
        System.out.println("Class  : Mage");
        System.out.println("Mana   : " + mana);
    }

    @Override
    public void useUltimate() {
        System.out.println(name + " unleashes METEOR STORM using " + mana + " mana!");
    }}
