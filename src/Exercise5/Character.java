package Exercise5;

public abstract class Character {
    protected String name;
    protected int age;
    protected Gender gender;

    public Character(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name + " | Age: " + age + " | Gender: " + gender);
    }

    public abstract void displayClassInfo();
}