package com.supercalculadora.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pitagoras {
    
    private Float a;
    private Float b;
    private Float c;
    private String resultado;

    public pitagoras(){
        
    }
    
    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }


    public String calcularPitagoras(){
        
        DecimalFormat df = new DecimalFormat("#.00");

        if(this.a == null){
            this.a = (float) Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            this.resultado = "El cateto a es igual a: " + df.format(this.a);
        }else if(this.b == null){
            this.b = (float) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            this.resultado = "El cateto b es igual a: " + df.format(this.b);
        }else{
            this.c = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            this.resultado = "La hipotenusa es igual a: " + df.format(this.c);
        }
    
        return this.resultado;

    }

   
}
