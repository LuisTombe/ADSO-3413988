/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class PlanillaEmpleado5 {

    public static void main(String[] args) {
        
        int HL,TH,P;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor digite el numero de horas laborales en el mes ");
        HL=teclado.nextInt();
        System.out.println("Porfavor digite la tarifa por hora");
        TH=teclado.nextInt();
        
        P= HL*TH;
        
        System.out.println("Planilla es igual a "+P);

    }
}
