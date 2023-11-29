package yksikkötestaus;

public class Auto {

private String merkki;
private String malli;
private double hinta;

public Auto() {
}


public Auto(String merkki, String malli, double hinta) {
this.merkki = merkki;
this.malli = malli;
this.hinta = hinta;
}


    public String getMerkki() {
        return this.merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return this.malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public double getHinta() {
        return this.hinta;
    }

   public boolean setHinta(double hinta) {
if (hinta >= 0) {
this.hinta = hinta;
return true;
} else {
return false;
}


}

}