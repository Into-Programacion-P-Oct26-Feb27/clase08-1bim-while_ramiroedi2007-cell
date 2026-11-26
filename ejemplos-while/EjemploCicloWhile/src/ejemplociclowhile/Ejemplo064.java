/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo064 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String pais;
        String capital;
        String reporte = "";
        int i = 0;

        boolean bandera = true;

        while (bandera == true) { //true = true // false
            System.out.println("Ingrese un Pais");
            pais = entrada.nextLine();
            System.out.println("Ingrese su capital");
            capital = entrada.nextLine();

            reporte = String.format("%s%s\t%s\n", reporte, pais, capital);
            i = i+1;

            String salir;
            System.out.println("Desea salir del ciclo ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
            reporte = String.format ("%sTotal paises ingresados:%d\n",reporte,i);
            System.out.printf("%s\n", reporte);
        }
    }
}
/*
Nos sirve para ingresar datos hasta el infinito siempre y cuando no se cumpla con 
la condicion del Mientras ya que como vemos el -100 es como un centinela que 
para el ciclo cuando se cumple su condicion
*/
