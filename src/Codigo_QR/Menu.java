/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo_QR;

import com.barcodelib.barcode.QRCode;
import java.awt.Desktop;
import java.io.File;

/**
 *
 * @author Lugue
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    //variables
    int udm = 0, resol = 72, rot = 0;
    float mi = 0.000f, md = 0.000f, ms = 0.000f, min = 0.000f, tam = 5.00f;
    
    //metodo
    public void generarQR(String dato){
        try{
            
            QRCode code = new QRCode();
            code.setData(dato);
            code.setDataMode(QRCode.MODE_BYTE);
            code.setUOM(udm);
            code.setLeftMargin(mi);
            code.setRightMargin(md);
            code.setTopMargin(ms);
            code.setBottomMargin(min);
            code.setResolution(resol);
            code.setRotate(rot);
            code.setModuleSize(tam);
            
            String archivo = System.getProperty("user.home")+"/CodigoQR GG.gif";
            code.renderBarcode(archivo);
            
            Desktop desk = Desktop.getDesktop();
            desk.open(new File(archivo));
            
        }catch(Exception e){
            System.out.println("Error de: " +e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_generar = new javax.swing.JButton();
        tf_texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_generar.setText("Generar");
        boton_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_generarActionPerformed(evt);
            }
        });

        txta_texto.setColumns(20);
        txta_texto.setRows(5);
        jScrollPane1.setViewportView(txta_texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(boton_generar)
                .addContainerGap(135, Short.MAX_VALUE))
            .addComponent(tf_texto)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tf_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(boton_generar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_generarActionPerformed
        String texto = tf_texto.getText();
        String texto2 = txta_texto.getText();
        generarQR(texto2);
    }//GEN-LAST:event_boton_generarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_generar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_texto;
    private javax.swing.JTextArea txta_texto;
    // End of variables declaration//GEN-END:variables
}
