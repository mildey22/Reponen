package Työnhakija;

public class Tyontekija extends Henkilo {

private double tuntipalkka;

public Tyontekija() {
}

public Tyontekija(String nimi, String osoite, double tuntipalkka) {
    super();
    super.setnimi(nimi);
	super.setosoite(osoite);
	this.setnimi(nimi);	
}

public double gettuntipalkka() {
    return tuntipalkka;
}

public void settuntipalkka(double tuntipalkka) {
    this.tuntipalkka = tuntipalkka;
}

@Override
public String toString() {
    return "Tyontekija [tuntipalkka=" + tuntipalkka + "]";
}
}