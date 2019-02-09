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
public class ListaMedico {

    public static ArrayList<Medico> lMedico = new ArrayList<>();

    public ListaMedico() {
    }

    public static ArrayList<Medico> getlMedico() {
        return lMedico;
    }

    public static void setlMedico(ArrayList<Medico> lMedico) {
        ListaMedico.lMedico = lMedico;
    }

    public static boolean modificar(long id, Medico med) {
        for (Medico m : lMedico) {
            if (Long.parseLong(m.getId()) == id) {
                m.setApellido(med.getApellido());
                m.setNombre(med.getNombre());
                m.setEdad(med.getEdad());
                m.setSexo(med.getSexo());
                m.setNtelefono(med.getNtelefono());
                m.setEspecializacion(med.getEspecializacion());
                m.setSueldo(med.getSueldo());
                m.setTsangre(med.getTsangre());
                return true;
            }
        }
        return false;
    }

    public static boolean borrarMedico(long id) {
        for (Medico m : lMedico) {
            if (Long.parseLong(m.getId()) == id) {
                return lMedico.remove(m);
            }
        }
        return false;
    }

}
