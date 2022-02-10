package com.supercalculadora.clases;

import java.util.ArrayList;

public class Ruffini {

    private ArrayList<Integer> grados = new ArrayList<Integer>();
    private ArrayList<Integer> posibles = new ArrayList<Integer>();
    private ArrayList<Integer> resultados = new ArrayList<Integer>();;

    public Ruffini(ArrayList<Integer> g){
        this.grados = g;
        posiblesRaices();
        //resolver();
    }

    private void posiblesRaices(){
        int term = this.grados.get(this.grados.size()-1);
        for(int i = 2; i < term; i++){
            if(term%i == 0){
                posibles.add(i);
                posibles.add(-i);
            }
        }

        posibles.add(1);
        posibles.add(-1);
        posibles.add(term);
        posibles.add(-term);

        posibles.forEach(System.out::println);
    }

    // private void resolver(){
        

    //     for(int j = 0; j<posibles.length;){

    //         for(int i = 1; i<this.grados.length-j; i++){
    //             this.grados[i] = this.grados[i-1] * j + this.grados[i];
    //         }

    //         if(this.grados[this.grados.length-1-j] == 0){
                
    //             j++;

    //         }

    //     }

    // }

    public ArrayList<Integer> getResultados(){
        return this.resultados;
    }
}
