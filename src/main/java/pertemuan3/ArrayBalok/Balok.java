package pertemuan3.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    // counsturctor default
    public Balok() {
    }
    // constructor dengan 3 parameter
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    // constructor dengan 2 parameter
    public Balok(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    // constructor dengan 1 parameter
    public Balok(int panjang) {
        this.panjang = panjang;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
