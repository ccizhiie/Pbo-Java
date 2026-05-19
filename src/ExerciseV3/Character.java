package ExerciseV3;

public class Character {
    protected String name;
    protected int age;
    protected boolean gender;

    // Constructor untuk inisialisasi semua atribut
    public Character(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayCharInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender ? "Female" : "Male"));
    }

    // Method dasar yang akan di-override
    public void attack() {
        System.out.println(name + " performs a basic attack!");
    }
}