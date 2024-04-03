package pertemuan8.percobaan1;

import java.util.Scanner;

public class Utama15 {
    static Scanner scanner = new Scanner(System.in);
    static Gudang15 gudang = new Gudang15(7);
    public static void main(String[] args) {
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat Tumpukan Barang");
            System.out.println("4. Keluar");
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
                    Barang15 barang = gudang.ambilBarang();
                    if (barang != null) {
                        System.out.println("Barang yang diambil : " + barang.nama);
                    }
                }
                case 3 -> {
                    gudang.tampilkanBarang();
                }
                case 4 ->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("Pilihan tidak valid");
                }
            }
        } while (true);
    }
}
