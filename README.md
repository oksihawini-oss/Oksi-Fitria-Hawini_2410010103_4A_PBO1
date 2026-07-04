# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Sistem Penitipan Hewan(Pet Hotel) menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi Sistem Penitipan Hewan(Pet Hotel) merupakan sistem sederhana yang digunakan untuk mengelola data penitipan hewan peliharaan. Aplikasi ini menerima input berupa data hewan yang dititipkan, seperti ID hewan, nama hewan, umur, lama inap, data pemilik, serta jenis hewan.

Program dikembangkan menggunakan konsep Pemrograman Berorientasi Objek (PBO) dengan menerapkan class, object, atribut, constructor, accessor, mutator, encapsulation, inheritance, polymorphism, array, seleksi, perulangan, IO sederhana, dan error handling sehingga data dapat dikelola secara lebih terstruktur dan efisien.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pemilik`, `Hewan`, dan `Kucing`, `Anjing`, `Kelinci`, `Main` adalah contoh dari class.

```bash
public class Pemilik {
    ...
}

public class Hewan {
    ...
}

public class Kucing extends Hewan {
    ...
}

public class Anjing extends Hewan {
    ...
}

public class Kelinci extends Hewan {
    ...
}

public class Main extends Hewan {
    ...
}

```

2. **Object** adalah instance dari class. Pada program ini, object dibuat menggunakan keyword new. Contohnya adalah pembuatan object Pemilik dan object Kucing.

```bash
Pemilik pemilik = new Pemilik(namaPemilik, noHp);

hewan = new Kucing( id, namaHewan, umur, lamaInap, pemilik);

hewan = new Anjing(id, namaHewan, umur, lamaInap, pemilik);

hewan = new Kelinci(id, namaHewan, umur,lamaInap, pemilik);

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPemilik` ,`noHp`, `idHewan`, `namaHewan`, `umur`, `lamaInap`, `Pemilik` adalah contoh atribut.

```bash
    String namaPemilik;
    String noHp;

    String idHewan;
    String namaHewan;
    int umur;
    int lamaInap;
    Pemilik pemilik;

```

4. **Constructor** adalah method yang pertama kali dijalankan saat object dibuat. Pada program ini, constructor terdapat pada class Pemilik, Hewan, Kucing, Anjing, dan Kelinci.

```bash
    public Pemilik(String namaPemilik, String noHp) {
        this.namaPemilik = namaPemilik;
        this.noHp = noHp;
}

    public Hewan(String idHewan,
                 String namaHewan,
                 int umur,
                 int lamaInap,
                 Pemilik pemilik) {
}

    public Kucing(String idHewan,
                  String namaHewan,
                  int umur,
                  int lamaInap,
                  Pemilik pemilik) {
}

    public Anjing(String idHewan,
                  String namaHewan,
                  int umur,
                  int lamaInap,
                  Pemilik pemilik) {
}
    public Kelinci(String idHewan,
                   String namaHewan,
                   int umur,
                   int lamaInap,
                   Pemilik pemilik) {
}
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
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada program ini, `setNamaHewan` dan `setUmur` merupakan contoh method mutator.

```bash
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

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

    public void setNoHp(String noHp) {
        this.noHp = noHp;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada program ini, `getIdHewan`, `getNamaHewan`, `getUmur`, `getLamaInap`, `getPemilik`, `getNamaPemilik`, dan `getNoHp` merupakan contoh method accessor.

```bash
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoHp() {
        return noHp;
}

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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya dapat diakses melalui method getter dan setter. Pada program ini, atribut `idHewan`,`namaHewan`, `umur`, `lamaInap`, `namaPemilik`, dan `noHp` dienkapsulasi sehingga data lebih aman dan terkontrol.

```bash
    private String namaPemilik;
    private String noHp;

    private String idHewan;
    private String namaHewan;
    private int umur;
    private int lamaInap;
    private Pemilik pemilik;
```

8. **Inheritance** adalah konsep di mana sebuah class dapat mewarisi atribut dan method dari class lain. Pada program ini, class `Kucing`, `Anjing`, dan `Kelinci` mewarisi class `Hewan` menggunakan sintaks extends. Dengan inheritance, class turunan dapat menggunakan atribut dan method yang sudah dimiliki oleh class `Hewan` tanpa perlu menuliskan ulang kode.

```bash
public class Kucing extends Hewan {
    ...
}

public class Anjing extends Hewan {

}

public class Kelinci extends Hewan {

}
```

9. **Polymorphism** adalah konsep di mana satu method dapat memiliki perilaku yang berbeda tergantung pada objek yang menggunakannya. Pada program ini, polymorphism diterapkan melalui method `hitungBiaya` yang dioverride pada class `Kucing`, `Anjing`, dan `Kelinci`. Meskipun nama method sama, hasil perhitungan biaya penitipan berbeda sesuai jenis hewan.

```bash
    public double hitungBiaya() {
        return 0;
    }
}

    @Override
    public double hitungBiaya() {
        return getLamaInap() * 50000;
    ...
}

    @Override
    public double hitungBiaya() {
        return getLamaInap() * 40000;
}

    @Override
    public double hitungBiaya() {
        return getLamaInap() * 75000;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch-case` dalam method `main()`.

```bash
switch (pilihan) {

    case 1:
        // Tambah Hewan
        break;

    case 2:
        // Lihat Semua Data
        break;

    case 3:
        // Cari Hewan
        break;

    case 4:
        // Keluar
        break;

    default:
        System.out.println("Menu tidak tersedia!");
}

if (jenis == 1) {

    hewan = new Kucing(
            id,
            namaHewan,
            umur,
            lamaInap,
            pemilik);

} else if (jenis == 2) {

    hewan = new Anjing(
            id,
            namaHewan,
            umur,
            lamaInap,
            pemilik);

} else if (jenis == 3) {

    hewan = new Kelinci(
            id,
            namaHewan,
            umur,
            lamaInap,
            pemilik);

} else {

    System.out.println("Jenis hewan tidak tersedia!");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do-while` untuk meminta input dan menampilkan data.

```bash
do {
    ...
} while (pilihan != 4);
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari pengguna dan menampilkan output ke layar. Pada program ini, digunakan class Scanner untuk menerima input data hewan dan pemilik, sedangkan `System.out.println` digunakan untuk menampilkan menu, data hewan, biaya penitipan, dan informasi lainnya.

```bash
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Nama Hewan : ");
String namaHewan = input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa data dalam satu variabel. Pada program ini, array digunakan untuk menyimpan data hewan yang dititipkan. Contoh penggunaan array adalah Hewan[] daftarHewan = new Hewan[100]; yang dapat menyimpan hingga 100 data hewan.

```bash
Hewan[] daftarHewan = new Hewan[100];

daftarHewan[jumlahHewan] = hewan;
```

14. **Error Handling** digunakan untuk menangani kesalahan yang mungkin terjadi saat program dijalankan. Pada program ini, digunakan try-catch untuk menangani kesalahan input, misalnya ketika pengguna memasukkan huruf pada input yang seharusnya berupa angka.
```bash
try{
  ...
} catch (Exception e) {
 System.out.println(
        "Input harus berupa angka yang sesuai!");
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Oksi Fitria Hawini
NPM: 2410010103
