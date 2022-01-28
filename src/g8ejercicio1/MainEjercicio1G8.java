/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package g8ejercicio1;

import entidades.Perro;
import java.util.Scanner;
import servicios.ServicioPerro;

/**
 *
 * @author Julieta Sanchez
 */
public class MainEjercicio1G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ServicioPerro ser = new ServicioPerro();
        ser.menu();
        
      
    }
    
}
