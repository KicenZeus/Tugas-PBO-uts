package pemro;

/**
 *
 * @author KicenZeus
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Muzaki {
    private String nama;
    private String agama;
    private double jumlahHarta;
    private double zakat;

    public Muzaki(String nama, String agama, double jumlahHarta) {
        this.nama = nama;
        this.agama = agama;
        this.jumlahHarta = jumlahHarta;
        this.zakat = hitungZakat(); // Hitung zakat saat objek dibuat
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public double getJumlahHarta() {
        return jumlahHarta;
    }

    public void setJumlahHarta(double jumlahHarta) {
        this.jumlahHarta = jumlahHarta;
        this.zakat = hitungZakat(); // Update zakat saat jumlah harta berubah
    }

    public double getZakat() {
        return zakat;
    }

    private double hitungZakat() {
        double nisab = 85000000; // Nisab untuk zakat (contoh)
        double persentaseZakat = 0.025;

        if (jumlahHarta >= nisab) {
            return jumlahHarta * persentaseZakat;
        } else {
            return 0; // Jika tidak memenuhi nisab, zakat = 0
        }
    }

    public void displayInfo() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        System.out.println("Nama Muzaki: " + nama);
        System.out.println("Agama: " + agama);
        System.out.println("Jumlah Harta: " + currencyFormat.format(jumlahHarta));
        System.out.println("Zakat yang Harus Dibayar: " + currencyFormat.format(zakat));
    }
}
