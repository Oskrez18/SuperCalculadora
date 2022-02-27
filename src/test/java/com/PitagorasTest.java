package com;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.clases.Pitagoras;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PitagorasTest {

    Pitagoras pitagoras;

    @Test
    @DisplayName("Falta Cateto y la hipotenusa es mas grande")
    void testPitagorasCB() {
        pitagoras = new Pitagoras(5,3,1);
        assertEquals(4.0, pitagoras.calcularPitagoras(),
        "Falta cateto y la hipotenusa está bien");
    }

    @Test
    @DisplayName("Falta Cateto y la hipotenusa es mas pequeña")
    void testPitagorasCM() {
        pitagoras = new Pitagoras(2,3,1);
        assertEquals(Double.parseDouble("NaN"), pitagoras.calcularPitagoras(),
        "Falta cateto y la hipotenusa está bien");
    }

    @Test
    @DisplayName("Falta Hipotenusa")
    void testPitagorasH() {
        pitagoras = new Pitagoras(4,3,2);
        assertEquals(5.0, pitagoras.calcularPitagoras(),
        "Falta cateto y la hipotenusa está bien");
    }

    @Test
    @DisplayName("Alguna medida 0 o negativo")
    void testPitagoras0() {
        pitagoras = new Pitagoras(0,3,2);
        assertEquals(Double.parseDouble("NaN"), pitagoras.calcularPitagoras(), "Algun lado es 0 o negativo");
    }



    
}
