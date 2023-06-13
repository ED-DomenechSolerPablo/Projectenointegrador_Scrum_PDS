package caixanegra;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class P1CaixaNegraTest_Parametrtitzada {
    private P1CaixaNegra caixaNegra;

    @BeforeEach
    public void setUp() {
        caixaNegra = new P1CaixaNegra();
    }

    @AfterEach
    public void tearDown() {
    }


    public static Stream<Arguments> dataForValidTestCases() {
        return Stream.of(
                Arguments.of("1", "1", 0.0f),
                Arguments.of("1", "10", 0.0f),
                Arguments.of("1", "11", 2.5f),
                Arguments.of("1", "21", 2.5f),
                Arguments.of("1", "22", 5.0f),
                Arguments.of("1", "31", 5.0f)
        );
    }

    public static Stream<Arguments> dataForNonValidTestCases() {
        return Stream.of(
                Arguments.of("0", "2", "Error: dni fuera de rango"),
                Arguments.of("100000000", "12", "Error: dni fuera de rango"),
                Arguments.of("12345678", "0", "Error: día fuera de rango"),
                Arguments.of("12345678", "32", "Error: día fuera de rango")
        );
    }

    @ParameterizedTest
    @MethodSource("dataForValidTestCases")
    @DisplayName("Casos válidos")
    public void recarrecValidTest(String dni, String dia, float expectedResult) {
        float result = caixaNegra.recarrec(dni, dia);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("dataForNonValidTestCases")
    @DisplayName("Casos inválidos")
    public void recarrecNonValidTest(String dni, String dia, String expectedExceptionMessage) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            caixaNegra.recarrec(dni, dia);
        });
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }

    }

