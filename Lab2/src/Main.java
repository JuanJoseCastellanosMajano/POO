public class Main {
    public static void main (String args[]){

        Library biblio = new Library();
        Books libro1= new Books("El principito","Antonie deSaints Exupery",50);
        Books libro2= new Books("100 de soledad","Marquez",1000);
       biblio.addbook(libro1);
       biblio.addbook(libro2);
       biblio.mostrarBooks();
    }
}
