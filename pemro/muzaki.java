package pemro;

/**
 *
 * @author KicenZeus
 */
import java.text.NumberFormat;
import java.util.Locale;

// Kelas Muzaki (Donatur)
public class Muzaki {
    private String nama;
    private String agama;
    private double jumlahHarta;
    private double zakat;

    // Konstruktor berparameter
    public Muzaki(String nama, String agama, double jumlahHarta) {
        this.nama = nama;
        this.agama = agama;
        this.jumlahHarta = jumlahHarta;
        this.zakat = hitungZakat(); // Hitung zakat saat objek dibuat
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk agama
    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    // Getter dan Setter untuk jumlahHarta
    public double getJumlahHarta() {
        return jumlahHarta;
    }

    public void setJumlahHarta(double jumlahHarta) {
        this.jumlahHarta = jumlahHarta;
        this.zakat = hitungZakat(); // Update zakat saat jumlah harta berubah
    }

    // Getter untuk zakat
    public double getZakat() {
        return zakat;
    }

    // Metode untuk menghitung zakat
    private double hitungZakat() {
        double nisab = 85000000; // Nisab untuk zakat (contoh)
        double persentaseZakat = 0.025;

        // Cek jika jumlah harta memenuhi nisab
        if (jumlahHarta >= nisab) {
            return jumlahHarta * persentaseZakat;
        } else {
            return 0; // Jika tidak memenuhi nisab, zakat = 0
        }
    }

    // Metode untuk menampilkan informasi Muzaki dengan format mata uang
    public void displayInfo() {
        // Mengatur format mata uang lokal Indonesia (Rp)
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        System.out.println("Nama Muzaki: " + nama);
        System.out.println("Agama: " + agama);
        System.out.println("Jumlah Harta: " + currencyFormat.format(jumlahHarta));
        System.out.println("Zakat yang Harus Dibayar: " + currencyFormat.format(zakat));
    }
}
