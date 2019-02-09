/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;


import Modelo.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author GERALDIN
 */
public class ArchivoCita implements Serializable {
    
    private File ArchivoCita;
     
    public ArchivoCita(String name) {
        this.ArchivoCita = new File(name);
        if (!this.ArchivoCita.exists()) {
            try {
                this.ArchivoCita.createNewFile();
            } catch (java.io.IOException IOE) {
                System.err.println("Error al crear el archivo");
            }
        }
    }

    public ArchivoCita() {
        this("Archivo De Citas.txt");
    }
    

    public File getArchivoCita() {
        return ArchivoCita;
    }

    public void setAArchivoCita(File ArchivoCita) {
        this.ArchivoCita = ArchivoCita;
    }



     public boolean GuardarCita(ArrayList<Citas> c) throws IOException{
         if (this.ArchivoCita.exists()) {
            this.ArchivoCita.delete();
            FileWriter fr = null;
             try {
                fr = new FileWriter(this.ArchivoCita, true);
                PrintWriter pw = new PrintWriter(fr);
                for(Citas cit: c){
                    pw.println(cit.getIdc()+"; "+ cit.getHora()+"; "+cit.getMotivo());
                }
                return true;
             } catch (java.io.IOException IOE) {
                 JOptionPane.showMessageDialog(null, "Error al Abrir el Archivo en modo escritura","Error", JOptionPane.ERROR_MESSAGE);
             }finally{
                 try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error al Escribir en el Archivo ","Error", JOptionPane.ERROR_MESSAGE);
                }
             }
         }
        return false;
    }
    
    public boolean LeerCita() {
        if (this.ArchivoCita.exists()) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(ArchivoCita);
                br = new BufferedReader(fr);
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String l[] = linea.split("; ");
                    Citas c = new Citas();
                    c.setIdc(l[0]);
                    c.setHora(l[1]);
                    c.setMotivo((l[2]));
                    ListaCitas.lCitas.add(c);
                }
                return true;
            } catch (java.io.IOException IOE) {
                JOptionPane.showMessageDialog(null, "Error al abrir el Archivo, el sistema ha dicho: " + IOE.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error al abrir en el Archivo, el sistema ha dicho: " + e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return false;
    }
    
    public boolean RegistrarCita(Citas c) throws IOException {
        if (ListaCitas.lCitas.add(c)) {
            return GuardarCita(ListaCitas.lCitas);
        } else {
            return false;
        }
    }

    public boolean ModificarCita(String id,Citas c)throws IOException{
        if (ExisteCita(id)) {
            ListaCitas.lCitas.get(u).setIdc(c.getIdc());
            ListaCitas.lCitas.get(u).setHora(c.getHora());
            ListaCitas.lCitas.get(u).setMotivo(c.getMotivo());

            return GuardarCita(ListaCitas.lCitas);
        }else{
            return false;
        }
    }
    
    public boolean EliminarCita(long idc)throws Exception{
        if (ExisteCita(String.valueOf(idc))) {
            if (ListaCitas.lCitas.remove(u)!= null) {
                return GuardarCita(ListaCitas.lCitas);
            }
        }
        return false;
    }
    
    
     int u;

    public boolean ExisteCita(String c) {
        u = 0;
        for (int i = 0; i < ListaCitas.lCitas.size(); i++) {
            if (ListaCitas.lCitas.get(i).getIdc().equals(c)) {
                u = i;
                return true;
            }
        }
        return false;
    }
}

