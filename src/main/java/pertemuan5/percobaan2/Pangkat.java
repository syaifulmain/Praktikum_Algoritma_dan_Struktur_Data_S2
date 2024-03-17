package pertemuan5.percobaan2;

public class Pangkat {
    public int nilai, pangkat;

     enum Metode {
        BF("BRUTE FORCE"),
        DC("DIVIDE AND CONQUER");
        private String name;

         private Metode(String name) {
             this.name = name;
         }

         public String getName() {
             return name;
         }
     }

    public Pangkat() {
    }

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    static int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    static int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
