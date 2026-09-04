/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Inferfaz {
    
    public static void Inferfaz(){
        
        Scanner teclado = new Scanner (System.in);
        CarritoCompras carrito = new CarritoCompras();
        
        while (true){
            
            int op=0;
            double pago=0;
            System.out.println("-----------------------------");
            System.out.println("Seleccione el metodo de pago.");
            System.out.println("1. Tarjeta.");
            System.out.println("2. Paypal.");
            System.out.println("3. Transferencia.");
            System.out.println("4. Apagar.");
            System.out.println("-----------------------------");
            op=teclado.nextInt();
            System.out.println("-----------------------------");
            
            switch(op){
                
                case 1:
                    
                    carrito.setEstrategiaPago((PagoStrategy) new PagoTarjeta());
                    System.out.println("Ingrese el monto: ");
                    pago=teclado.nextDouble();
                    carrito.realizarPago(pago);
                    break;
                
                case 2:
                    
                    carrito.setEstrategiaPago(new PagoPaypal());
                    System.out.println("Ingrese el monto: ");
                    pago=teclado.nextDouble();
                    carrito.realizarPago(pago);
                    break;
                    
                case 3:
                    
                    carrito.setEstrategiaPago(new PagoTransferencia());
                    System.out.println("Ingrese el monto: ");
                    pago=teclado.nextDouble();
                    carrito.realizarPago(pago);
                    break;
                    
                case 4:
                    
                    System.out.println("Sistema apagado..");
                    return;
                    
            }
        }
    }
}
