public class Books {

    private int ISBM;

    public int getISBM() {
        return ISBM;
    }

    public void setISBM(int ISBM) {
        this.ISBM = ISBM;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private int pag;

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

public Books(int ISBM, String nombre, String autor, int pag){

        this.ISBM= ISBM;
        this.nombre=nombre;
        this.autor=autor;
        this.pag=pag;
}
public Books(String nombre, String autor, int pag){
    this.ISBM=isbmggenerator.generador();
    this.nombre=nombre;
    this.autor=autor;
    this.pag=pag;
}
Isbmggenerator isbmggenerator =new Isbmggenerator();
}
