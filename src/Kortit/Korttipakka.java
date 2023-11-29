package Kortit;

import java.util.ArrayList;
import java.util.List;

class Korttipakka implements Korttipino {
    
private List<Pelikortti> kortit=new ArrayList<Pelikortti>();

@Override
public void lisaa(Pelikortti kortti) {
kortit.add(kortti);
}

@Override
public Pelikortti poista() {
return kortit.remove(kortit.size() - 1);
}

@Override
public int annaKoko() {
return kortit.size();
}

@Override
public Pelikortti anna(int index) {
if (index < 0 || index >= kortit.size()) {
return null;
}
return kortit.get(index);
}


}