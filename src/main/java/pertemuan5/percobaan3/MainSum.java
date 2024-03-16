package pertemuan5.percobaan3;

import java.util.Arrays;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printTitle();
        Perusahaan[] perusahaan = jumlahPerusahaan(scanner);
        isiPerusahaan(perusahaan, scanner);
        printPerusahaan(perusahaan);
        keuntunganSeluruhPerusahaan(perusahaan);
    }
    static Perusahaan[] jumlahPerusahaan(Scanner scanner) {
        System.out.print("Masukkan jumlah perusahaan : ");
        return new Perusahaan[scanner.nextInt()];
    }

    static void isiPerusahaan(Perusahaan[] perusahaan, Scanner scanner) {
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukan nama perusahaan : ");
            String namaPerusahaan = scanner.next();
            System.out.print("Masukan jumlah bulan : ");
            int jumlahBulan = scanner.nextInt();
            perusahaan[i] = new Perusahaan(namaPerusahaan, jumlahBulan, new Sum(jumlahBulan));
            isiKeuntungan(perusahaan[i].sum, scanner);
            System.out.println("============================================================");
        }
    }

    static void printPerusahaan(Perusahaan[] perusahaan) {
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("============================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Nama Perusahaan : " + perusahaan[i].namaPerusahaan);
            System.out.println("Jumlah Bulan : " + perusahaan[i].jumlahBulan);
            System.out.println("============================================================");
            sumBF(perusahaan[i].sum);
            System.out.println("============================================================");
            sumDC(perusahaan[i].sum);
            System.out.println("============================================================");
        }
    }

    static void isiKeuntungan(Sum sum, Scanner scanner) {
        for (int i = 0; i < sum.element; i++) {
            System.out.print("Masukan untung bulan ke-" + (i + 1) + " = ");
            sum.keuntungan[i] = scanner.nextDouble();
        }
    }

    static void sumBF(Sum sum) {
        System.out.println("Algoritma Brute Force");
        sum.total = sum.totalBF(sum.keuntungan);
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f juta%n",
                sum.element,
                sum.total);
    }

    static void sumDC(Sum sum) {
        System.out.println("Algoritma Divide and Conquer");
        sum.total = sum.totalDC(sum.keuntungan, 0, sum.element - 1);
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f juta%n",
                sum.element,
                sum.total);
    }

    static void printTitle() {
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("============================================================");
    }

    static void keuntunganSeluruhPerusahaan(Perusahaan[] perusahaan) {
        double total = Arrays.stream(perusahaan).mapToDouble(p -> p.sum.total).sum();
        System.out.println("============================================================");
        System.out.printf("Total keuntungan dari %s perusahaan adalah %.2f juta%n", perusahaan.length, total);
        System.out.println("============================================================");
    }
}
