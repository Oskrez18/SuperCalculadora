package com.clases;

public class Poligonos {
    
    int numLados;    
    float lado;
    float area;
    float apotema;
    float alfa; 
    double resultado;

    public Poligonos(int numLados, float lado){
        this.numLados = numLados;
        this.lado = lado;
    }

    public double calcularArea(){
        
        if(this.numLados == 3){
            this.area = (float) (Math.pow(this.lado , 2) * (Math.sqrt(3) / 4));
        }else{
            this.alfa = 360 / this.numLados;
            this.apotema = (float) ((this.lado / 2) / Math.tan(this.alfa / 2));
            this.area = (this.numLados * this.lado * this.apotema) / 2;
        }
        
        this.resultado = this.area;
        
        return this.resultado;
    }
    
        
    }


    

