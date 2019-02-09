/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GERALDIN
 */
public class medic {
     public Object displayMember;   
    public Object valueMember;
    
    public medic(Object Nombre, Object id) {
        displayMember = Nombre;
        valueMember = id;
    }
    
    @Override
    public String toString() {
        return displayMember.toString();
    }

    
}
