package pertemuan5.percobaan1;

public class Faktorial {
    private int nilai;

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    // Faktorial Brute Force for
    int faktorialBF1(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    // Faktorial Brute Force while
    int faktorialBF2(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    // Faktorial Brute Force do while
    int faktorialBF3(int n) {
        int fakto = 1;
        int i = 1;
        if (n != 0) {
            do {
                fakto *= i;
                i++;
            } while (i <= n);
        }
        return fakto;
    }

    int faktorialDC(int n) {
        return (n == 0) ? 1 : n * faktorialDC(n - 1);
    }
}
