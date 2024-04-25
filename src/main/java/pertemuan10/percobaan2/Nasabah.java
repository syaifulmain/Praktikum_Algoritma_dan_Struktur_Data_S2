package pertemuan10.percobaan2;

public class Nasabah {
    private final String noRekening;
    private final String nama;
    private final String alamat;
    private final int umur;
    private final double saldo;

    public Nasabah(String noRekening, String nama, String alamat, int umur, double saldo) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return """
                No Rekening : %s
                Nama        : %s
                Alamat      : %s
                Umur        : %d
                Saldo       : %.2f
                """.formatted(noRekening, nama, alamat, umur, saldo);
    }
}
