import java.util.ArrayList;
import java.util.List;

public class Library {
private List<Books> book;

public Library(){this.book=new ArrayList<>();}

    public void addbook(Books libro){
    book.add(libro);
    }

public void mostrarBooks(){
    System.out.println("Todos los libros:");
    for (Books libro:book){
        System.out.println(libro.getISBM());
        System.out.println(libro.getNombre());
        System.out.println(libro.getAutor());
        System.out.println(libro.getPag());
    }

}

}

