package caixablanca;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1CaixaBlancaATest extends P1CaixaBlancaA {

    P1CaixaBlancaA  caixaBlanca;

    @BeforeEach
    void setUp() {
         caixaBlanca = new P1CaixaBlancaATest();
        System.out.println("P1CaixaBlancaTest: Proves de caixa blanca per al mètod");
    }

    @AfterEach
    void tearDown(){
        caixaBlanca = null;
        System.out.println("P1CaixaBlancaATest = null");
    }

    @DisplayName("Cami1: 1-2-3-7; a>b && a>c; a=10, b=3,c=5")
    @Test
    public void testMajorDeTresAMajor () {
        int a=10, b=3,c=5,
                actualResult = majorDeTres(a,b,c);
        assertEquals(a, actualResult);
    }

    @DisplayName("Cami5 1-4-6-7;b>a && b>c;a=10,b=30,c=5")
    @Test
    @Disabled
    public void testMajorDeTresBMajor(){
        int a=10,b=30,c=5,
                actualResult=majorDeTres(a,b,c);
        assertEquals(b,actualResult);
    }

    @DisplayName("Cami3: 1-4-6-7; b>a && b>c; a=10, b=30,c=5")
    @Test
    @Disabled
    public void testMajorDeTresCMayor(){
        int a=10,b=3,c=50,
                actualResult=majorDeTres(a,b,c);
        assertEquals(c,actualResult);
    }
}