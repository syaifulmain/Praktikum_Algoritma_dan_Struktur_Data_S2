package pertemuan15.percobaan1;

import java.util.Scanner;

public class GraphMain15 {
    public static void main(String[] args) {
        Graph15 gedung = new Graph15(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        Scanner sc15 = new Scanner(System.in);
        System.out.println("\n[Kosong untuk keluar]\n");
        while (true) {
            System.out.print("Masukkan gedung asal: ");
            String asal = sc15.nextLine();
            if (!asal.matches("[0-9]+")) break;
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = Integer.parseInt(sc15.nextLine());
            gedung.check(Integer.parseInt(asal), tujuan);
            System.out.println();
        }
    }
}
