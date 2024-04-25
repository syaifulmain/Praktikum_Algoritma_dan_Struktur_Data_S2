package pertemuan10.tugas;

public record Pembeli(String nama, int noHP) {
    @Override
    public String toString() {
        return """
                Nama  : %s
                No HP : %d
                """.formatted(nama, noHP);
    }
}
