package pertemuan15.percobaan2;

public class GraphMain15 {
    public static void main(String[] args) {
        GraphMatriks15 gdg = new GraphMatriks15(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println("Derajat (degree) setiap gedung:");
        gdg.printDegrees();
    }
}
