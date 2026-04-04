import java.util.Scanner;
import java.time.LocalDate;
public class biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine(); // Ambil input nama

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt(); // Ambil input tahun

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\n--- Data Kamu ---");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");

        input.close();
    }
}
