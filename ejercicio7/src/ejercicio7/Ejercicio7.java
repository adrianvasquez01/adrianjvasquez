/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float venta, costo,u, utilidad;
        System.out.println("ingrese el precio de costo del producto: ");
        costo = entrada.nextFloat();
        System.out.println("ingrese el precio de venta del producto");
        venta = entrada.nextFloat();
        u = venta-costo; 
        utilidad = u/(venta*100);
        System.out.println("la utilidad es de " +utilidad+ " porciento");
    }
    
}
