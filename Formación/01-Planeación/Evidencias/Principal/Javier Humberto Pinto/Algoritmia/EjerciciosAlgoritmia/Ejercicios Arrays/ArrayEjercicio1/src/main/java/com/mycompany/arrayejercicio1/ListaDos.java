/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayejercicio1;
import static com.mycompany.arrayejercicio1.VariablesStatics.mayor;
import static com.mycompany.arrayejercicio1.VariablesStatics.menor;
import static com.mycompany.arrayejercicio1.VariablesStatics.Suma;
import static com.mycompany.arrayejercicio1.VariablesStatics.Promedio;
import static com.mycompany.arrayejercicio1.VariablesStatics.teclado;

/**
 *
 * @author ~ Shino ~
 */
public class ListaDos {
    public static void listados (){
        
        int [] ListaSuma=new int[8];
        System.out.println("/---------------------------------------/");
        System.out.println("Manejo del arreglo dos de 8 numeros");
        System.out.println("/---------------------------------------/");
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite el valor "+(i+1));
            ListaSuma[i]=teclado.nextInt();
        }
        
        for (int i = 0; i < 8; i++) {
            
            System.out.println("/////////////////////////////////////");
            System.out.println("El valor de "+(i+1)+" es "+ListaSuma[i]);
            
        }
        mayor = ListaSuma[0];
        menor = ListaSuma[0];
        
        for (int i = 0; i< ListaSuma.length; i++) {
            Suma += ListaSuma[i];
            Promedio=Suma/8;
            
            if (ListaSuma[i]>mayor) {
                mayor=ListaSuma[i];
            }
            else 
                if (ListaSuma[i]<menor){
                menor=ListaSuma[i];
                }    
        }

    }
    
}
