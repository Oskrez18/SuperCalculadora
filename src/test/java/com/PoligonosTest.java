package com;

import com.clases.Poligonos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoligonosTest {
    
    Poligonos poligonos;

    @Test 
    @DisplayName("Area triangulo")
    void testPoligonosTriangulo(){
        poligonos = new Poligonos(3,2);
        assertEquals(1.73 , poligonos.calcularArea());
    }
    @Test 
    @DisplayName("Area cuadrado")
    void testPoligonosCuadrado(){
        poligonos = new Poligonos(4,2);
        assertEquals(4.0 , poligonos.calcularArea());
    }
    @Test 
    @DisplayName("Area octogono")
    void testPoligonosOctogono(){
        poligonos = new Poligonos(8,3);
        assertEquals(43.46 , poligonos.calcularArea());
    }
    @Test 
    @DisplayName("Número de lados menor a 3")
    void testPoligonosNLM3(){
        poligonos = new Poligonos(2, 3);
        assertEquals(Double.parseDouble("NaN") , poligonos.calcularArea());
    }
    @Test 
    @DisplayName("Lado menor a 0")
    void testPoligonosLM0(){
        poligonos = new Poligonos(4, -1);
        assertEquals(Double.parseDouble("NaN") , poligonos.calcularArea());
    }
    @Test 
    @DisplayName("Lado menor a 0 y numero de lados menor a 3")
    void testPoligonosLM0NLM3(){
        poligonos = new Poligonos(-2, -1);
        assertEquals(Double.parseDouble("NaN") , poligonos.calcularArea());
        
    }

    


}
