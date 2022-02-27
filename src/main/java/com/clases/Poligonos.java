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
        
        if(this.numLados < 3 || this.lado <= 0){
            this.resultado = Double.parseDouble("NaN");
       }else{   
            if(this.numLados == 3){
                this.area = (float) (Math.pow(this.lado , 2) * (Math.sqrt(3) / 4));
            }else if(this.numLados > 3){
                this.alfa = (float) ((360 / this.numLados) / 2.0);
                this.apotema = (float) ((this.lado) / (2 * Math.tan(Math.toRadians(this.alfa))));
                this.area = (this.numLados * this.lado * this.apotema) / 2;
            }
            this.resultado = Math.round(this.area * 100.0)/100.0;
       }    
        
        return this.resultado; 
    }
    
        
    }


    

