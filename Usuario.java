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

public class Usuario extends Persona{

    private int librosPrestados;
    private String telefonoCelular;
    private boolean activo;

    public Usuario(){}

    public Usuario(int id, String nombre, String correo, boolean activo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = activo;
    }

    public Usuario(String nombre, String telefonoCelular, boolean activo, int id){
        this.nombre = nombre;
        this.telefonoCelular = telefonoCelular;
        this.activo = activo;
        this.id = id;
    }

    public Usuario(boolean activo, int id, String telefonoCelular, String correo){
        this.activo = activo;
        this.id = id;
        this.correo = correo;
        this.telefonoCelular = telefonoCelular;
    }

    public void solicitarPrestamo(){}

    public void devolverLibro(){}

    @Override
    public void mostrarInformacion(){}

    public void setLibrosPrestados(int librosPrestados){
        this.librosPrestados = librosPrestados;
    }

    public void setTelefonoCelular(String telefonoCelular){
        this.telefonoCelular = telefonoCelular;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public int getLibrosPrestados(){
        return librosPrestados;
    }

    public String getTelefonoCelular(){
        return telefonoCelular;
    }

    public boolean getActivo(){
        return activo;
    }

}
