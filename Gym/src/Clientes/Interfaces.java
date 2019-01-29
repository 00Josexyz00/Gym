package Clientes;

import Conector.Conector;
import Tarifas.*;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaces extends javax.swing.JFrame {

    static ResultSet res;

    public Interfaces() throws SQLException {
        initComponents();
        CargarDatosActivos();
    }

    public void CargarDatos() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) ICTabla.getModel();
        modelo.setRowCount(0);
        res = Conector.Consulta("select CI,Nombre,Apellido,TipoTarifa,ValorTarifa,Celular,Telefono,Direccion,Control,Email,Observaciones from Clientes,Tarifa where Tarifa.IdTarifa=Clientes.IdTarifa");

        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getDouble(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                v.add(res.getString(11));
                modelo.addRow(v);
                ICTabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CargarDatosEliminados() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) ICTabla.getModel();
        modelo.setRowCount(0);
        res = Conector.Consulta("select CI,Nombre,Apellido,TipoTarifa,ValorTarifa,Celular,Telefono,Direccion,Control,Email,Observaciones from Clientes,Tarifa where Tarifa.IdTarifa=Clientes.IdTarifa and Estado='ELIMINADO'");

        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getDouble(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                v.add(res.getString(11));
                modelo.addRow(v);
                ICTabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CargarDatosActivos() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) ICTabla.getModel();
        modelo.setRowCount(0);
        res = Conector.Consulta("select CI,Nombre,Apellido,TipoTarifa,ValorTarifa,Celular,Telefono,Direccion,Control,Email,Observaciones from Clientes,Tarifa where Tarifa.IdTarifa=Clientes.IdTarifa and Estado='ACTIVO'");

        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getDouble(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                v.add(res.getString(11));
                modelo.addRow(v);
                ICTabla.setModel(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PClientes = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BAgregarClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ICTabla = new javax.swing.JTable();
        Filtro = new javax.swing.JComboBox<>();
        BEliminar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        PClientes.addTab("Calendario", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        PClientes.addTab("Pagos", jPanel3);

        BAgregarClientes.setText("Agregar Clientes");
        BAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarClientesActionPerformed(evt);
            }
        });

        ICTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CI", "Nombre", "Apellido", "Tipo de pago", "Valor", "Celular", "Telefono", "Direccion", "Control", "Email", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ICTabla);

        Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activos", "Eliminados", "Todos" }));
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAgregarClientes)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BEliminar)
                            .addComponent(BModificar)
                            .addComponent(BAgregarClientes))
                        .addGap(39, 39, 39))))
        );

        PClientes.addTab("Clientes", jPanel1);

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Tarifas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PClientes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarClientesActionPerformed

        
        try {
            AClientes abrir = new AClientes();
        abrir.setVisible(true);
            CargarDatosActivos();
        } catch (SQLException ex) {
            Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BAgregarClientesActionPerformed

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        if (Filtro.getSelectedItem().toString() == "Todos") {
            try {
                CargarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (Filtro.getSelectedItem().toString() == "Eliminados") {
            try {
                CargarDatosEliminados();
            } catch (SQLException ex) {
                Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (Filtro.getSelectedItem().toString() == "Activos") {
            try {
                CargarDatosActivos();
            } catch (SQLException ex) {
                Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_FiltroActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed

        try {
            int filsel = ICTabla.getSelectedRow();
            String num = ICTabla.getValueAt(filsel, 0).toString();
            if (filsel == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar el cliente a eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {

                MClientes abrir;
                try {
                    abrir = new MClientes(num);
                    abrir.setVisible(true);
                     CargarDatosActivos();
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione el cliente a modificar");
        }
        try {
            CargarDatosActivos();
            /**/
        } catch (SQLException ex) {
            Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BModificarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed

        Connection cn = Conector.getConexion();
        int filsel;
        int resp;

        try {
            filsel = ICTabla.getSelectedRow();
            if (filsel == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar el cliente a eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este cliente?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {

                    PreparedStatement pps = cn.prepareStatement("update Clientes set Estado='ELIMINADO' where ci=?");
                    pps.setString(1, ICTabla.getValueAt(filsel, 0).toString());
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                    int resp2 = pps.executeUpdate();
                    if (resp2 < 0) {
                        JOptionPane.showMessageDialog(null, "Error al ingresar");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se pudo eliminar el cliente");
        }
    }//GEN-LAST:event_BEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      Tarifas tar;
        try {
            tar= new Tarifas();
            tar.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interfaces().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaces.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarClientes;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BModificar;
    private javax.swing.JComboBox<String> Filtro;
    private javax.swing.JTable ICTabla;
    private javax.swing.JTabbedPane PClientes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
