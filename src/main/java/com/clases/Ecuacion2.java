package com.clases;

public class Ecuacion2 {

    private int num01;
    private int num02;


    public int getNum01() {
        return num01;
    }

    public void setNum01(int num01) {
        this.num01 = num01;
    }

    public int getNum02() {
        return num02;
    }

    public void setNum02(int num02) {
        this.num02 = num02;
    }

    public double[] calcular(int num01, int num02, int num03) {
        double[] result = new double[2];

        if (Math.sqrt(Math.pow(num02, 2)) > 0) {
            result[0] = ((-num02) + Math.sqrt(Math.pow(num02, 2) - (4*num01*num03))) / (2 * num01);
            result[1] = ((-num02) - Math.sqrt(Math.pow(num02, 2) - (4*num01*num03))) / (2 * num01);
        } else if (num02 == 0 && num03 == 0) {
            result[0] = 0;
            result[1] = 1;
        }  else if (num03 == 0) {
            result[0] = 0;
            result[1] = -num02/num01;
        } else if (num02 == 0) {
            result[0] = (Math.sqrt(-num03 / num01));
            result[0] = -(Math.sqrt(-num03 / num01));
        }
        
        return result;
    }
}
