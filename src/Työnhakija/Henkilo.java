package Työnhakija;

public class Henkilo {
private String nimi;
private String osoite;

public Henkilo() {
}

public Henkilo(String nimi, String osoite) {
this.nimi = nimi;
this.osoite = osoite;
}

public String getnimi() {
return nimi;
}

public void setnimi(String nimi) {
this.nimi = nimi;
}

public String getosoite() {
return osoite;
}

public void setosoite(String osoite) {
this.osoite = osoite;
}

public String toString() {
return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + "]";
}

}