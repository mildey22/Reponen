package Kortit;

import java.util.Scanner;

public class KorttipakkaOhjelma {

public static void main(String[] args) {

Scanner i1 = new Scanner(System.in);

Korttipino korttipakka = new Korttipakka();

while (true) {

System.out.println("Anna pelikortin maa(- lopettaa):");
String maa = i1.nextLine();

if ("-".equals(maa)) {
break;
}

else {

System.out.println("Anna pelikortin numero:");
int numero = i1.nextInt();

i1.nextLine();

korttipakka.lisaa(new Pelikortti(maa, numero)); 

}

}


System.out.println("Korttipakassa on " + korttipakka.annaKoko() + " korttia:");


for (int i = korttipakka.annaKoko() - 1; i >= 0; i--) {
Pelikortti kortti = korttipakka.anna(i);
System.out.println(kortti.getMaa() + " " + kortti.getNumero());
}

i1.close();

}
    
}