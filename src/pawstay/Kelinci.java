package pawstay;

// INHERITANCE
// Kelinci adalah turunan dari Hewan
public class Kelinci extends Hewan {

    // CONSTRUCTOR
    public Kelinci(String idHewan,
                   String namaHewan,
                   int umur,
                   int lamaInap,
                   Pemilik pemilik) {

        super(idHewan, namaHewan, umur, lamaInap, pemilik);
    }

    // POLYMORPHISM (OVERRIDE)
    @Override
    public double hitungBiaya() {
        return getLamaInap() * 40000;
    }
}
