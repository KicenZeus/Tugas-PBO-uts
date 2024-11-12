package pemro;

/**
 *
 * @author KicenZeus
 */
public class Penerima {
    private String nama;
    private String kategori;

    public Penerima(String nama, String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

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

    public void displayInfo() {
        System.out.println("Nama Penerima: " + nama);
        System.out.println("Kategori Penerima: " + kategori);
    }
}
