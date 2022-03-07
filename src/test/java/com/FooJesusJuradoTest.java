package com;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.clases.FooJesusJurado;
import com.clases.Operaciones;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FooJesusJuradoTest {
    
    FooJesusJurado operaciones;

    @BeforeEach
    void setUp() {
        operaciones = new FooJesusJurado();
    }

    @Test
    @DisplayName("Logaritmo factorial")
    void LogaritmoFactorial() {
        assertEquals(24,CombinatoricsUtils.factorial(4));
    }

    @Test
    @DisplayName("Logaritmo")
    void Logaritmo() {
    assertEquals(5.0, operaciones.logaritmo(32, 2), "Los resultados de un logaritmo");
    }

}
