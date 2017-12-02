package mybackpack;

import java.util.ArrayList;
import java.util.Collections;

public class BackpackFunction {
    
    void printMatrix(int matr[][]) {
        for( int i=0; i<matr.length; i++) {
            for( int j=0; j<matr[i].length; j++) {
                System.out.printf("%4d",matr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    int function01(int w[], int c[], int L) {
        int M = w.length;
        int matr[][] = new int[M+1][L+1];
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= L; j++) {
                if (w[i-1] > j) {
                    matr[i][j] = matr[i-1][j];
                } 
                else {
                    matr[i][j] = Math.max(matr[i-1][j],
                            matr[i-1][j-w[i-1]] + c[i-1]);
                }
            }
        }
        printMatrix(matr);
        ArrayList lst = new ArrayList();
        int im = matr.length-1;
        int jw = matr[0].length-1;
        while (matr[im][jw] !=  0) {
            if (matr[im-1][jw] < matr[im][jw]) {
                lst.add(im);
                jw = jw - w[im-1];
            }
            im--;
        }
        Collections.reverse(lst);
        System.out.print("Номера предметов: ");
        System.out.println(lst);
        return matr[M][L];
    }
}