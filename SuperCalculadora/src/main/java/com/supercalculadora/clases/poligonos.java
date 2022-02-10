package com.supercalculadora.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

class poligonos {
    
    int numLados;    
    float lado;
    float area;
    float apotema;
    float alfa; 
    String resultado;

    public poligonos(int numLados, float lado){
        this.numLados = numLados;
        this.lado = lado;
    }

    public String calcularArea(){
        
        DecimalFormat df = new DecimalFormat("#.00");

        if(this.numLados == 3){
            this.area = (float) (Math.pow(this.lado , 2) * (Math.sqrt(3) / 4));
        }else{
            this.alfa = 360 / this.numLados;
            this.apotema = (float) ((this.lado / 2) / Math.tan(this.alfa / 2));
            this.area = (this.numLados * this.lado * this.apotema) / 2;
        }
        
        this.resultado = "El area es: " + df.format(this.area);
        
        return this.resultado;
    }
    
        
    }


    

