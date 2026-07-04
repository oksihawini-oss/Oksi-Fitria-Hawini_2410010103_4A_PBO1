package pawstay;

// CLASS PEMILIK
public class Pemilik {
    
    // ATRIBUT + ENCAPSULATION
    private String namaPemilik;
    private String noHp;

    // CONSTRUCTOR
    public Pemilik(String namaPemilik, String noHp) {
        this.namaPemilik = namaPemilik;
        this.noHp = noHp;
    }

    // ACCESSOR (GETTER)
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoHp() {
        return noHp;
    }

    // MUTATOR (SETTER)
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
    

