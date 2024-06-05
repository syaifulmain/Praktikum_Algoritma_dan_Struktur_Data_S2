package pertemuan15.percobaan2;

public class GraphMatriks15 {
    int vertex;
    int[][] matriks;

    public GraphMatriks15(int vertex) {
        this.vertex = vertex;
        matriks = new int[vertex][vertex];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int outDegree(int v) {
        int degree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != 0) {
                degree++;
            }
        }
        return degree;
    }

    public int inDegree(int v) {
        int degree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != 0) {
                degree++;
            }
        }
        return degree;
    }

    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + " - OutDegree: " + outDegree(i) + ", InDegree: " + inDegree(i));
        }
    }
}
