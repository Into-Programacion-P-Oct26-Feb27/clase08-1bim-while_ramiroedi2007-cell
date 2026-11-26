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
public class Ejemplo062 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        
        while (bandera == true) {
             System.out.println("Estoy en el ciclo");//Estoy en el ciclo
            
             String salir;
             System.out.println("Desea salir del ciclo ingrese si.");
             salir = entrada.nextLine();
             if(salir .equals("si")){ 
                 bandera = false;
             }
        }
    }
}
/*
Nos sirve para ingresar datos hasta el infinito siempre y cuando no se cumpla con 
la condicion del Mientras ya que como vemos el -100 es como un centinela que 
para el ciclo cuando se cumple su condicion
*/