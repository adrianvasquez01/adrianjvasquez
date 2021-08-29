/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float num1, num2, num3,sum, pro, mul, coc, mod;
        System.out.println("digite el primer valor:");
        num1 = entrada.nextFloat();
        System.out.println("digite el segundo valor:");
        num2 = entrada.nextFloat();
        System.out.println("digite el tercer valor:");  
        num3 = entrada.nextFloat();
        sum= num1+num2+num3;
        pro = sum/3;
        mul = num1*num2*num3;
        coc= num1/num2/num3;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("la suma es: "+ df.format(sum));
        System.out.println("la suma es: "+ df.format(pro));
        System.out.println("la suma es: "+ df.format(mul));
        System.out.println("la suma es: "+ df.format(coc));
        
        
        
        
    }
    
}
