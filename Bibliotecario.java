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

public class Bibliotecario extends Persona {

    private String numeroEmpleado;
    private String turno;
    private double salario;
    private String puesto;

    public void autorizarPrestamo() {}

    public void registrarLibro() {}

    public void eliminarLibro() {}

    public void registrarUsuario() {}

    public void registrarDevolucion() {}

    @Override
    public void mostrarInformacion() {}

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }
}
