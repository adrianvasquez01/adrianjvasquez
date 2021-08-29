/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      float r, r2,lon,pi,are;
        System.out.println("digite el radio: ");
        r = entrada.nextFloat();
        pi=(float) Math.PI;
        r2 = r*r;
        lon = 2*pi*r;
        are= pi*r2;
        DecimalFormat df = new DecimalFormat("#.00");
         System.out.println("la longitud es: "+ df.format(lon));
         System.out.println("el area  es: "+ df.format(are));
    }
    
}
