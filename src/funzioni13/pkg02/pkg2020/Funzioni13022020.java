package funzioni13.pkg02.pkg2020;

import java.util.Random;
import java.util.Scanner;

public class Funzioni13022020 {

    static int areamagg(int dato1, int dato2) {
        int area = 0;
        area = ((dato1 * dato2));
        System.out.println("=  " + area);
        return area;
    }

    public static void main(String[] args) {
        Scanner kekkeroni = new Scanner(System.in);
        Random randeroni = new Random();
        int n, areafunz = 0, max = 0;
        System.out.print("quante righe ");
        n = kekkeroni.nextInt();
        int matrixoni[][] = new int[2][n];
        for (int i = 0; i < n; i++) {
            matrixoni[0][i] = randeroni.nextInt(100);
            matrixoni[1][i] = randeroni.nextInt(100);
            

        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrixoni[0][i] + " * " + matrixoni[1][i] + "  ");
            areafunz = areamagg(matrixoni[0][i], matrixoni[1][i]);
            if (areafunz > max) {
                max = areafunz;
            }
        }
        System.out.println();
        System.out.print("l'area maggiore è " + max);
    }
}
