package Exercise5;

public class Archer extends Character {
    private int arrowCount;
    private String bowType;

    public Archer(String name, int age, Gender gender, int arrowCount, String bowType) {
        super(name, age, gender);
        this.arrowCount = arrowCount;
        this.bowType = bowType;
    }

    @Override
    public void displayClassInfo() {
        System.out.println("Class: Archer | Arrow Count: " + arrowCount + " | Bow Type: " + bowType);
    }
}