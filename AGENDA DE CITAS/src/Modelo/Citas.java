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
public class Citas {


    private String idc, hora, motivo;

    public Citas(String idc, String hora, String motivo) {
        this.idc = idc;
        this.hora = hora;
        this.motivo = motivo;
    }
    public Citas(){}

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    

}
