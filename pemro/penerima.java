package pemro;

/**
 *
 * @author KicenZeus
 */
public class Penerima {
    private String nama;
    private String kategori;

    // Konstruktor berparameter
    public Penerima(String nama, String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Metode untuk menampilkan informasi Penerima
    public void displayInfo() {
        System.out.println("Nama Penerima: " + nama);
        System.out.println("Kategori Penerima: " + kategori);
    }
}
