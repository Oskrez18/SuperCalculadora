package com.clases;

public class Pitagoras {
    
    private float a;
    private float b;
    private int opcion;
    private double resultado;

    public Pitagoras(float a, float b, int opcion){
        this.a = a;
        this.b = b;
        this.opcion = opcion;
    }


    public double calcularPitagoras(){
        
        switch(opcion){
            case 1:
                this.resultado = (float) Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
                break;
            case 2:
                this.resultado = (float) Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
                break;
        }
    
        return this.resultado;

    }

   
}
