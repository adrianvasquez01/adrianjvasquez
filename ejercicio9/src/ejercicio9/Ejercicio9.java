/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float di, km, ga,kl, es, pe,co,coe, cosfi;
        System.out.println("cuantos dias duro el viaje: ");
        di = entrada.nextFloat();
        System.out.println("km recorridos: ");
        km = entrada.nextFloat();
        System.out.println("cuanto cuesta el litro de gasolina:");
        ga = entrada.nextFloat();
        System.out.println("cuantos km recorres con un litro de gasolina: ");
        kl = entrada.nextFloat();
        System.out.println("costo diario del estacionamiento: ");
        es = entrada.nextFloat();
        System.out.println("cuanto pagaste en peajes:");
        pe = entrada.nextFloat();
        co = ga*km;
        coe = es*di;
        cosfi = pe+co+coe;
        System.out.println("el viaje costó: "+cosfi);
    }
    
}
