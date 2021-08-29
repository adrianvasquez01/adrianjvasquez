/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author juesus
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso, altura,BMI;
        System.out.println("ingrese su peso en kg: ");
        peso = entrada.nextFloat();
        System.out.println("ingrese su estatura en m: ");
        altura = entrada.nextFloat();
        BMI = peso/(altura*altura);
        System.out.println("tu BMI es: "+BMI);
    }
    
}
