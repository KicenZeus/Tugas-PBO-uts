package pemro;

/**
 *
 * @author KicenZeus
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Daftar penerima yang tersedia
        List<Penerima> daftarPenerima = new ArrayList<>();
        daftarPenerima.add(new Penerima("Zainab", "Fakir"));
        daftarPenerima.add(new Penerima("Ali", "Miskin"));
        daftarPenerima.add(new Penerima("Fatimah", "Yatim"));
        daftarPenerima.add(new Penerima("Hassan", "Amil Zakat"));

        while (true) {
            // Input data Muzaki
            System.out.print("Masukkan nama Muzaki: ");
            String nama = input.nextLine();

            System.out.print("Masukkan agama : ");
            String agama = input.nextLine();

            // Cek jika agama bukan Islam
            if (!agama.equalsIgnoreCase("Islam")) {
                System.out.println("Maaf, zakat hanya berlaku untuk umat Islam. Silakan coba lagi.\n");
                continue; // Ulang input jika bukan Islam
            }

            System.out.print("Masukkan jumlah harta yang dimiliki: Rp ");
            double jumlahHarta = input.nextDouble();
            input.nextLine(); // Membersihkan newline setelah input double

            // Membuat objek Muzaki dengan data yang telah dimasukkan
            Muzaki muzaki = new Muzaki(nama, agama, jumlahHarta);

            // Menampilkan informasi Muzaki
            System.out.println("\n=== Informasi Pembayaran Zakat ===");
            muzaki.displayInfo();

            // Tampilkan penerima zakat hanya jika zakat lebih dari 0
            if (muzaki.getZakat() > 0) {
                // Pilih penerima secara acak
                Penerima penerimaAcak = daftarPenerima.get(random.nextInt(daftarPenerima.size()));
                System.out.println("\n=== Penerima Zakat ===");
                penerimaAcak.displayInfo();
            } else {
                System.out.println("\nHarta kekayaan Anda tidak mencukupi nisab, tidak ada zakat yang harus dibayarkan.");
            }

            // Menanyakan apakah ingin memasukkan data Muzaki lagi
            System.out.print("\nApakah Anda ingin memasukkan data Muzaki lagi? (ya/tidak): ");
            String jawab = input.nextLine();
            if (!jawab.equalsIgnoreCase("ya")) {
                break; // Keluar dari loop jika tidak ingin mengulang
            }
        }

        // Menutup scanner
        input.close();
    }
}
