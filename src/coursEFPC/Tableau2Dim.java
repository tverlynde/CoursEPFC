package coursEFPC;

import java.util.Arrays;

public class Tableau2Dim {

    public static void main(String[] args) {
        int[][] table = new int[8][10];
        fillTable(table);
        printTablev2(table);
        printTable(table);
    }

    private static void printTablev2(int[][] table) {
        for (int[] i : table) {
            System.out.println(Arrays.toString(i));
        }
    }

    private static void fillTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i * 10 + j;
            }
        }
    }

    private static void printTable(int[][] table) {
        for (int[] table1 : table) {
            for (int j = 0; j < table1.length; j++) {
                System.out.printf("%4d", table1[j]);
            }
            System.out.println("");
        }
    }

}
