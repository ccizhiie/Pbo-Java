package Exercise4;

// Abstract class: tidak bisa dibuat objek langsung
public abstract class Character implements SpecialAbility {
    protected String name;
    protected int age;
    protected Gender gender; //

    // FINAL VARIABLE: Konstanta yang nilainya tidak bisa diubah
    public static final String GAME_NAME = "Labit RPG v2.0";

    public Character(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // FINAL METHOD: Anak kelas dilarang keras mengubah cara nampilin info ini
    public final void displayBasicInfo() {
        System.out.println("==" + GAME_NAME + "==");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }
    public String getName() {
        return name;
    }
    // ABSTRACT METHOD: Tiap anak wajib punya cara serang sendiri
    public abstract void attack();

    // Abstract method untuk info spesifik tiap kelas
    public abstract void displayClassInfo();
}