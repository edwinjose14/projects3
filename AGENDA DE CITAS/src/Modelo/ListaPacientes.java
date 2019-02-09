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
public class ListaPacientes {

    public static ArrayList<Paciente> Listap = new ArrayList<>();

    public static boolean modificarpaciente(long id, Paciente p) {

        for (Paciente pa : Listap) {
            if (Long.parseLong(pa.getId()) == id) {
                pa.setNombre(p.getNombre());
                pa.setApellido(p.getApellido());
                pa.setNtelefono(p.getNtelefono());
                pa.setEdad(p.getEdad());
                pa.setSexo(p.getSexo());
                pa.setTsangre(p.getTsangre());
                pa.setEnfermedad(p.getEnfermedad());
                pa.setMedico(p.getMedico());
                pa.setEps(p.getEps());
                return true;

            }

        }
        return false;

    }

    public static boolean eliminarpaciente(long id) {
        for (Paciente pa : Listap) {
            if (Long.parseLong(pa.getId()) == id) {
                return Listap.remove(pa);
            }
        }
        return false;
    }

    public static ArrayList<Paciente> getLista() {
        return Listap;
    }

}
