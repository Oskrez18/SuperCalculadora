package com.clases;

public class FooDanielCerezuelaDominguez {
    
    private int numero;
    private int resultado = 1;

    public FooDanielCerezuelaDominguez(){
    }

    public long resultado(int n){

        this.numero = n;

        for(int i = this.numero; i>=1; i--){
            this.resultado *= i; 
        }

        return this.resultado;
    }
}