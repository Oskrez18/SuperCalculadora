package com.clases;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class FooJesusJurado {
    
    private int num1;
    private int num2;
    private double result;
    public int op;

    public FooJesusJurado() {

    }

    public double logaritmo(int n, int n2){
        this.result = (Math.log10(n) / Math.log10(n2));
        return this.result;
    }


}
