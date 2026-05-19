package Exercise5;

public class Mage extends Character {
    private String element;
    private int mp;

    public Mage(String name, int age, Gender gender, String element, int mp) {
        super(name, age, gender);
        this.element = element;
        this.mp = mp;
    }

    @Override
    public void displayClassInfo() {
        System.out.println("Class: Mage | Element: " + element + " | MP: " + mp);
    }
}