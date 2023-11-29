package Kortit;

public class Pelikortti {
    
private String maa;

private int numero;

public Pelikortti() {
}

public Pelikortti(String maa, int numero) {
this.maa = maa;
this.numero = numero;
}


    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Pelikortti [maa=" + getMaa() + ", numero=" + getNumero() + "]";
    }


}
