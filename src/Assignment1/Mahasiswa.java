package Assignment1;

public class Mahasiswa {
    // Atribut (Identitas)
    String nama;
    int NIM;
    int umur;
    String kotaAsal;

    // Atribut Static (Shared data)
    final static String kampus = "Universitas Muhammadiyah Malang";

    // Method untuk menampilkan data
    void dataDiri() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Umur\t: " + umur + " tahun");
        System.out.println("Kota Asal: " + kotaAsal);
        System.out.println("Kampus\t: " + kampus);
    }
}
