package pawstay;

// INHERITANCE
// Anjing adalah turunan dari Hewan
public class Anjing extends Hewan {

    // CONSTRUCTOR
    public Anjing(String idHewan,
                  String namaHewan,
                  int umur,
                  int lamaInap,
                  Pemilik pemilik) {

        super(idHewan, namaHewan, umur, lamaInap, pemilik);
    }

    // POLYMORPHISM (OVERRIDE)
    @Override
    public double hitungBiaya() {
        return getLamaInap() * 75000;
    }
}