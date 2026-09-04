/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ~ Shino ~
 */
public class CarritoCompras {

    private PagoStrategy estrategiaPago;

    public void setEstrategiaPago(PagoStrategy estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void realizarPago(double monto) {

        if (estrategiaPago == null) {
            System.out.println("No se ha seleccionado un método de pago.");
            return;
        }

        estrategiaPago.pagar(monto);
    }

}
