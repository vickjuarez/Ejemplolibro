/*
 * En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
de todos sus atributos.
 */
package ejercicio1primeraclase;

public class Ejercicio1primeraclase {

    public static void main(String[] args) {
     Libro librito= new Libro ( "victoria " ,"Elefante ","Eluney ", 2002); 
       // es necesario el identificador de la clase para poder llamarlo      
     System.out.println ( "Nombre: "+ librito.getNombre());
     System.out.println ( "Titulo: "+ librito.getTitulo());
     System.out.println ( "Autor: "+ librito.getAutor()); 
     System.out.println ( "Año: "+ librito.getAño()); 
    }
    
}
