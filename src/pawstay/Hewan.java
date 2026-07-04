package pawstay;

//CLASS HEWAN
public class Hewan {
    
    // ATRIBUT + ENCAPSULATION
    private String idHewan;
    private String namaHewan;
    private int umur;
    private int lamaInap;
    private Pemilik pemilik;

    // CONSTRUCTOR
    public Hewan(String idHewan,
                 String namaHewan,
                 int umur,
                 int lamaInap,
                 Pemilik pemilik) {

        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
        this.umur = umur;
        this.lamaInap = lamaInap;
        this.pemilik = pemilik;
    }

    // ACCESSOR (GETTER)
    public String getIdHewan() {
        return idHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public int getUmur() {
        return umur;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }
    
    // MUTATOR (SETTER)
    public void setIdHewan(String idHewan) {
        this.idHewan = idHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public void setPemilik(Pemilik pemilik) {
        this.pemilik = pemilik;
    }

    // POLYMORPHISM
    // Akan dioverride oleh class
    // Kucing, Anjing, dan Kelinci
    public double hitungBiaya() {
        return 0;
    }

    // METHOD TAMPIL DATA
    public void tampilData() {
        System.out.println("ID Hewan     : " + idHewan);
        System.out.println("Nama Hewan   : " + namaHewan);
        System.out.println("Umur         : " + umur + " Tahun");
        System.out.println("Lama Inap    : " + lamaInap + " Hari");
        System.out.println("Nama Pemilik : " + pemilik.getNamaPemilik());
        System.out.println("No HP        : " + pemilik.getNoHp());
    }
}
    

