/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

/**
 *
 * @author GERALDIN
 */
public class AgregarCita extends javax.swing.JFrame {

    DefaultTableModel tModel = new DefaultTableModel();

    /**
     * Creates new form AgregarCita
     */
    public AgregarCita() {
        initComponents();

        setLocationRelativeTo(null);
        tModel.addColumn("Identificacion");
        tModel.addColumn("Hora de Ingreso");
        tModel.addColumn("Motivo");
        tCitas.setModel(tModel);
        Recorrer();
        validarNumeros(txtIdc);
        validarLetras(txtMotivo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        txtIdc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCitas = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("Identificacion");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 100, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Hora");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("Motivo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 60, 30);

        txtMotivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(txtMotivo);
        txtMotivo.setBounds(150, 140, 130, 30);

        txtIdc.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(txtIdc);
        txtIdc.setBounds(150, 60, 120, 30);

        tCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Identificacion", "Hora", "Motivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCitas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 190, 360, 110);

        btnBorrar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(280, 310, 90, 23);

        btnAgregar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(280, 340, 100, 23);

        btnLimpiar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(50, 310, 90, 23);

        btnModificar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(150, 310, 110, 23);

        btnSalir.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(50, 340, 100, 23);

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel4.setText("AGREGAR CITAS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 10, 190, 30);

        txtHora.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(txtHora);
        txtHora.setBounds(150, 100, 120, 30);

        btnImprimir.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(160, 340, 110, 23);

        setBounds(0, 0, 447, 432);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        try {
            IngresarCita();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error al agregar", "Error cita", JOptionPane.ERROR_MESSAGE);
        }
        Recorrer();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        try {
            ModificarCita();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error al modificar", "modificar cita", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        try {
            EliminarCita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar", "eliinar cita", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        Limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void tCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCitasMouseClicked
        int row = tCitas.rowAtPoint(evt.getPoint());
        LanzarDatos(row);
    }//GEN-LAST:event_tCitasMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        try {
            MessageFormat titulo = new MessageFormat("*** LISTA DE CITAS ***");
            MessageFormat pie = new MessageFormat("-- AGENDA DE CITAS --");
            tCitas.print(JTable.PrintMode.NORMAL, titulo, pie);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo imprimir la tabla", "Imprimir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirMouseClicked

    public void IngresarCita() throws IOException {
        if (!txtIdc.getText().equals("") && !txtHora.equals("") && !txtMotivo.getText().equals("")) {

            Citas c = new Citas();
            c.setIdc(txtIdc.getText());
            c.setHora(txtHora.getText());
            c.setMotivo(txtMotivo.getText());

            if (Menu.arC.RegistrarCita(c)) {
                JOptionPane.showMessageDialog(null, "Cita Registrada", "Regitro de Cita", JOptionPane.INFORMATION_MESSAGE);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar", "Regitro de Cita", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen Campos Vacios", "Registro de Citas", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ModificarCita() throws IOException {
        if (!txtIdc.getText().equals("") && !txtHora.equals("") && !txtMotivo.getText().equals("")) {

            Citas c = new Citas();
            String idc = (txtIdc.getText());
            c.setHora(txtHora.getText());
            c.setMotivo(txtMotivo.getText());

            if (Menu.arC.ModificarCita(idc, c)) {
                JOptionPane.showMessageDialog(null, "Exito al Modificar", "Modificar Cita", JOptionPane.INFORMATION_MESSAGE);
                Recorrer();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar", "Modificar Cita", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen Campos Vacios", "Modificar Cita", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void EliminarCita() throws Exception {
        int FilaSelec = tCitas.getSelectedRow();
        if (FilaSelec >= 0) {
            int idc = Integer.parseInt(tCitas.getValueAt(FilaSelec, 0).toString());
            if (Menu.arC.EliminarCita(idc)) {
                JOptionPane.showMessageDialog(null, "Cita Eliminada", "Eliminar Cita", JOptionPane.INFORMATION_MESSAGE);
                Recorrer();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar", "Eliminar Cita", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Si Desea Eliminar Seleccione una Columna", "Eliminar Cita", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void Limpiar() {

        txtIdc.setText("");
        txtHora.setText("00:00 am");
        txtMotivo.setText("");
        txtIdc.setEnabled(true);
    }

    public void LanzarDatos(int co) {

        txtIdc.setText(tCitas.getValueAt(co, 0).toString());
        txtHora.setText(tCitas.getValueAt(co, 1).toString());
        txtMotivo.setText(tCitas.getValueAt(co, 2).toString());
        txtIdc.setEnabled(false);
    }

    public void InicioTabla() {
        int filasM = tModel.getRowCount();
        for (int i = 0; filasM > i; i++) {
            tModel.removeRow(0);
            i++;
        }
    }

    public void Recorrer() {
        InicioTabla();
        for (Citas cte : ListaCitas.lCitas) {

            Object[] c1 = new Object[3];
            c1[0] = cte.getIdc();
            c1[1] = cte.getHora();
            c1[2] = cte.getMotivo();
            tModel.addRow(c1);
        }
    }

    public void validarLetras(JTextField ke) {
        ke.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();

                    JOptionPane.showMessageDialog(null, "Sólo se permiten letras",
                            "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        });

    }

    public void validarNumeros(JTextField ke) {
        ke.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (Character.isLetter(c)) {

                    getToolkit().beep();
                    e.consume();

                    JOptionPane.showMessageDialog(null, "Sólo se permiten números",
                            "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tCitas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdc;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
