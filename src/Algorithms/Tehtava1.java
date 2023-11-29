package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {

        int[] staticArray = new int[6];

        staticArray[0] = 23;
        staticArray[1] = 15;
        staticArray[2] = 4;
        staticArray[3] = 42;
        staticArray[4] = 8;
        staticArray[5] = 16;

        Arrays.sort(staticArray);

        Scanner i1 = new Scanner(System.in);

        while (true) {

            System.out.println("Valitse toiminto (H = hae, L = lopeta):");

            String choice = i1.nextLine();

            if (choice.equals("H")) {

                System.out.println("Anna taulukosta haettava luku:");
                int search = i1.nextInt();

                i1.nextLine();

                int index = Arrays.binarySearch(staticArray, search);

                if (index >= 0) {
                    System.out.println("Numero " + search + " löytyy taulukon kohdasta " + (index + 1) + ".");
                } else {
                    System.out.println("Numero " + search + " ei löydy taulukosta.");
                }

            }

            if (choice.equals("L")) {
                break;
            }

        }

        i1.close();

    }

}
