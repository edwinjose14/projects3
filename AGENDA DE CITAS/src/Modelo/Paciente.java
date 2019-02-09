package Modelo;



public class Paciente extends Persona {

    private String enfermedad;
    private String medico;
    private String eps;

    public Paciente(String enfermedad, String medico, String eps, String nombre, String apellido, String id, String sexo, String tsangre, String ntelefono, int edad) {
        super(nombre, apellido, id, sexo, tsangre, ntelefono, edad);
        this.enfermedad = enfermedad;
        this.medico = medico;
        this.eps = eps;

    }

    public Paciente() {
        enfermedad = "";
        medico = "";
        eps = "";
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

}
