package GestionLibros;

public class AdminLibros {

    public static void main(String[] args) {

        //creacion de objetos
        Libro libroUno = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
        Libro libroDos = new Libro("Matar a un ruiseñor", "Harper Lee", 281, 1960);
        Libro libroTres = new Libro("El olvido que seremos", "Héctor Abad Faciolince", 272, 2006);


        System.out.println("Libro 1: ");
        libroUno.mostrarDatosLibros();
        System.out.println("Libro 2: ");
        libroDos.mostrarDatosLibros();
        System.out.println("Libro 3:");
        libroTres.mostrarDatosLibros();

        System.out.println("Libro 1 Modificado:");
        System.out.println("Titulo: " +libroUno.getTitulo());
        System.out.println("Autor: " +libroUno.getAutor());
        libroUno.setNumeroPaginas(400);
        System.out.println("Numero Paginas: " +libroUno.getNumeroPaginas());
        System.out.println("Año Publicacion: " +libroUno.getAnoPublicacion());


    }
}
