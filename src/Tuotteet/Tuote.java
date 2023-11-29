package Tuotteet;

public class Tuote {
    private int tuotekoodi;
    private String nimi;
    private double hinta;

public Tuote() {}

public Tuote(int tuotekoodi, String nimi, double hinta) {
this.tuotekoodi = tuotekoodi;
this.nimi = nimi;
this.hinta = hinta;
}

public int gettuotekoodi() {
return tuotekoodi;
}

public void settuotekoodi(int tuotekoodi) {
this.tuotekoodi = tuotekoodi;
}

public String getnimi() {
return nimi;
}

public void setnimi(String nimi) {
this.nimi = nimi;
}

public double gethinta() {
return hinta;
}

public void sethinta(double hinta) {
this.hinta = hinta;
}

public String toString() {
return "Tuote [tuotekoodi=" + tuotekoodi + ", nimi=" + nimi + ", hinta=" + hinta + "]";
}

}
