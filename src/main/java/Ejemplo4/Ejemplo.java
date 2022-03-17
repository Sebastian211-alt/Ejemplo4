/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo4;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class Ejemplo {

    public static void main(String[] args) {

        int a, b;

        Scanner leer = new Scanner(System.in);

        System.out.print("a: ");
        a = leer.nextInt();

        System.out.print("b: ");
        b = leer.nextInt();

        if (a != 0 && b != 0) {

            if ((a > 0 && b < 0 || (a < 0 && b > 0))) {
                System.out.println("SIGNOS OPUESTOS");
            } else {
                System.out.println("SIGNOS IGUALES");
            }
        } else {
            System.out.println("ESTO NO TIENE RESPUESTA");
        }

    }

}
