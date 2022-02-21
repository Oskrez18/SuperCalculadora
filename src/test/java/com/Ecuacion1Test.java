package com;
import static
org.junit.jupiter.api.Assertions.assertEquals;

import com.clases.Ecuacion1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ecuacion1Test {

    Ecuacion1 ecuacion1;

    @BeforeEach
    void setUp() {
        ecuacion1 = new Ecuacion1();
    }

    @Test
    @DisplayName("Datos correctos")
    void testEcuacion1() {
    assertEquals(2.0, ecuacion1.calcular(-6, 3),
    "El método está bien hecho");

    }

    @Test
    void testExpectedException() {

        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
        
        ecuacion1.calcular(6, 0);
        
        }, "Se espera NumberFormatException");

        Assertions.assertEquals("/ by zero", thrown.getMessage());
    }
}