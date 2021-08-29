/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int u,d,c,n;
        System.out.println("escriba un numero entre 0 y 1000:");
        n = entrada.nextInt();
     
        u=n%10;
        n=n/10;
        d=n%10;
        c=n/10;
        System.out.println("unidades es igual a:" +u);
        System.out.println("decenas es igual a:" +d);
        System.out.println("centenas es igual a:" +c);
                
    }
    
}
