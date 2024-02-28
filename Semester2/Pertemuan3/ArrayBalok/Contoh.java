package ArrayBalok;

class Contoh {
    
}
class InnerContoh {
    String a;
    String b;
    int c;
    int d;
    // counsturctor default
    public InnerContoh() {
    }
    // constructor dengan 4 parameter
    public InnerContoh(String a, String b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    // constructor String dengan 2 parameter
    public InnerContoh(String a, String b) {
        this.a = a;
        this.b = b;
    }
    // constructor int dengan 2 parameter
    public InnerContoh(int c, int d) {
        this.c = c;
        this.d = d;
    }

    // Meski memiliki tugas yang berbeda, terdeteksi error karena memiliki tipe data parameter yang sama
    public InnerContoh(String a, int c) {
        this.a = a;
        this.c = c;
    }
    public InnerContoh(String b, int d) {
        this.b = b;
        this.d = d;
    }
}
