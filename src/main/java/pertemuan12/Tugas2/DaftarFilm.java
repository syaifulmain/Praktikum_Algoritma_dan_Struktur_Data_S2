package pertemuan12.Tugas2;

import pertemuan12.doublelinkedlist.DoubleLinkedLists;

import java.util.Comparator;
import java.util.Scanner;

public class DaftarFilm {
    static DoubleLinkedLists<Film> daftarFilm = new DoubleLinkedLists<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int pilihan;
        do {
            menu();
            System.out.println("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1 -> tambahDataAwal();
                case 2 -> tambahDataAkhir();
                case 3 -> tambahDataIndeksTertentu();
                case 4 -> daftarFilm.removeFirst();
                case 5 -> daftarFilm.removeLast();
                case 6 -> {
                    System.out.println("Hapus Data Indeks Tertentu");
                    System.out.println("Urutan Indeks: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    daftarFilm.remove(index);
                }
                case 7 -> cetak();
                case 8 -> cariIDFilm();
                case 9 -> urutkanDataRatingFilmDESC();
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 10);
        System.out.println("Terima kasih");
    }

    static void menu() {
        System.out.println("==================================");
        System.out.println("DAFTAR FILM LAYAR LEBAR");
        System.out.println("==================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Data Awal");
        System.out.println("5. Hapus Data Akhir");
        System.out.println("6. Hapus Data Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urutkan Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("==================================");
    }

    static void tambahDataAwal() {
        System.out.println("Masukkan Data Film Awal");
        System.out.println("Masukkan ID Film: ");
        String id = scanner.nextLine();
        System.out.println("Masukkan Judul Film: ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan Rating Film: ");
        String rating = scanner.nextLine();
        daftarFilm.addFirst(new Film(id, judul, rating));
    }

    static void tambahDataAkhir() {
        System.out.println("Masukkan Data Film Akhir");
        System.out.println("Masukkan ID Film: ");
        String id = scanner.nextLine();
        System.out.println("Masukkan Judul Film: ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan Rating Film: ");
        String rating = scanner.nextLine();
        daftarFilm.addLast(new Film(id, judul, rating));
    }

    static void tambahDataIndeksTertentu() throws Exception {
        System.out.println("Masukkan Data Film Indeks Tertentu");
        System.out.println("Urutan Indeks: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Masukkan ID Film: ");
        String id = scanner.nextLine();
        System.out.println("Masukkan Judul Film: ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan Rating Film: ");
        String rating = scanner.nextLine();
        daftarFilm.add(new Film(id, judul, rating), index);
    }

    static void cetak() {
        System.out.println("Cetak Data Film");
        daftarFilm.forEach(film -> {
            System.out.println("ID: " + film.id);
            System.out.println("Judul: " + film.judul);
            System.out.println("Rating: " + film.rating);
        });
    }

    static void cariIDFilm() {
        System.out.println("Cari ID Film");
        System.out.println("Masukkan ID Film: ");
        String id = scanner.nextLine();
        Film temp = new Film(id);
        Film film = daftarFilm.search(temp, Comparator.comparing(a -> a.id));
        if (film != null) {
            System.out.println("ID: " + film.id);
            System.out.println("Judul: " + film.judul);
            System.out.println("Rating: " + film.rating);
        } else {
            System.out.println("Film tidak ditemukan");
        }
    }

    static void urutkanDataRatingFilmDESC() {
        System.out.println("Urutkan Data Rating Film-DESC");
        daftarFilm.sort((a, b) -> b.rating.compareTo(a.rating));
    }
}
