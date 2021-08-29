/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int num1, num2, sum,res, mul;
        System.out.println("digite el primer numero : " );
        num1 = entrada.nextInt();
         System.out.println("digite el segundo numero : " );
         num2 = entrada.nextInt(); 
        sum = num1+num2;
        res = num1-num2;
        mul = num1*num2;
        System.out.println("\n la suma es:"+sum);
        System.out.println("\n la diferencia es:"+res);
        System.out.println("\n el producto es:"+mul);
        
  
    }
    
}
