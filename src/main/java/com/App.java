package com;

import java.util.ArrayList;
import java.util.Scanner;

import com.clases.Ecuacion1;
import com.clases.Ecuacion2;
import com.clases.Pitagoras;
import com.clases.Poligonos;
import com.clases.Operaciones;
import com.clases.Ruffini;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void menu(){
        System.out.println("----------Menú-----------");
        System.out.println("1 Operaciones aritmeticas");
        System.out.println("2 Areas polígonos regulares");
        System.out.println("3 Teoremas de pitagoras");
        System.out.println("4 Ecuaciones 1º grado");
        System.out.println("5 Ecuaciones 2º grado");
        System.out.println("6 Ruffini");
        System.out.println("7 Salir");

    }
    public static void main( String[] args ){

        try (Scanner s = new Scanner(System.in)) {
            int opcion = 0;
            int opcion1 = 0;
            double resultado = 0;
            double[] resulta = new double[2];
            Operaciones operacion;
            Poligonos poligonos;
            Pitagoras pitagoras;
            Ecuacion1 ecuacion1;
            Ecuacion2 ecuacion2;
            Ruffini ruffini;
            ArrayList<Integer> resultados = new ArrayList<Integer>();
            
            do{
                menu();
                opcion = s.nextInt();
                while(opcion<1 || opcion>7){
                    System.out.println("Esa opcion no es válida, escribe otra");
                    opcion = s.nextInt();
                }

                switch(opcion){

                    case 1:
                        System.out.println("1 Suma");
                        System.out.println("2 Resta");
                        System.out.println("3 multiplicacion");
                        System.out.println("4 division");
                        System.out.println("5 Potencia");
                        System.out.println("6 Raíz");
                        System.out.println("7 Logaritmo");
                        opcion1 = s.nextInt();

                        while(opcion1<1 || opcion>7){
                            System.out.println("Esa opcion no es válida, escribe otra");
                            opcion1 = s.nextInt();
                        }

                        System.out.println("Introduce el primer numero");
                        int num1 = s.nextInt();
                        System.out.println("Introduce el segundo numero");
                        int num2 = s.nextInt();

                        operacion = new Operaciones(num1,num2,opcion1);

                        resultado = operacion.getResult();
                        break;

                    case 2:

                        System.out.println("Introduce el numero de lados");
                        int lados = s.nextInt();
                        System.out.println("Introduce la longitud del lado");
                        float longitud = s.nextFloat();
                        poligonos = new Poligonos(lados, longitud);
                        resultado = poligonos.calcularArea();
                        break;

                    case 3:
                     
                        System.out.println("¿Cual es el lado que falta?");
                        System.out.println("1. cateto");
                        System.out.println("2. hipotenusa");
                        opcion1 = s.nextInt();
                        switch(opcion1){
                            case 1:
                                System.out.println("Introduce la hipotenusa y el cateto");
                                break;
                            case 2:
                                System.out.println("Introduce los catetos");
                                break;
                        }

                        int lado1 = s.nextInt();
                        int lado2 = s.nextInt();

                        pitagoras = new Pitagoras(lado1, lado2, opcion1);

                        resultado = pitagoras.calcularPitagoras();

                        break;

                    case 4:
                        System.out.println("Introduce el coeficiente de x");
                        int x = s.nextInt();
                         while(x==0){
                               System.out.println("El coeficiente de x no puede ser 0");
                           }
                        System.out.println("Introduce el termino independiente");
                        int inde = s.nextInt();

                        ecuacion1 = new Ecuacion1();

                        resultado = ecuacion1.calcular(x,inde);

                        break;

                    case 5:
                        System.out.println("Introduce el coeficiente de x2");
                        int x2 = s.nextInt();
                        System.out.println("Introduce el coeficiente de x");
                        int x1 = s.nextInt();
                        System.out.println("Introduce el termino independiente");
                        int termino = s.nextInt();

                        ecuacion2 = new Ecuacion2();

                        resulta = ecuacion2.calcular(x2, x1, termino);
                        
                        System.out.println("Los resultados son:");
                        for(int i = 0; i<2; i++){
                            System.out.println(i+1 + "º: " + resulta[i]);
                        }

                        break;
                    case 6:
                        System.out.println("Introduce el grado de la ecuacion");
                        int tamano = s.nextInt();
                        ArrayList<Integer> grados = new ArrayList<Integer>();
                        System.out.println("Introduce los coeficientes y el termino independiente en orden");

                        for(int i = 0; i<tamano+1; i++){
                            grados.add(s.nextInt());
                        }

                        ruffini = new Ruffini(grados);
                        
                        resultados = ruffini.getResultados();
                        
                        System.out.println("Los resultados son:");
                        for(int i = 0; i<resultados.size(); i++){
                            System.out.println(i+1 + "º: " + resultados.get(i));
                        }   
                        break;

                }

                if(opcion<5){
                    System.out.println(resultado);
                }

            }while(opcion!=7);
        }
        
    }

}
