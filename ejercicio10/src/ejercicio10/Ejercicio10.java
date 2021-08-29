/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         float lb,gr,tnl,peso, kg;;
         System.out.println("ingrese su peso en kg: ");
         kg = entrada.nextFloat();
         lb =  (float) (kg*2.205);
         gr =  (kg*1000);
         tnl =  (kg/1000);
         System.out.println("la conversion en libras: "+lb);
         System.out.println("la conversion en gramos es:"+gr);
         System.out.println("la conversion en toneladas es:"+tnl);
    }
    
}
