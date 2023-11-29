package Mappi;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PostinumerotOhjelma {

    public static void main(String[] args) {

        Map<String, String> postitoimipaikat = new HashMap<String, String>();

        Scanner i1 = new Scanner(System.in);

        while (true) {

            System.out.println("U, Anna Uusi postinumero, postitoimipaikka");

            System.out.println("H, Hae postinumeroa vastaava postitoimipaikka");

            System.out.println("Anna valintasi:");
            String choice = i1.nextLine();

            if (choice.equals("L")) {
                System.out.println("Loppu!");
                break;
            }

            if (choice.equals("U")) {
                System.out.println("Anna postinumero:");
                String zip = i1.nextLine();
                System.out.println("Anna postitoimipaikka:");
                String city = i1.nextLine();

                postitoimipaikat.put(zip, city);

            }

            if (choice.equals("H")) {
                System.out.println("Anna postinumero, jota vastaava postitoimipaikka haetaan:");
                String searchZip = i1.nextLine();
                System.out.println("Löytyi postitoimipaikka: " + postitoimipaikat.get(searchZip));

            }

        }

        i1.close();

    }

}