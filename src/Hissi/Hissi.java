package Hissi;

public class Hissi {

private String valmistaja;

private int vuosi;

private int kerrokset;

private int matkustajat;

public Hissi() {
}

public Hissi(String valmistaja, int vuosi, int kerrokset, int matkustajat) {
this.valmistaja = valmistaja;
this.vuosi = vuosi;
this.kerrokset = kerrokset;
this.matkustajat = matkustajat;

}

@Deprecated
public Hissi(String valmistaja) {
}

public String getvalmistaja() {
return valmistaja;
}

public void setvalmistaja(String valmistaja) {
this.valmistaja = valmistaja;
}
    
public int getvuosi() {
return vuosi;
}

public void setvuosi(int vuosi) {
this.vuosi = vuosi;
}

public int getkerrokset() {
return kerrokset;
}

public void setkerrokset(int kerrokset) {
this.kerrokset = kerrokset;
}

public int getmatkustajat() {
return matkustajat;
}

public void setmatkustajat(int matkustajat) {
this.matkustajat = matkustajat;
}

@Override
public String toString() {
return "Hissi [valmistaja=" + valmistaja + ", vuosi=" + vuosi + ", kerrokset=" + kerrokset + ", matkustajat=" + matkustajat + "]";
}

}
