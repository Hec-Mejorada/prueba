/*
 * Práctica 4 a 5.
 *
 *...
 *
 * Integrantes:
 *  Lima Tehózol José Luis
 *  Mejorada Ordóñez Héctor Vicente
 *  Ortiz Hernández Yesica
 *  Primero Reyes Monserrath
 */

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Bibliotecario> empleados;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(){}

    //métodos de gestión de libros
    public void eliminarLibro(String isbn){}

    public Libro buscarLibro(String isbn){}

    public void mostrarCatalogo(){}

    //gestión de usuarios
    public void registrarUsuario(Usuario usuario){}

    public Usuario buscarUsuario(int id){}

    public void mostrarUsuarios(){}

    //destión de prestamos
    public void realizarPrestamo(Usuario usuario, Libro libro){}

    public void devolverLibro(Prestamo prestamo){}

    public void mostrarPrestamos(){}

    public Libro buscarLibro(String isbn){}

    public Libro buscarLibro(String titulo, String autor){}
}
