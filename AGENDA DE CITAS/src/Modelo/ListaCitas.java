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
public class ListaCitas {
         public static ArrayList<Citas> lCitas = new ArrayList<>(); 
 public static boolean ModificarCita(Citas ct){
        for(Citas c: lCitas){
           
                c.setHora(ct.getHora());
                c.setIdc(ct.getIdc());
                c.setMotivo(ct.getMotivo());
                return true;
            
        }
        return false;
    }
    
    public static boolean EliminarCita(int i){
        for(Citas cita: lCitas){
            if (Integer.parseInt(cita.getIdc()) == i) {
                return lCitas.remove(cita);
            }
        }
        return false;
    }    
    
    
}
