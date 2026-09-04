/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject16;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class NumeroMayor12 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        
        int N1,N2,N3,NM;
        System.out.println("Porfavor ingresa el primer numero");
        N1=teclado.nextInt();
        System.out.println("Porfavor ingresa el segundo numero");
        N2=teclado.nextInt();
        System.out.println("Porfavor ingresa el tercer numero");
        N3=teclado.nextInt();
        
if (N1>N2&&N1>N3){
    NM=N1;

}else
if (N2>N3){
    NM=N2;

}else
    NM=N3;

   System.out.println("El numero mayor es "+NM);
}
    }




            



    
            
            


    


    
    

    

    
    
    
    
        
        

        
        
