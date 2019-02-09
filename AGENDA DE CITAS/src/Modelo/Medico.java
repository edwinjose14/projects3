/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author GERALDIN
 */
public class Medico extends Persona {


    private String especializacion;
    private long sueldo;

    public Medico(String nombre, String apellido, String id, String sexo, String tsangre, String ntelefono, int edad) {
        super(nombre, apellido, id, sexo, tsangre, ntelefono, edad);
        this.especializacion = especializacion;
        this.sueldo = sueldo;
    }

    public Medico() {
        especializacion = "";
        sueldo = 0;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
   
}
