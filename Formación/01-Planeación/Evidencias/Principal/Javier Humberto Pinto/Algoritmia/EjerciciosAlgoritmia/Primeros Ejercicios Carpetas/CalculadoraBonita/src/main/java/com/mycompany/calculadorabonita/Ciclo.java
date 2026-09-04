/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabonita;

import static com.mycompany.calculadorabonita.CalculadoraBonita.bandera;

import static com.mycompany.calculadorabonita.CalculadoraBonita.op;
import static com.mycompany.calculadorabonita.Datos.datos;


/**
 *
 * @author ~ Shino ~
 */
public class Ciclo {
    
    public static void ciclo(){
        
        switch(op){
            
            case 1:{
                datos();
                Suma.suma();
            }
            break;
                
            case 2:{
                datos();
                Resta.resta();
            }
            break;
            
            case 3:{
                datos();
                Multiplicación.multiplicación();
            }
            break;
            
            case 4:{
                datos();
                División.división();
            }
            break;
            
            case 5:{
                datos();
                Potenciación.potenciación();
            }
            break;
            
            case 6:{
                DatosRaiz.datosraiz();
                RaizCuadrada.raizcuadrada();
            }
            break;
            
            case 7:{
                
                
            }
            
            case 9:{
            
                bandera=1;
                System.out.println("Gracias por usar la calculadora pro max 3000");
            }
            break;
            
            default:
                System.out.println("Valor incorrecto");
                System.out.println("Error XDDDDDDDDD");
        }
    }
}

