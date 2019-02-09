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
public class ArchivoPaciente implements Serializable {

    private File archivoPaciente;

    public ArchivoPaciente() {
        this("archivo De Paciente.txt");
    }

    public ArchivoPaciente(String name) {
        this.archivoPaciente = new File(name);
        if (!this.archivoPaciente.exists()) {
            try {
                this.archivoPaciente.createNewFile();
            } catch (java.io.IOException IOE) {
                System.err.println("Error al crear el archivo");
            }
        }
    }

    public File getArchivoPaciente() {
        return archivoPaciente;
    }

    public void setArchivoPaciente(File archivoPaciente) {
        this.archivoPaciente = archivoPaciente;
    }

    public boolean LeerPaciente() {
        if (this.archivoPaciente.exists()) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(archivoPaciente);
                br = new BufferedReader(fr);
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String l[] = linea.split("; ");
                    Paciente p = new Paciente();
                    p.setNombre(l[0]);
                    p.setApellido(l[1]);
                    p.setId(l[2]);
                    p.setEdad(Integer.valueOf(l[3]));
                    p.setSexo(l[4]);
                    p.setTsangre(l[5]);
                    p.setNtelefono((l[6]));
                    p.setEps(l[7]);
                    p.setEnfermedad(l[8]);
                    p.setMedico(l[9]);

                    ListaPacientes.Listap.add(p);
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

    public boolean GuardarPaciente(ArrayList<Paciente> p) throws IOException {
        if (this.archivoPaciente.exists()) {
            this.archivoPaciente.delete();
            FileWriter fr = null;
            try {
                fr = new FileWriter(this.archivoPaciente, true);
                PrintWriter pw = new PrintWriter(fr);
                for (Paciente pa : p) {
                    pw.println(pa.getNombre() + "; " + pa.getApellido() + "; " + pa.getId() + "; " + pa.getEdad() + "; "
                            + pa.getSexo() + "; " + pa.getTsangre() + "; " + pa.getNtelefono()
                            + "; " + pa.getEps() + "; " + pa.getEnfermedad() + "; " + pa.getMedico());
                }
                return true;
            } catch (java.io.IOException IOE) {
                JOptionPane.showMessageDialog(null, "Error al Abrir el Archivo en modo escritura", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error al Escribir en el Archivo ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return false;
    }

    public boolean RegistrarPaciente(Paciente p) throws IOException {
        if (ListaPacientes.Listap.add(p)) {
            return GuardarPaciente(ListaPacientes.Listap);
        } else {
            return false;
        }
    }

    public boolean ModificarPaciente(String id, Paciente p) throws IOException {
        if (ExistePaciente(id)) {
            ListaPacientes.Listap.get(u).setNombre(p.getNombre());
            ListaPacientes.Listap.get(u).setApellido(p.getApellido());
            ListaPacientes.Listap.get(u).setEdad(p.getEdad());
            ListaPacientes.Listap.get(u).setSexo(p.getSexo());
            ListaPacientes.Listap.get(u).setTsangre(p.getTsangre());
            ListaPacientes.Listap.get(u).setNtelefono(p.getNtelefono());
            ListaPacientes.Listap.get(u).setEps(p.getEps());
            ListaPacientes.Listap.get(u).setEnfermedad(p.getEnfermedad());
            ListaPacientes.Listap.get(u).setMedico(p.getMedico());

            return GuardarPaciente(ListaPacientes.Listap);
        } else {
            return false;
        }
    }

    public boolean EliminarPaciente(long id) throws Exception {
        if (ExistePaciente(String.valueOf(id))) {
            if (ListaPacientes.Listap.remove(u) != null) {
                return GuardarPaciente(ListaPacientes.Listap);
            }
        }
        return false;
    }

    int u;

    public boolean ExistePaciente(String c) {
        u = 0;
        for (int i = 0; i < ListaPacientes.Listap.size(); i++) {
            if (ListaPacientes.Listap.get(i).getId().equals(c)) {
                u = i;
                return true;
            }
        }
        return false;
    }
}
