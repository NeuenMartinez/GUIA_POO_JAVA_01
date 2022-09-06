/*
 * @author NeuenMartinez
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package POOej01;

import Entidades01.Libro;
import Servicios01.LibroService;

public class POOej01 {

    public static void main(String[] args) {
        LibroService vs = new LibroService();
        Libro Libro1 = vs.crearLibro();
        Libro Libro2 = vs.crearLibro();
        System.out.println(Libro1);
        System.out.println("------------");
        System.out.println(Libro2);

    }

}
