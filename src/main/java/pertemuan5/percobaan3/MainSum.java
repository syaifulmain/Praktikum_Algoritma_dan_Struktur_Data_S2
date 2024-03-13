package pertemuan5.percobaan3;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukan jumlah bulan : ");
        int element = scanner.nextInt();
        Sum sum = new Sum(element);
        System.out.println("============================================================");
        for (int i = 0; i < sum.element; i++) {
            System.out.print("Masukan untung bulan ke-" + (i + 1) + " = ");
            sum.keuntungan[i] = scanner.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f juta%n",
                sum.element,
                sum.totalBF(sum.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f juta%n",
                sum.element,
                sum.totalDC(sum.keuntungan, 0, sum.element - 1));
        System.out.println("============================================================");
    }
}
