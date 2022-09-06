package Servicios01;

import Entidades01.Libro;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class LibroService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("INGRESAR LOS SIGUIENTES DATOS:");
        System.out.println("ISBN:");
        int ISBN = leer.nextInt();
        System.out.println("Titulo:");
        String Titulo = leer.next();
        System.out.println("Autor:");
        String Autor = leer.next();
        System.out.println("Numero de paginas:");
        int NumPags = leer.nextInt();
        return new Libro(ISBN, Titulo, Autor, NumPags);

    }

}
