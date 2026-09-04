/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class CDs7 {

    public static void main(String[] args) {
        
        int GB,MB,CD;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor digite los GB");
        GB=teclado.nextInt();
        
        
        MB= GB*1024;
        CD= ((MB/700)+1);
        
        System.out.println("La cantidad de CDs que se deben usar es igual a "+CD);

    }
}
