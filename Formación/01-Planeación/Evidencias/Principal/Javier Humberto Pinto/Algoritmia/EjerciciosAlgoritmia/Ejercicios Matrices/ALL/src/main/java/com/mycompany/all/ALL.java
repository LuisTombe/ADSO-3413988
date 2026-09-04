/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.all;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class ALL {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        String[]Titulo = new String [1];
        Titulo[0]="SISTEMA DE INVENTARIO";
        int f=0,c=0;
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("INGRESE EL NUMERO DE FILAS Y COLUMNAS");
        System.out.println("Filas:");
        f=teclado.nextInt();
        System.out.println("Columnas:");
        c=teclado.nextInt();
        
        String [][] Matriz = new String [f][c];
        Matriz[0][0]="Productos";
        
        for (int j = 1; j < Matriz[1].length; j++) {
            for (int i = 0; i < Matriz.length; i++) {
                
                if (i==0) {                                
                    
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("Ingrese la categoria");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    Matriz[i][j]=teclado.next();
                }
            }
        }
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j==0) {
                    
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("Ingrese el nombre de su producto "+(i));
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                        Matriz[i][j]=teclado.next();
                    
                } 
            }
        }
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=String.valueOf(random.nextInt(10));
            }
        }
        //Solo esta parte la busque con IA
        final int ANCHO = 20;
        
        int mitadTabla = (Matriz[0].length * ANCHO) / 2;
        int mitadTitulo = Titulo[0].length() / 2;
        int ajuste = 8;

        for (int i = 0; i < mitadTabla - mitadTitulo - ajuste; i++) {
            
            System.out.print(" ");
        }
        
        System.out.println(Titulo[0]);
        System.out.println();
        
        //Hasta aca
        for (String[] Matriz1 : Matriz) {
            for (String Matriz11 : Matriz1) {
                System.out.printf("%-20s", Matriz11 + "");
            }
            System.out.println();
        }
        
        int fila2=0,columna2=0;
        while (true){
            int op=0;
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("Menu...");
            System.out.println("Seleccione una opcion para realizar la accion que requiere.");
            System.out.println("(1). Registrar Entradas de Mercancia");
            System.out.println("(2). Registrar Salidas de Mercancia");
            System.out.println("(3). Generar Reporte Final con estadisticas generales del inventario");
            System.out.println("(4). Salir/Apagar (Sistema)");
            System.out.println("(5). Mostrar Matriz");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            op=teclado.nextInt();
            
            switch (op){
                
                case (1):
                    
                    System.out.println("Fila del producto:");
                    fila2 = teclado.nextInt();
                    
                    System.out.println("Columna de la categoria:");
                    columna2 = teclado.nextInt();
                    
                    if (fila2 <= 0 || fila2 >= f || columna2 <= 0 || columna2 >= c) {
                        System.out.println("Posicion invalida.");
                        break;
                    }
                    
                    System.out.println("Cantidad que ingresa:");
                    int entrada = teclado.nextInt();
                    int inventario = Integer.parseInt(Matriz[fila2][columna2]);
                    inventario += entrada;
                    
                    Matriz[fila2][columna2] = String.valueOf(inventario);
                    System.out.println("Entrada registrada correctamente.");
                    
                    System.out.println("Inventario actualizado");
                    
                for (String[] Matriz1 : Matriz) {
                for (String Matriz11 : Matriz1) {
                    System.out.printf("%-20s", Matriz11);
                }
                    System.out.println();
                }

                    break;
                    
                case (2):
                    
                    System.out.println("Fila del producto:");
                    fila2 = teclado.nextInt();
                    
                    System.out.println("Columna de la categoria:");
                    columna2 = teclado.nextInt();
                    
                    if (fila2 <= 0 || fila2 >= f || columna2 <= 0 || columna2 >= c) {
                        System.out.println("Posicion invalida.");
                        break;
                       
                    }
                    
                    System.out.println("Cantidad que va a salir:");
                    int salida = teclado.nextInt();
                    
                    int inventario2 = Integer.parseInt(Matriz[fila2][columna2]);
                    
                    if (salida > inventario2) {
                        
                        System.out.println("ERROR: No hay suficiente inventario.");
                        break;
                    }
                    
                    inventario2 -= salida;
                    Matriz[fila2][columna2] = String.valueOf(inventario2);
                    System.out.println("Salida registrada correctamente.");
                for (String[] Matriz1 : Matriz) {
                for (String Matriz11 : Matriz1) {
                    System.out.printf("%-20s", Matriz11);
                }
                    System.out.println();
                }
                    
                    System.out.println("Nuevo inventario de ese producto: " + Matriz[fila2][columna2]);
                    break;
                    
                case (3):
                    
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("ESTADISTICA DE PRODUCTOS POR CATEGORIAS");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("Total y Promedio de productos en sus categorias");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    
                    double categoriaMayorInv=0,categoriaMenorInv=Double.MAX_VALUE;
                    String CMI="",Cmi="";
                    double totalpc1=0;
                    for (int j = 1; j < Matriz[0].length; j++) {
                        double sumapc1=0;
                        double promediopc1=0;
                        for (int i = 1; i < Matriz.length; i++) {
                            
                            sumapc1 += Double.parseDouble(Matriz[i][j]);
                            promediopc1 = sumapc1/(f-1);
                            totalpc1 += Double.parseDouble(Matriz[i][j]);
                        
                        }
                        if (sumapc1>categoriaMayorInv) {
                            categoriaMayorInv=sumapc1;
                            CMI=Matriz[0][j];
                        
                        }
                        if (sumapc1<categoriaMenorInv) {
                            categoriaMenorInv=sumapc1;
                            Cmi=Matriz[0][j];
                        
                        }
                        System.out.println("El total de productos en categoria : "+Matriz[0][j]+" es: "+sumapc1);
                        System.out.println("El promedio de productos para categoria : "+Matriz[0][j]+" es: "+promediopc1);
                    }
                    
                    double productoMayorCA=0;
                    String PMCA="";
                    for (int i = 1; i < Matriz.length; i++) {
                        double sumap1=0;
                        for (int j = 1; j < Matriz[i].length; j++) {
                            sumap1 += Double.parseDouble(Matriz[i][j]);
                        
                        }
                        if (sumap1>productoMayorCA) {
                            productoMayorCA=sumap1;
                            PMCA=Matriz[i][0];
                        
                        }
                    }
                    
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("Productos con Stock menor a 10");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    
                    int fila = 0, columna = 0, ProductoMayorExt = 0;
                    for (int i = 1; i < Matriz.length; i++) {
                        for (int j = 1; j < Matriz[i].length; j++) {
                            
                            if (Integer.parseInt(Matriz[i][j]) > ProductoMayorExt) {
                                ProductoMayorExt = Integer.parseInt(Matriz[i][j]);
                                fila = i;
                                columna = j;
                            
                            }
                            if (Integer.parseInt(Matriz[i][j]) < 10) {
                                
                                System.out.println("Producto: " + Matriz[i][0]+ " | Categoria: " + Matriz[0][j]+ " | Stock: " + Matriz[i][j]+ " | Posicion -> Fila: " + i+ " Columna: " + j);
                            
                            }
                        }
                    }
                    
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("OTRA INFO...");
                    System.out.println("--------------------------------------------------------------------------------------------------------");
                    System.out.println("El total general del inventario es : "+totalpc1);
                    System.out.println("La categoria con mayor inventario es : "+CMI);
                    System.out.println("La categoria con menor inventario es : "+Cmi);
                    System.out.println("El producto con mayor cantidad almacenada es : "+PMCA);
                    System.out.println("El producto con mayor existencia es : "+Matriz[fila][0]+" cantidad : "+ProductoMayorExt+" posicion --> [fila] : "+fila+" [columna] : "+columna);
                    
                    break;
                    
                case (4):
                    System.out.println("Apagando sistema...");
                    return;
                
                case (5):
                    
                for (String[] Matriz1 : Matriz) {
                for (String Matriz11 : Matriz1) {
                    System.out.printf("%-20s", Matriz11);
                }
                    System.out.println();
                }
                    break;

            }
        }
    }
}
