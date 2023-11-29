package Tuotteet;

import java.util.Scanner;

public class TuotteetOhjelma {

    public static void main(String[] args) {

        Scanner i1 = new Scanner(System.in);

        System.out.println("Syötä kirjatuotteen tiedot!");

        System.out.println("Anna tuotekoodi:");
        int kirjakoodi = i1.nextInt();

        i1.nextLine();

        System.out.println("Anna nimi:");
        String kirjanimi = i1.nextLine();

        System.out.println("Anna hinta:");
        double kirjahinta = i1.nextDouble();

        i1.nextLine();

        Tuote tuote1 = new Tuote();
        tuote1.settuotekoodi(kirjakoodi);
        tuote1.setnimi(kirjanimi);
        tuote1.sethinta(kirjahinta);

        System.out.println("Anna sivumäärä:");
        int sivumäärä = i1.nextInt();

        i1.nextLine();

        System.out.println("Anna sidosasu:");
        String sidosasu = i1.nextLine();

        KirjaTuote kirja1 = new KirjaTuote();
        kirja1.setsivumaara(sivumäärä);
        kirja1.setsidosasu(sidosasu);

        System.out.println("Syötä dvdtuotteen tiedot!");

        System.out.println("Anna tuotekoodi:");
        int dvdkoodi = i1.nextInt();

        i1.nextLine();

        System.out.println("Anna nimi:");
        String dvdnimi = i1.nextLine();

        System.out.println("Anna hinta:");
        double dvdhinta = i1.nextDouble();

        i1.nextLine();

        Tuote tuote2 = new Tuote();
        tuote2.settuotekoodi(dvdkoodi);
        tuote2.setnimi(dvdnimi);
        tuote2.sethinta(dvdhinta);

        System.out.println("Anna kesto(min):");
        int kesto = i1.nextInt();

        i1.nextLine();

        System.out.println("Anna ikäsuositus:");
        String ikasuositus = i1.nextLine();

        DVDTuote dvd1 = new DVDTuote();
        dvd1.setkesto(kesto);
        dvd1.setikasuositus(ikasuositus);

        System.out.println("KIRJATUOTTEEN TIEDOT:");
        System.out.println("Tuotekoodi: " + tuote1.gettuotekoodi());
        System.out.println("Nimi: " + tuote1.getnimi());
        System.out.println("Hinta: " + tuote1.gethinta());
        System.out.println("Sivumäärä: " + kirja1.getsivumaara());
        System.out.println("Sidosasu: " + kirja1.getsidosasu());

        System.out.println("DVDTUOTTEEN TIEDOT:");
        System.out.println("Tuotekoodi: " + tuote2.gettuotekoodi());
        System.out.println("Nimi: " + tuote2.getnimi());
        System.out.println("Hinta: " + tuote2.gethinta());
        System.out.println("Kesto(min): " + dvd1.getkesto());
        System.out.println("Ikäsuositus: " + dvd1.getikasuositus());

        i1.close();

    }

}
