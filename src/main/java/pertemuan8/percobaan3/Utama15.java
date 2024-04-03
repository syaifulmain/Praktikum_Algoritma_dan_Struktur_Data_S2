package pertemuan8.percobaan3;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukan ekspresi matematika (infix) : ");
        Q = scanner.nextLine().trim() + ")";
        int n = Q.length();

        Postfix15 postfix = new Postfix15(n);
        P = postfix.konversi(Q);
        System.out.println("Ekspresi matematika (postfix) : " + P);
    }
}
