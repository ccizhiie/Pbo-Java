package exercise;

public class Character {
    private String name;
    private int age;
    private String heroClass;
    private boolean gender; // true = Female

    public void createChar(String name, int age, String heroClass, boolean gender) {
        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.gender = gender;
        displayCharInfo();
    }

    public void displayCharInfo() {
        System.out.println("\n=== Character Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender ? "Female" : "Male"));
        System.out.println("Class: " + heroClass);
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getHeroClass() { return heroClass; }
    public void setHeroClass(String heroClass) { this.heroClass = heroClass; }
    public boolean isGender() { return gender; }
    public void setGender(boolean gender) { this.gender = gender; }
}