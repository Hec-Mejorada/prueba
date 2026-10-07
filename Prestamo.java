/*
 * Práctica 4 a 5.
 *
 *
 *
 * Integrantes:
 *  Lima Tehózol José Luis
 *  Mejorada Ordóñez Héctor Vicente
 *  Ortiz Hernández Yesica
 *  Primero Reyes Monserrath
 */

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean activo;

    public Prestamo(){}

    public Prestamo(Usuario usuario, Libro libro){

    }

    public void iniciarPrestamo(){}

    public void finalizarPrestamo(){}

    public boolean estaActivo(){}

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public void setFechaPrestamo(String fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public Libro getLibro(){
        return libro;
    }

    public String getFechaPrestamo(){
        return fechaPrestamo;
    }

    public String getFechaDevolucion(){
        return fechaDevolucion;
    }

    public boolean getActivo(){
        return activo;
    }
}
    public boolean getActivo(){
        return activo;
    }
}
