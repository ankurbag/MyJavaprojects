/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grid;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ankur
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
     private static ComponentLinker linker;

    public NewJFrame() throws UnsupportedLookAndFeelException {
        initComponents();
        
        setupLookAndFeel();
//        ComponentLinker[] componentLinkers = new ComponentLinker[10];
//        for (int i = 0; i < 10; i++) {
//            componentLinkers[i] = new ComponentLinker();
//
//        }
        linker = new  ComponentLinker();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
//        this.setVisible(true);
        this.getGlassPane();
        this.setGlassPane(linker);
        linker.setVisible(true);
//        this.setGlassPane(componentLinkers[0]);
//        componentLinkers[0].setVisible(true);
//        componentLinkers[0].setColor(Color.green);
//
//        componentLinkers[0].link(jToggleButton1, jToggleButton2);
//        this.setGlassPane(componentLinkers[1]);
//        componentLinkers[1].setVisible(true);
//        componentLinkers[1].setColor(Color.green);
//
//        componentLinkers[1].link(jToggleButton1, jToggleButton4);
//
//        componentLinkers[2].link(jToggleButton2, jToggleButton3);
//        componentLinkers[3].link(jToggleButton3, jToggleButton4);

//        
        linker.link(t00, t10);
        linker.link(t10, t11);
        linker.link(t11, t01);
        linker.link(t01, t00);
        
        int distArrayt00 [] = new int[]{10,20,10};
        int distArrayt01 [] = new int[]{10,10,20};
        int distArrayt10 [] = new int[]{10,10,15};
        int distArrayt11 [] = new int[]{10,10,15};
         
        for(int i=0;i<distArrayt00.length;i++){
           
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t00 = new javax.swing.JToggleButton();
        t10 = new javax.swing.JToggleButton();
        t01 = new javax.swing.JToggleButton();
        t11 = new javax.swing.JToggleButton();
        t12 = new javax.swing.JToggleButton();
        t13 = new javax.swing.JToggleButton();
        t14 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t00.setText("jToggleButton1");

        t10.setText("jToggleButton2");

        t01.setText("jToggleButton3");

        t11.setText("jToggleButton4");

        t12.setText("jToggleButton4");

        t13.setText("jToggleButton4");

        t14.setText("jToggleButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t00)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(t01)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t11)
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t14)
                    .addComponent(t13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(t12)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t00)
                    .addComponent(t01))
                .addGap(33, 33, 33)
                .addComponent(t13)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t10)
                    .addComponent(t11))
                .addGap(18, 18, 18)
                .addComponent(t14)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(216, Short.MAX_VALUE)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(84, 84, 84)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private static void setupLookAndFeel() throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton t00;
    private javax.swing.JToggleButton t01;
    private javax.swing.JToggleButton t10;
    private javax.swing.JToggleButton t11;
    private javax.swing.JToggleButton t12;
    private javax.swing.JToggleButton t13;
    private javax.swing.JToggleButton t14;
    // End of variables declaration//GEN-END:variables
}
