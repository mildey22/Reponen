package Tuotteet;

public class KirjaTuote extends Tuote{

private int sivumaara;
private String sidosasu;

public KirjaTuote() {
}

public KirjaTuote(int tuotekoodi, String nimi, double hinta, int sivumaara, String sidosasu) {
super();
super.settuotekoodi(tuotekoodi);
super.setnimi(nimi);
super.sethinta(hinta);
this.settuotekoodi(tuotekoodi);
}

public int getsivumaara() {
return sivumaara;
}

public void setsivumaara(int sivumaara) {
this.sivumaara = sivumaara;
}

public String getsidosasu() {
return sidosasu;
}

public void setsidosasu(String sidosasu) {
this.sidosasu = sidosasu;
}

@Override
public String toString() {
return "KirjaTuote [sivumaara=" + sivumaara + ", sidosasu=" + sidosasu + "]";
}
    
}
