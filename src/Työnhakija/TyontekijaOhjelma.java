package Työnhakija;

import java.util.Scanner;

public class TyontekijaOhjelma {

    public static void main(String[] args) {

        Scanner i1 = new Scanner(System.in);

        System.out.println("Syötä työntekijan tiedot!");

        System.out.println("Anna nimi:");
        String nimi = i1.nextLine();

        System.out.println("Anna osoite:");
        String osoite = i1.nextLine();

        System.out.println("Anna tuntipalkka:");
        double palkka = i1.nextDouble();

        Henkilo henkilo1 = new Henkilo();
        henkilo1.setnimi(nimi);
        henkilo1.setosoite(osoite);

        Tyontekija tyontekija1 = new Tyontekija();
        tyontekija1.settuntipalkka(palkka);

        System.out.println("TYÖNTEKIJÄTIEDOT");
        System.out.println("Nimi: " + henkilo1.getnimi());
        System.out.println("Osoite: " + henkilo1.getosoite());
        System.out.println("Tuntipalkka: " + tyontekija1.gettuntipalkka());

        i1.close();

    }
}