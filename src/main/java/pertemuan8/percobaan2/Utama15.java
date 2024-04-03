package pertemuan8.percobaan2;

import java.util.Scanner;

public class Utama15 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selamat datang di Program Gudang Barang");
        System.out.print("Masukan kapasitas Gudang : ");
        int kapasitas = Integer.parseInt(scanner.nextLine());
        Gudang15 gudang = new Gudang15(kapasitas);
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat Tumpukan Barang");
            System.out.println("4  Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Operasi : ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukan Kode Barang : ");
                    int kode = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukan Nama Barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan Kategori Barang : ");
                    String kategori = scanner.nextLine();
                    Barang15 barang = new Barang15(kode, nama, kategori);
                    gudang.tambahBarang(barang);
                }
                case 2 -> {
                    gudang.ambilBarang();
                }
                case 3 -> {
                    gudang.tampilkanBarang();
                }
                case 4 -> {
                    Barang15 barang = gudang.lihatBarangTeratas();
                    if (barang != null) {
                        System.out.println("Barang teratas adalah " + barang.nama);
                    }
                }
                case 5 ->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("Pilihan tidak valid, silakan coba lagi");
                }
            }
            System.out.println();
        } while (true);
    }
}
