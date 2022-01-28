/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julieta Sanchez
 */
public class ServicioPerro {
    
    Scanner scan = new Scanner(System.in);
    private ArrayList<Perro>raza=new ArrayList();
  
    public Perro crearPerro(){
        System.out.println("Ingrese la raza del perro: "); 
        String tipo =scan.next();
        Perro p = new Perro(tipo);
        raza.add(p);
      return p;
    }
    
    
    public void mostrarPerro(){
        for (Perro aux : raza) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de mascotas ingresadas es de: " + raza.size());
    }
    public void menu(){
        
        int op=0;
        String op1="a";
        do {
            System.out.println("Menu:"+"\n" + 
                "1: Ingresar raza de mascota" + "\n"+ 
                "2: Salir");
            System.out.println("Ingrese una opción: ");
        op = scan.nextInt();
            switch (op) {
                case 1:
                    crearPerro();
                    break;
                case 2:
                    System.out.println("Usted ingreso la opción: Salir. ¿Confirma? s/n");
                    op1 = scan.next();
                    break;
                default:
                    System.out.println("Opción inválida!");
            }
            
        } while (op != 2 | !"s".equalsIgnoreCase(op1));
        System.out.println("Usted salio del menú");
        mostrarPerro();
    }
    
    
}
