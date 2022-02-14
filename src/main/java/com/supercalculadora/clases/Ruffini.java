package com.supercalculadora.clases;

import java.util.ArrayList;

public class Ruffini {

    private ArrayList<Integer> grados = new ArrayList<Integer>();
    private ArrayList<Integer> posibles = new ArrayList<Integer>();
    private ArrayList<Integer> resultados = new ArrayList<Integer>();
    private ArrayList<Integer> prueba = new ArrayList<Integer>();

    public Ruffini(ArrayList<Integer> g){
        this.grados = g;
        posiblesRaices();
        resolver();

    }

    private void posiblesRaices(){
        int term = this.grados.get(this.grados.size()-1);
        for(int i = 1; i <= Math.abs(term); i++){
            if(term%i == 0 || term%(-i)==0){
                posibles.add(i);
                posibles.add(-i);
            }
        }


    }

    private void resolver(){

        int num;

        for(int k = 0; k<this.grados.size(); k++){
            this.prueba.add(this.grados.get(k)); 
            System.out.println(this.prueba.get(k) + " " + k);
        }

        for(int j = 0; j<this.posibles.size(); j++){

            

            for(int i = 1; i<this.prueba.size(); i++){
                System.out.println(this.prueba.get(i-1) + " * " + this.posibles.get(j) + " + " + this.prueba.get(i));
                num = (this.prueba.get(i-1) * this.posibles.get(j)) + this.prueba.get(i); 
                System.out.println(num);
                prueba.set(i, num);
            }


            if(this.prueba.get(this.prueba.size()-1) == 0){
                System.out.println("k");

                for(int x = 0; x<this.grados.size(); x++){
                    this.grados.set(x,this.prueba.get(x));
                }

                this.grados.remove(this.grados.size()-1);
                this.resultados.add(this.posibles.get(j));
            }else{
                
                for(int k = 0; k<this.grados.size(); k++){
                    this.prueba.add(this.grados.get(k)); 
                    System.out.println(this.prueba.get(k) + " " + k);
                }
            }
   
        }

    }

    public ArrayList<Integer> getResultados(){
        return this.resultados;
    }

}