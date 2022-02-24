package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.clases.Operaciones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperacionesTest {

    Operaciones operaciones;

    @BeforeEach
    void setUp() {
        operaciones = new Operaciones();
    }

    @Test
    @DisplayName("Suma")
    void Suma() {
    assertEquals(4.0, operaciones.getResult(2, 2, 1), "Los resultados de una suma");

    }

    @Test
    @DisplayName("Resta")
    void Resta() {
    assertEquals(0.0, operaciones.getResult(2, 2, 2), "Los resultados de una resta");

    }

    @Test
    @DisplayName("MUltiplicacion")
    void MUltiplicacion() {
    assertEquals(4.0, operaciones.getResult(2, 2, 3), "Los resultados de una multiplicacion");

    }

    @Test
    @DisplayName("Division")
    void Division() {
    assertEquals(1.0, operaciones.getResult(2, 2, 4), "Los resultados de una division");

    }

    @Test
    @DisplayName("Potencia")
    void Potencia() {
    assertEquals(9.0, operaciones.getResult(3, 2, 5), "Los resultados de una potencia");

    }

    @Test
    @DisplayName("Raiz")
    void Raiz() {
    assertEquals(4.0, operaciones.getResult(16, 2, 6), "Los resultados de una raiz");

    }

    @Test
    @DisplayName("Suma")
    void Logaritmo() {
    assertEquals(5.0, operaciones.getResult(32, 2, 7), "Los resultados de un logaritmo");

    }
    
}
