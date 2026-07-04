package pawstay;

// INHERITANCE
// Kucing adalah turunan dari Hewan
public class Kucing extends Hewan {

    // CONSTRUCTOR
    public Kucing(String idHewan,
                  String namaHewan,
                  int umur,
                  int lamaInap,
                  Pemilik pemilik) {

        super(idHewan, namaHewan, umur, lamaInap, pemilik);
    }

    // POLYMORPHISM (OVERRIDE)
    @Override
    public double hitungBiaya() {
        return getLamaInap() * 50000;
    }
}