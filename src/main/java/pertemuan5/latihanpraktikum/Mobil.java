package pertemuan5.latihanpraktikum;

public class Mobil {
    private String merk;
    private String tipe;
    private int tahun;
    private int top_acceleration;
    private int top_power;

    Mobil[] getMobil () {
        return new Mobil[]{
                new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil("Nissan", "370Z", 2009, 4360, 657),
                new Mobil("Subaru", "BRZ", 2014, 4058, 609),
                new Mobil("Subaru", "Xpander", 2015, 4058, 120),
                new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
                new Mobil("Golf GTI", "Golf GTI", 2014, 4180, 631),
        };
    }

    public Mobil() {
    }

    public Mobil(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int getTopAcceleration() {
        return top_acceleration;
    }

    public int getTopPower() {
        return top_power;
    }

    @Override
    public String toString() {
        return """
                Merk: %s
                Tipe: %s
                Tahun: %d
                Top Acceleration: %d
                Top Power: %d
               """.formatted(merk, tipe, tahun, top_acceleration, top_power);
    }
}
