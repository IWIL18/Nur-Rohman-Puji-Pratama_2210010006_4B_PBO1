public class Murid {
    // Enkapsulasi
    private String nama;
    private int usia;

    // Konstruktor
    public Murid(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Aksesor
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
