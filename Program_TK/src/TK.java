public class TK extends Murid {
    private String idMurid;

    // Konstruktor
    public TK(String nama, int usia, String idMurid) {
        super(nama, usia); // Memanggil konstruktor superclass
        this.idMurid = idMurid;
    }

    // Aksesor
    public String getIdMurid() {
        return idMurid;
    }

    // Mutator
    public void setIdMurid(String idMurid) {
        this.idMurid = idMurid;
    }

    // Polimorfisme (overriding method)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Murid: " + idMurid);
    }
}
