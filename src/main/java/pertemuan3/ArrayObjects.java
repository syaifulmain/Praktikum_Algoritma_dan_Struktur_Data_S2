package pertemuan3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan jumlah persegi panjang: ");
        PersegiPanjang[] ppArray = new PersegiPanjang[input.nextInt()];
    
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang = input.nextInt();
            System.out.print("Masukan Lebar: ");
            ppArray[i].lebar = input.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

        PersegiPanjang[][] ppArray2D = new PersegiPanjang[2][2];

        for (int i = 0; i < ppArray2D.length; i++) {
            for (int j = 0; j < ppArray2D[i].length; j++) {
                ppArray2D[i][j] = new PersegiPanjang();
                System.out.println("Persegi Panjang ke-" + i + "," + j);
                System.out.print("Masukan Panjang: ");
                ppArray2D[i][j].panjang = input.nextInt();
                System.out.print("Masukan Lebar: ");
                ppArray2D[i][j].lebar = input.nextInt();
            }
        }

        for (int i = 0; i < ppArray2D.length; i++) {
            for (int j = 0; j < ppArray2D.length; j++) {
                System.out.println("Persegi Panjang ke-" + i + "," + j);
                System.out.println("Panjang: " + ppArray2D[i][j].panjang + ", Lebar: " + ppArray2D[i][j].lebar);
            }
        }
    }
}