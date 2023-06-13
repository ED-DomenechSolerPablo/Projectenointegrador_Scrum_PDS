package caixablanca;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class P1CaixaBlancaBTest extends P1CaixaBlancaB {
    P1CaixaBlancaB caixaBlanca;

    @BeforeEach
    void setUp() {
        caixaBlanca = new P1CaixaBlancaBTest();
        System.out.println("P1CaixaBlancaBTest: Proves de caixa blanca per al mètode operaciones()");
    }

    @AfterEach
    void tearDown() {
        caixaBlanca = null;
        System.out.println("P1CaixaBlancaATest=null");
    }

    @DisplayName("Cami1: 2-3-9; a+b; a=10,b=3,c=+")
    @Test
    public void testOperacionesDefault() {
        int a = 10, b = 3;
        String c = "+";
        double actualResult = doOperation(a, b, c),
                expectedResult = a + b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami2: 2-3-9; a+b;a=10,b=3,c=+")
    @Test
    public void testOperacionesSuma() {
        int a = 10, b = 3;
        String c = "+";
        double actualResult = doOperation(a, b, c),
                expectedResult = a + b;
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Cami3:2-4-9;a-b;a=10,b=3,c=-")
    @Test
    public void tePèracopmesResta() {
        int a =10, b=3;
        String c = "-";
        double actualResult = doOperation(a,b,c),
                expectedResult=a-b;
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Capi4: 2-5-9;a*b;a=10,b=3,c=*")
    @Test
    public void testOperacionesMulti(){
        int a = 10, b=3;
        String c="*";
        double actualResult=doOperation(a,b,c),
                expectedResult = a*b;
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Cami5: 2-6-9; a/b;a=10,b=3,c=/")
    @Test
    public void testOperacionesDiv(){
        int a = 10, b=3;
        String c = "/";
        double actualResult = doOperation(a,b,c),
                expectedResult = (double) a/b;
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Cami6: 2-7-9;a^b;a=10,b=3,c=^")
    @Test
    public void testOperacionesPotencia(){
        int a = 10, b=3;
        String c= "^";
        double actualResult = doOperation(a,b,c),
                expectedResult = Math.pow(a,b);
        assertEquals(expectedResult, actualResult);
    }


}