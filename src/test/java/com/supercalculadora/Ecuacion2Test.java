package com.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.clases.Ecuacion2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ecuacion2Test {

    Ecuacion2 ecuacion2;
    double[] resultados;

    @BeforeEach
    void setUp() {
        ecuacion2 = new Ecuacion2();
        resultados = new double[2];
    }

    @Test
    @DisplayName("Datos correctos")
    void testEcuacion2() {
    this.resultados[0] = -1.0;
    this.resultados[1] = -2.0;
    assertArrayEquals(this.resultados, ecuacion2.calcular(1, 3, 2), "Los resultados con numeros enteros");

    }

    @Test
    void testEcuacionSinInde() {

    this.resultados[0] = 2.0;
    this.resultados[1] = 0.0;
    assertArrayEquals(this.resultados, ecuacion2.calcular(2, -4, 0), "Los resultados sin termino independiente");

    }

    @Test
    void testEcuacionSinX() {

    this.resultados[0] = 2.0;
    this.resultados[1] = -2.0;
    assertArrayEquals(this.resultados, ecuacion2.calcular(2, 0, -8), "Los resultados sin termino en x");
    
    }

    @Test
    void testEcuacionSinXyInde() {

    this.resultados[0] = 0.0;
    this.resultados[1] = 0.0;
    assertArrayEquals(this.resultados, ecuacion2.calcular(2, 0, 0), "Los resultados sin termino en x y termino independiente");
    
    }

    @Test
    void testEcuacionSinX2() {
        this.resultados[0] = Double.parseDouble("+NaN");
        this.resultados[1] = Double.parseDouble("-Infinity");
        assertArrayEquals(this.resultados, ecuacion2.calcular(0, 2, 4), "Los resultados sin termino en x");

    }

    @Test
    void testRaizNegati() {

        this.resultados[0] = Double.parseDouble("+NaN");
        this.resultados[1] = Double.parseDouble("-Infinity");
        assertArrayEquals(this.resultados, ecuacion2.calcular(0, 2, 4), "Los resultados sin termino en x");
    }
    
}
