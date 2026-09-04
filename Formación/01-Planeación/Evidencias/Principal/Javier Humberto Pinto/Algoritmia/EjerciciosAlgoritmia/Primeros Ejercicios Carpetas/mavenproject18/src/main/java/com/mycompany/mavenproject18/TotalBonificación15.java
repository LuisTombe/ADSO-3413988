/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject18;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class TotalBonificación15 {

    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
        
        int MV,B,TB;
        System.out.println("Ingresar el monto de venta alcanzado");
        MV=teclado.nextInt();
        B=0;
          
        if (MV>=0&&MV<1000){
        B=0; 
        
        }else if(MV>=1000&&MV<5000){
        B=3;
        
        }else if(MV>=5000&&MV<20000){
        B=5;
        
        }else if(MV>=20000){
        B=8;
        }
        TB=(MV*B)/100;  
        
        System.out.println("El total de bonificación o TB se define como (MV*B)/100. Donde MV es el Monto de Ventas y B la Bonificación que recibe dependiendo de el Monto de Ventas");
        System.out.println("Por lo tanto el Total de Bonificación que recibirá será de "+TB);
    }}

    
        
  