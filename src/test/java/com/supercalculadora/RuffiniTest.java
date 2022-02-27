package com.supercalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import com.clases.Ruffini;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RuffiniTest {
    
    Ruffini oper;
    ArrayList<Integer> grados;

    @Test
    @DisplayName("Salida de resultados prueba 01:")
    void testRuffini01() {
        ArrayList<Integer> respuestas = new ArrayList<Integer>();
        grados = new ArrayList<Integer>();
        //Añadimos los coeficientes:
        grados.add(1);
        grados.add(0);
        grados.add(-3);
        grados.add(2);
        oper = new Ruffini(grados);
        //Creamos los resultados esperados:
        respuestas.add(1);
        respuestas.add(-2);
        respuestas.add(1);
        assertEquals(respuestas, oper.getResultados());
    }

    @Test
    @DisplayName("Salida de resultados prueba 02: Sin termino independiente")
    void testRuffini02() {
        ArrayList<Integer> respuestas = new ArrayList<Integer>();
        grados = new ArrayList<Integer>();
        //Añadimos los coeficientes:
        grados.add(1);
        grados.add(-3);
        grados.add(-4);
        grados.add(12);
        grados.add(0);
        oper = new Ruffini(grados);
        //Creamos los resultados esperados:
        respuestas.add(0);
        respuestas.add(2);
        respuestas.add(-2);
        respuestas.add(3);
        assertEquals(respuestas, oper.getResultados());
    }

    @Test
    @DisplayName("Salida de resultados prueba 03: Sin solucion")
    void testRuffini03() {
        ArrayList<Integer> respuestas = new ArrayList<Integer>();
        grados = new ArrayList<Integer>();
        //Añadimos los coeficientes:
        grados.add(1);
        grados.add(2);
        grados.add(0);
        grados.add(2);
        grados.add(-1);
        oper = new Ruffini(grados);
        //Creamos los resultados esperados: El array estara vacia, ya que no se espera ningun resultados
        
        assertEquals(respuestas, oper.getResultados());
    }

}
