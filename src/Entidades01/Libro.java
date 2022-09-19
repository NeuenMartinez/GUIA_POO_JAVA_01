package Entidades01;

/**
 *
 * @author NeuenMartinez
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPags;

    public Libro() {

    }

    public Libro(int ISBN, String Titulo, String Autor, int NumPags) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPags = NumPags;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPags() {
        return NumPags;
    }

    public void setNumPags(int NumPags) {
        this.NumPags = NumPags;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN =" + ISBN + ", Titulo =" + Titulo + ", Autor =" + Autor + ", NumPags =" + NumPags + '}';
    }

}
