package yksikkötestaus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class Test {
    
@Test 
void testSetHintaNegatiivinenNumero() {
double hinta = -1;
Auto auto1 = new Auto();
boolean onkoHintaOk = auto1.setHinta(hinta);
Assert.assertTrue(onkoHintaOk == false);
}

@Test 
void testSetHintaPositiivinenNumero() {
double hinta = 1;
Auto auto1 = new Auto();
boolean onkoHintaOk = auto1.setHinta(hinta);
Assert.assertTrue(onkoHintaOk == true);
}

}
