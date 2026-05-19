package ExerciseV3;

public class Archer extends Character {
    private int arrowCount;
    private String bowType;

    public Archer(String name, int age, boolean gender, int arrowCount, String bowType) {
        super(name, age, gender);
        this.arrowCount = arrowCount;
        this.bowType = bowType;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow using " + bowType + "!");
    }

    // Overloading
    public void attack(int numberOfArrows) {
        System.out.println(name + " fires " + numberOfArrows + " arrows at once!");
    }
}