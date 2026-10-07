/*
 * Práctica 4 a 5.
 *
 * Clase libro
 *
 * Integrantes:
 *  Lima Tehózol José Luis
 *  Mejorada Ordóñez Héctor Vicente
 *  Ortiz Hernández Yesica
 *  Primero Reyes Monserrath
 */

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    private static int totalLibros;

    public Libro(){
        totalLibros++;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        totalLibros++;
    }

    public Libro(String isbn, String titulo, String autor, int anioPublicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        totalLibros++;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public void prestar(){
        if(disponible){
            disponible = false;
            System.out.println("Prestamo realizado");
        } else {
            System.out.println("Este libro no esta disponible en este momento");
        }
    }

    public void devolver(){
        disponible = true;
        System.out.println("Libro devuelto.");
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public static void setTotalLibros(int totalLibros){
        totalLibros = totalLibros;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public static int getTotalLibros(){
        return totalLibros;
    }
}

    public static int getTotalLibros(){
        return totalLibros;
    }
}
