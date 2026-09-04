/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class CUIL9 {

    public static void main(String[] args) {
        int AN,AA,E;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor ingrese su año de nacimiento");
        AN=teclado.nextInt();
        System.out.println("Porfavor ingrese su año de actual");
        AA=teclado.nextInt();
        
        E=AA-AN;
        
        if (E>17){
            System.out.println("Debe solicitar su CUIL porque es mayor de edad");}
        else{
                    System.out.println("No debe solicitar su CUIL aun porque usted es menor de edad ");}
    }}