/*
 Escriba un programa que lea dos números enteros como entrada y escriba el mensaje
 signos opuestos si y solo si uno de los enteros es positivo y el otro negativo
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
