package ExerciseV3;

public class Mage extends Character {
    private String element;
    private int mana;

    public Mage(String name, int age, boolean gender, String element, int mana) {
        super(name, age, gender);
        this.element = element;
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a " + element + " bolt!");
    }

    //
    public void castUltimateSpell() {
        System.out.println(name + " unleashes ULTIMATE SPELL using " + mana + " mana!");
    }
}