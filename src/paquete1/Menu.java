/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lugue
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        mostraItem();
    }

    //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    String atributo = "id";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        box_nombre = new javax.swing.JComboBox<>();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boton_enviar = new javax.swing.JButton();
        boton_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        boton_buscar = new javax.swing.JButton();
        tf_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        boton_enviar.setText("Enviar");
        boton_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_enviarActionPerformed(evt);
            }
        });

        boton_update.setText("Update");
        boton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_updateActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(boton_enviar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(boton_update)
                                    .addGap(2, 2, 2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boton_buscar)
                                        .addComponent(tf_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(box_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_enviar)
                    .addComponent(boton_update))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(boton_buscar)
                        .addGap(29, 29, 29)
                        .addComponent(tf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_enviarActionPerformed
  insertarDatos();
    }//GEN-LAST:event_boton_enviarActionPerformed

    private void boton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_updateActionPerformed
    mostrarTabla("");
    }//GEN-LAST:event_boton_updateActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
buscarPorX();
    }//GEN-LAST:event_boton_buscarActionPerformed


    //insertar datos
        public void insertarDatos() {
        try {
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO abc(nombre) VALUES (?)");
            ppt.setString(1, tf_nombre.getText());
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El campo del nombre o de la edad esta incorrectos");
          
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        //mostrar tabla
         public void mostrarTabla(String valor){
        
             DefaultTableModel modelo = new DefaultTableModel();
             //agregar columnas
             modelo.addColumn("Id");
             modelo.addColumn("Nombre");
             tabla.setModel(modelo);
             //Fin

             String sql = "";
             if(valor.equals("")){
                  sql = "SELECT * FROM abc";
             } else{
                 sql = "SELECT * FROM abc WHERE " +atributo +" = '" +valor +"'" ;
             }
             
             //arreglo
           String datos[] = new String[32];
           //fin
           
            Statement st;
             try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            

            
            //Agregar los reglones
            while(rs.next()){
                //id
                datos[0] = rs.getString(1);
                //fin
                
                                               //nombre
                datos[1] = rs.getString(2);
                //fin
                
                modelo.addRow(datos);
            }
            
            tabla.setModel(modelo);
            //Fin
            

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

         public void mostraItem(){
                     box_nombre.addItem("Id");
        box_nombre.addItem("Nombre");
         }
         
    public void buscarPorX() {
        atributo = box_nombre.getSelectedItem().toString();
        mostrarTabla(tf_buscar.getText());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_enviar;
    private javax.swing.JButton boton_update;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JComboBox<String> box_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_buscar;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
