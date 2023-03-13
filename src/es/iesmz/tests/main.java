package es.iesmz.tests;

public class main {
    public static void main(String[] args) {
        boolean[][] anyo = new boolean[12][30];
        for (int i = 0; i < anyo.length; i++) {
            for (int j = 0; j < anyo[0].length; j++) {
                System.out.println(anyo[i][j]);
            }
        }
    }
}
