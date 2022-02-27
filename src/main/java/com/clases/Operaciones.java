package com.clases;

public class Operaciones {
    private int num1;
    private int num2;
    private double result;
    public int op;

    public Operaciones(){
        
    }

    private void suma(int n, int n2){
        this.result = n+n2;
    }

    private void resta(int n, int n2){
        this.result = n-n2;
    }

    private void multiplicacion(int n, int n2){
        this.result = n*n2;
    }

    private void division(int n, int n2){
        this.result = n/n2;
    }

    private void potencia(int n, int n2){
        this.result = Math.pow(n, n2);
    }

    private void raiz(int n, int n2){
        this.result = Math.pow(n,(1.0/n2));
    }

    private void logaritmo(int n, int n2){
        this.result = (Math.log10(n) / Math.log10(n2));
    }

    public double getResult(int n, int n2, int op){

        this.num1 = n;
        this.num2 = n2;
        this.op = op;

        switch(this.op){
            
            case 1:
                suma(this.num1,this.num2);
                break;
            case 2:
                resta(this.num1,this.num2);
                break;
            case 3:
                multiplicacion(this.num1,this.num2);
                break;
            case 4:
                division(this.num1,this.num2);
                break;
            case 5:
                potencia(this.num1,this.num2);
                break;
            case 6:
                raiz(this.num1,this.num2);
                break;
            case 7:
                logaritmo(this.num1,this.num2);
                break;

        }
        return this.result;
    }

}
