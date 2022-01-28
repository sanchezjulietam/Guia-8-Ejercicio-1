/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Julieta Sanchez
 */
public class Perro {
    private String tipo;

    public Perro() {
    }
   

    public Perro(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Perro{" + "tipo=" + tipo + '}';
    }

  
    
}
