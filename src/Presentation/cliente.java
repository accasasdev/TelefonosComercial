/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

import Aplication.NuevoCliente;
import java.awt.BorderLayout;

/**
 *
 * @author Victoria
 */
public class cliente extends javax.swing.JPanel {

    /**
     * Creates new form cliente
     */
    public cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        con_cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btn_crearcliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_cliente = new javax.swing.JTable();
        btn_buscarCliente = new javax.swing.JButton();
        btn_editarcliente = new javax.swing.JButton();
        btn_eliminarcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(448, 966));

        con_cliente.setBackground(new java.awt.Color(255, 255, 255));
        con_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar:");
        con_cliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        con_cliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 620, -1));

        btn_crearcliente.setText("Crear nuevo usuario");
        btn_crearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearclienteActionPerformed(evt);
            }
        });
        con_cliente.add(btn_crearcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 150, -1));

        tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apellido Paterno", "Apellido Materno", "Sexo", "Fecha de Nacimiento", "Tipo de documento", "Numero de documento", "Telefono", "Direccion", "Email", "Fecha Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_cliente);

        con_cliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 930, 250));

        btn_buscarCliente.setText("Buscar");
        btn_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarClienteActionPerformed(evt);
            }
        });
        con_cliente.add(btn_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 150, -1));

        btn_editarcliente.setText("Editar");
        con_cliente.add(btn_editarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 150, -1));

        btn_eliminarcliente.setText("Eliminar");
        con_cliente.add(btn_eliminarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 150, -1));

        jLabel2.setText("Lista de Clientes");
        con_cliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(con_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(con_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearclienteActionPerformed
        // TODO add your handling code here:
        NuevoCliente nuevo=new NuevoCliente();
        nuevo.setSize(966, 448);
        nuevo.setLocation(0,0);
        
        con_cliente.removeAll();
        con_cliente.add(nuevo, BorderLayout.CENTER);
        con_cliente.revalidate();
        con_cliente.repaint();
    }//GEN-LAST:event_btn_crearclienteActionPerformed

    private void btn_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarCliente;
    private javax.swing.JButton btn_crearcliente;
    private javax.swing.JButton btn_editarcliente;
    private javax.swing.JButton btn_eliminarcliente;
    private javax.swing.JPanel con_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla_cliente;
    // End of variables declaration//GEN-END:variables
}
