/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject36;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class ExtraCalculadoraChar {
    
    public static double a,b,r,bandera=0;
    public static char op=('+'&'-'&'*'&'/');
    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[] args) {
    
    
        do {
            
            menu();
            ciclo();
        }
        
        while(bandera==0);
        
            }       
    
            public  static void menu(){
                
            System.out.println("Porfavor digite el valor de A");
            a=teclado.nextDouble();
            System.out.println("Porfavor digite la operación a realizar");
            System.out.println("(+)Suma");
            System.out.println("(-)Resta");
            System.out.println("(*)Multiplicación");
            System.out.println("(/)División");
            System.out.println("(5)Salir");
            op=teclado.next().charAt(0);
            System.out.println("Porfavor digite el valor de B");
            b=teclado.nextDouble();
            }
            
            public static void ciclo (){
            
            
            switch (op){
            
                case ('+'):{
                    menu();
                    r=a+b;
                    System.out.println("La suma de a "+a+" y b "+b+" es igual a "+r);
                }
                    break;
                
               
                
                case ('-'):{
                    menu();
                    r=a-b;
                    System.out.println("La resta de a "+a+" y b "+b+" es igual a "+r);  
                }
                    break;
                
                
                case ('*'):{
                    menu();
                    r=a*b;
                    System.out.println("La multiplicación de a "+a+" y b "+b+" es igual a "+r);
                }
                    break;
                
                
                case ('/'):{
                    menu();
                    r=a/b;
                    System.out.println("La división de a "+a+" y b "+b+" es igual a "+r);
                }
                    break;
                
                
                case (5):{
                
                bandera=1;
                }
                    break;
                    default:
                    System.out.println("Opción no valida");
                }
            }      
}


            