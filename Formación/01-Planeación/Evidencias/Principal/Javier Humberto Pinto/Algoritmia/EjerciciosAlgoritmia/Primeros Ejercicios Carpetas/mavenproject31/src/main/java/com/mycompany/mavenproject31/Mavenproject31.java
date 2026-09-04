/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject31;


/**
 *
 * @author ~ Shino ~
 */
public class Mavenproject31 {

    public static void main(String[] args) {
        int A,B,C;
        
        
        A=0;
        B=1;
        C=A+B;
        System.out.println(A);      
        System.out.println(B);
        
        while (C<100000){
            System.out.println(C);
        A=B;
        B=C;
        C=A+B;
        }
    }
}
        
