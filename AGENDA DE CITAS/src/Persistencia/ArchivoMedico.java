package Persistencia;

import Modelo.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ArchivoMedico {

    File ArchivoMedico;

    public ArchivoMedico() {
        this("Archivo De Medico.txt");
    }

    public ArchivoMedico(String name) {
        this.ArchivoMedico = new File(name);
        if (!this.ArchivoMedico.exists()) {
            try {
                this.ArchivoMedico.createNewFile();
            } catch (java.io.IOException IOE) {
                System.err.println("Error al crear el archivo");
            }
        }
    }

    public File getArchivoMedico() {
        return ArchivoMedico;
    }

    public void setAArchivoMedico(File ArchivoMedico) {
        this.ArchivoMedico = ArchivoMedico;
    }


    
    public boolean GuardarMedico(ArrayList<Medico> m) throws IOException {

        if (this.ArchivoMedico.exists()) {
            this.ArchivoMedico.delete();
            FileWriter fr = null;
            try {
                fr = new FileWriter(this.ArchivoMedico, true);
                PrintWriter pw = new PrintWriter(fr);
                for (Medico h : m) {
                    pw.println(h.getNombre() + "; " + h.getApellido() + "; " + h.getId() + "; " + h.getEdad()
                            + "; " + h.getSexo() + "; " + h.getTsangre() + "; " + h.getNtelefono() + "; "
                            + h.getEspecializacion());
                }
                return true;
            } catch (java.io.IOException IOE) {
                JOptionPane.showMessageDialog(null, "Error al Abrir el Archivo en modo escritura ", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error al Escribir en el Archivo: ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return false;
    }

 
   
    public boolean RegistrarMedico(Medico m) throws IOException {
        if (ListaMedico.lMedico.add(m)) {
            return GuardarMedico(ListaMedico.lMedico);
        } else {
            return false;
        }
    }

    public boolean LeerMedico() {
        if (this.ArchivoMedico.exists()) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(ArchivoMedico);
                br = new BufferedReader(fr);
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String l[] = linea.split("; ");
                    Medico m = new Medico();
                    m.setNombre(l[0]);
                    m.setApellido(l[1]);
                    m.setId(l[2]);
                    m.setEdad(Integer.valueOf(l[3]));
                    m.setSexo(l[4]);
                    m.setTsangre(l[5]);
                    m.setNtelefono((l[6]));
                    m.setEspecializacion(l[7]);

                    ListaMedico.lMedico.add(m);
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

    public boolean ModificarMedico(String id, Medico m) throws IOException {
        if (ExisteMedico(id)) {
            ListaMedico.lMedico.get(u).setNombre(m.getNombre());
            ListaMedico.lMedico.get(u).setApellido(m.getApellido());
            ListaMedico.lMedico.get(u).setEdad(m.getEdad());
            ListaMedico.lMedico.get(u).setSexo(m.getSexo());
            ListaMedico.lMedico.get(u).setTsangre(m.getTsangre());
            ListaMedico.lMedico.get(u).setNtelefono(m.getNtelefono());
            ListaMedico.lMedico.get(u).setEspecializacion(m.getEspecializacion());

            return GuardarMedico(ListaMedico.lMedico);
        } else {
            return false;
        }
    }

    public boolean EliminarMedico(long id) throws IOException {

        if (ExisteMedico(String.valueOf(id))) {
            if (ListaMedico.lMedico.remove(u) != null) {
                return GuardarMedico(ListaMedico.lMedico);
            }
        }
        return false;
    }

    int u;

    public boolean ExisteMedico(String c) {
        u = 0;
        for (int i = 0; i < ListaMedico.lMedico.size(); i++) {
            if (ListaMedico.lMedico.get(i).getId().equals(c)) {
                u = i;
                return true;
            }
        }
        return false;
    }

}
