package caixanegra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class P1CaixaNegraTest {
    private P1CaixaNegra caixaNegra;

    @BeforeEach
    public void setUp() {
        caixaNegra = new P1CaixaNegra();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    @DisplayName("cp1: DNI inválido => IllegalArgumentException")
    public void cp1() {
        String dni = "abcd";
        String dia = "15";
        assertThrows(IllegalArgumentException.class, () -> {
            caixaNegra.recarrec(dni, dia);
        });
    }

    @Test
    @DisplayName("cp2: DNI fuera de rango => IllegalArgumentException")
    public void cp2() {
        String dni = "100000000";
        String dia = "15";
        assertThrows(IllegalArgumentException.class, () -> {
            caixaNegra.recarrec(dni, dia);
        });
    }

    @Test
    @DisplayName("cp3: Día fuera de rango => IllegalArgumentException")
    public void cp3() {
        String dni = "12345678";
        String dia = "40";
        assertThrows(IllegalArgumentException.class, () -> {
            caixaNegra.recarrec(dni, dia);
        });
    }
}
