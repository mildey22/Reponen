package Tuotteet;

public class DVDTuote extends Tuote {

private int kesto;
private String ikasuositus;

public DVDTuote() {
}

public DVDTuote(int tuotekoodi, String nimi, double hinta, int kesto, String ikasuositus) {
super();
super.settuotekoodi(tuotekoodi);
super.setnimi(nimi);
super.sethinta(hinta);
this.settuotekoodi(tuotekoodi);
}

public int getkesto() {
return kesto;
}

public void setkesto(int kesto) {
this.kesto = kesto;
}

public String getikasuositus() {
return ikasuositus;
}

public void setikasuositus(String ikasuositus) {
this.ikasuositus = ikasuositus;
}

@Override public String toString() {
return "DVDTuote [kesto=" + kesto + ", ikasuositus=" + ikasuositus + "]";
}

}
