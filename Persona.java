/*
 * Práctica 4 a 5.
 *
 * Esta clase abstracta nos sirve como base para las clases usuario y bibliotecario
 * teniendo los aspectos más mínimos para que hereden las clases hijas
 *
 * Integrantes:
 *  Lima Tehózol José Luis
 *  Mejorada Ordóñez Héctor Vicente
 *  Ortiz Hernández Yesica
 *  Primero Reyes Monserrath
 */

abstract class Persona {

    //atributos
    protected int id;
    protected String nombre;
    protected String correo;

    //constructores
    public Persona(){}

    public Persona(int id, String nombre, String correo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    //metodos
    public abstract void mostrarInformacion();

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }
}
    public String getCorreo(){
        return correo;
    }
}
