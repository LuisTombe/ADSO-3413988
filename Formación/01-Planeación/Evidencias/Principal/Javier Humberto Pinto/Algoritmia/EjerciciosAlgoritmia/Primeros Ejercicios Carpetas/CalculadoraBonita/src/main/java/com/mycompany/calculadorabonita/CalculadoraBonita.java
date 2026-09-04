/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorabonita;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class CalculadoraBonita {
    public static int a,b,op,ri,bandera=0;
    public static double ar,rr;
    public static Scanner teclado=new Scanner (System.in);
    public static void main(String[] args) {
        
        
        do {
            
            Menu.menu();
            
            Ciclo.ciclo();
 
            
        }
        while (bandera==0);
    }
}
