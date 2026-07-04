package pawstay;

import java.util.Scanner;

// CLASS MAIN
public class Main {

    public static void main(String[] args) {

        // IO SEDERHANA
        Scanner input = new Scanner(System.in);

        // ARRAY
        Hewan[] daftarHewan = new Hewan[100];

        int jumlahHewan = 0;
        int pilihan = 0;

        // PERULANGAN
        do {

            // MENU
            System.out.println("\n================================");
            System.out.println("      PAWSTAY PET HOTEL");
            System.out.println("================================");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Semua Hewan");
            System.out.println("3. Cari Hewan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = Integer.parseInt(input.nextLine());
                
                // SELEKSI (SWITCH CASE)
                switch (pilihan) {

                    // TAMBAH HEWAN
                    case 1:

                        System.out.print("ID Hewan : ");
                        String id = input.nextLine();

                        System.out.print("Nama Hewan : ");
                        String namaHewan = input.nextLine();

                        System.out.print("Umur Hewan : ");
                        int umur = Integer.parseInt(input.nextLine());

                        System.out.print("Lama Inap (hari) : ");
                        int lamaInap = Integer.parseInt(input.nextLine());

                        System.out.print("Nama Pemilik : ");
                        String namaPemilik = input.nextLine();

                        System.out.print("No HP : ");
                        String noHp = input.nextLine();
                        
                        // OBJECT PEMILIK
                        Pemilik pemilik =
                                new Pemilik(namaPemilik, noHp);

                        System.out.println("\nJenis Hewan");
                        System.out.println("1. Kucing");
                        System.out.println("2. Anjing");
                        System.out.println("3. Kelinci");
                        System.out.print("Pilih : ");

                        int jenis =
                                Integer.parseInt(input.nextLine());

                        Hewan hewan = null;

                        if (jenis == 1) {
                            
                            // OBJECT HEWAN
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
                            break;
                        }
                        
                        // OBJECT + ARRAY
                        daftarHewan[jumlahHewan] = hewan;
                        jumlahHewan++;

                        System.out.println("Data berhasil ditambahkan!");
                        break;

                    // LIHAT SEMUA DATA
                    case 2:

                        if (jumlahHewan == 0) {

                            System.out.println("Belum ada data!");

                        } else {

                            for (int i = 0; i < jumlahHewan; i++) {

                                System.out.println("\n---------------------");

                                daftarHewan[i].tampilData();

                                System.out.println(
                                        "Biaya Inap : Rp "
                                        + daftarHewan[i].hitungBiaya());

                                System.out.println("---------------------");
                            }
                        }

                        break;

                    // CARI HEWAN
                    case 3:

                        System.out.print("Masukkan Nama Hewan : ");
                        String cari = input.nextLine();

                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahHewan; i++) {

                            if (daftarHewan[i]
                                    .getNamaHewan()
                                    .equalsIgnoreCase(cari)) {

                                daftarHewan[i].tampilData();

                                System.out.println(
                                        "Biaya Inap : Rp "
                                        + daftarHewan[i].hitungBiaya());

                                ditemukan = true;
                            }
                        }

                        if (!ditemukan) {

                            System.out.println(
                                    "Data tidak ditemukan!");
                        }

                        break;

                    // KELUAR
                    case 4:

                        System.out.println(
                                "Terima kasih telah menggunakan PawStay!");
                        break;

                    default:

                        System.out.println(
                                "Menu tidak tersedia!");
                }

            } catch (Exception e) {

                // ERROR HANDLING
                System.out.println(
                        "Input harus berupa angka yang sesuai!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
