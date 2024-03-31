package pertemuan7.percobaan3;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        System.out.println("Data awal");
        System.out.println(Arrays.toString(data));
        MargeSorting15.margeSort(data);
        System.out.println("Setelah diurutkan");
        System.out.println(Arrays.toString(data));
    }
}
