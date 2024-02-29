package LatihanPraktikum1;

class Kerucut{
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungVolume() {
        System.out.println(Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2)));
        return (double) 1 / 3 * Math.PI * Math.pow(jariJari, 2) * Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
    }

    public double hitungLuasPermukaan() {
        return (double) Math.PI * jariJari * (jariJari + sisiMiring);
    }
}

class LimasSegiEmpatSamaSisi{
    private double sisiAlas;
    private double tinggi;

    public LimasSegiEmpatSamaSisi(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (double) 1 / 3 * Math.pow(sisiAlas, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return (double) Math.pow(sisiAlas, 2) + 2 * sisiAlas * Math.sqrt(Math.pow(sisiAlas / 2, 2) + Math.pow(tinggi, 2));
    }
}

class bola{
    private double jariJari;

    public bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(jariJari, 3);
    }

    public double hitungLuasPermukaan() {
        return (double) 4 * Math.PI * Math.pow(jariJari, 2);
    }
}
