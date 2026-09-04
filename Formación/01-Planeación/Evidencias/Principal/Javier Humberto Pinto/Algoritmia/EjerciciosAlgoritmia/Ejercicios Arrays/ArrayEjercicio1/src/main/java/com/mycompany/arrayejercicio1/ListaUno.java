/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayejercicio1;
import static com.mycompany.arrayejercicio1.VariablesStatics.Arreglo1;
import static com.mycompany.arrayejercicio1.VariablesStatics.teclado;




/**
 *
 * @author ~ Shino ~
 */
public class ListaUno {
    public static void listauno(){
        System.out.println("/---------------------------------------/");
        System.out.println("Manejo del arreglo");
        System.out.println("/---------------------------------------/");


        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el valor "+(i+1));
            Arreglo1[i]=teclado.nextInt();
            
        }
        
        for (int i = 0; i < Arreglo1.length; i++) {
            System.out.println("/////////////////////////////////////");
            System.out.println("El valor de "+(i+1)+" es "+Arreglo1[i]);
            
        
        }
    }
}
