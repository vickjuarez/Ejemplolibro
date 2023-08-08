/*
 *En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
de todos sus atributos.
 */
package ejercicio1primeraclase;


public class Libro {
  // aca empiezan los atributos
    private String nombre ;
    private String titulo;
    private String autor;
    private int año;
 // aca empiezan los constructores
 
    public Libro (String nombre, String titulo, String autor, int año){
  //  le estoy asignando un valor     
    this.nombre = nombre;
    this.titulo = titulo;
    this.autor = autor;
    this.año =año;
    
    }
// metodos s (asignar ) y g (recibir) 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
