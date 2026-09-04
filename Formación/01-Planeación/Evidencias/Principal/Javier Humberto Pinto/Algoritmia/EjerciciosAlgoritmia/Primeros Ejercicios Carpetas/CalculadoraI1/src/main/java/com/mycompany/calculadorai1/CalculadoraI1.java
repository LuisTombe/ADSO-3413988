/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorai1;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class CalculadoraI1 {

    public static int a,b,r,bandera=0;
    public static char op;
    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[] args) {
        
        do{
            
            datos();
            ciclo();
                
        }
            
        while (bandera==0);
        
    }
    public static void datos(){
        
        System.out.println("Escriba el valor de A");
        a=teclado.nextInt();
        System.out.println("Ahora ingrese su operador (+,-,*,/)");
        System.out.println("(+)Suma");
        System.out.println("(-)Resta");
        System.out.println("(*)Multiplicación");
        System.out.println("(/)División");
        System.out.println("(5)Salir");
        op=teclado.next().charAt(0);
        System.out.println("Escriba el valor de B");
        b=teclado.nextInt();
    
    }
    public static void ciclo(){
        
        switch(op){
            
            case ('+'):{
                datos ();
                r=a+b;
                System.out.println("El resultado de su operación es "+r);
            }
            break;
            
            
            case ('-'):{
                datos();
                r=a-b;
                System.out.println("El resultado de su operación es "+r);
            }
            break;
            
            case ('*'):{
                datos();
                r=a*b;
                System.out.println("El resultado de su operación es "+r);
            }
            break;
            
            case ('/'):{
                datos();
                r=a/b;
                System.out.println("El resultado de su operación es "+r);
            }
            break;
            
            case(5):{
                bandera=1;
            }
            break;
            default:
                System.out.println("opción no valida");
                System.out.println("Error");
        }
    }
}

