/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.systemAdminWorkArea;

import com.neu.business.DB4OUtil.DB4OUtil;
import com.neu.userinterface.*;
import com.neu.business.EcoSystem;
import com.neu.business.network.Network;
import com.neu.userinterface.util.UIUtilities;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ankur
 */
public class SysAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    DB4OUtil dB4OUtil;
    Network network;
    public SysAdminWorkAreaPanel(EcoSystem ecoSystem, JPanel userProcessContainer,DB4OUtil dB4OUtil) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        UIUtilities.initButtonComponents(dashboardMenu);
        UIUtilities.initButtonComponents(enterpriseMenu);
        UIUtilities.initButtonComponents(adminMenu);
        UIUtilities.initButtonComponents(menuButton);
        toggleTabs();
        menuPanel.setVisible(false);
        dashboardMenu.setSelected(true);
        dashboardMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/dashboard-tab-active.png")));
        if(ecoSystem.getNetworkList().size()==0){
            //network = ecoSystem.getNetworkList().get(0);
            //if(network == null){
                network= ecoSystem.createNetwork();
                network.setName("Boston");
            //}
        }
        headingLabel.setText("My Dashboard");
        splitPane.setBottomComponent(new SysAdminDashboard(ecoSystem));
    }

    private void toggleTabs() {

        if (dashboardMenu.isSelected()) {
            dashboardMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/dashboard-tab-active.png")));
            enterpriseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/enterprise-tab.png")));
            adminMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/admin-tab.png")));
            headingLabel.setText("My Dashboard");
            splitPane.setBottomComponent(new SysAdminDashboard(ecoSystem));

        }
        if (enterpriseMenu.isSelected()) {
            dashboardMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/dashboard-tab.png")));
            enterpriseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/enterprise-tab-active.png")));
            adminMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/admin-tab.png")));
            dashboardMenu.setSelected(false);
            adminMenu.setSelected(false);
            headingLabel.setText("Manage My Enterprises");
            splitPane.setBottomComponent(new com.neu.userInterface.systemAdminWorkArea.ManageEnterpriseJPanel(ecoSystem));
        }
        if (adminMenu.isSelected()) {
            dashboardMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/dashboard-tab.png")));
            enterpriseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/enterprise-tab.png")));
            adminMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/admin-tab-active.png")));
            enterpriseMenu.setSelected(false);
            dashboardMenu.setSelected(false);
            headingLabel.setText("Manage My Admins");
            splitPane.setBottomComponent(new com.neu.userInterface.systemAdminWorkArea.ManageEnterpriseAdminJPanel(ecoSystem));

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

        jLabel5 = new javax.swing.JLabel();
        menuButton = new javax.swing.JToggleButton();
        menuPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dashboardMenu = new javax.swing.JToggleButton();
        enterpriseMenu = new javax.swing.JToggleButton();
        adminMenu = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(8, 157, 227));
        setPreferredSize(new java.awt.Dimension(420, 650));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sysadmin");

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/User-Interface-Menu-icon.png"))); // NOI18N
        menuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        menuButton.setName("menuBtn"); // NOI18N
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        menuPanel.setBackground(new java.awt.Color(8, 157, 227));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        menuPanel.setBorder(dropShadowBorder1);
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(8, 157, 227));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logout");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(8, 157, 227));

        dashboardMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/dashboard-tab.png"))); // NOI18N
        dashboardMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardMenu.setPreferredSize(new java.awt.Dimension(128, 35));
        dashboardMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardMenuActionPerformed(evt);
            }
        });

        enterpriseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/enterprise-tab.png"))); // NOI18N
        enterpriseMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterpriseMenu.setPreferredSize(new java.awt.Dimension(128, 35));
        enterpriseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseMenuActionPerformed(evt);
            }
        });

        adminMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/admin-tab.png"))); // NOI18N
        adminMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminMenu.setPreferredSize(new java.awt.Dimension(128, 35));
        adminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dashboardMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dashboardMenu, enterpriseMenu});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterpriseMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(dashboardMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(40);
        splitPane.setDividerSize(1);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        headingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setText("My Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(jPanel1);

        displayPanel.setBackground(new java.awt.Color(239, 239, 239));
        displayPanel.setAutoscrolls(true);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        splitPane.setBottomComponent(displayPanel);

        jPanel3.add(splitPane, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        if (menuButton.isSelected()) {
            menuPanel.setVisible(true);
        } else {
            menuPanel.setVisible(false);
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    private void dashboardMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardMenuActionPerformed
        // TODO add your handling code here:
        toggleTabs();
        enterpriseMenu.setSelected(false);
        adminMenu.setSelected(false);
    }//GEN-LAST:event_dashboardMenuActionPerformed

    private void enterpriseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseMenuActionPerformed
        // TODO add your handling code here:
        toggleTabs();
        dashboardMenu.setSelected(false);
        adminMenu.setSelected(false);


    }//GEN-LAST:event_enterpriseMenuActionPerformed

    private void adminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMenuActionPerformed
        // TODO add your handling code here:
        toggleTabs();
        enterpriseMenu.setSelected(false);
        dashboardMenu.setSelected(false);
    }//GEN-LAST:event_adminMenuActionPerformed

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        LoginPanel panel = new LoginPanel(ecoSystem,userProcessContainer,dB4OUtil);
        userProcessContainer.add("LoginPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_menuPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton adminMenu;
    private javax.swing.JToggleButton dashboardMenu;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JToggleButton enterpriseMenu;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton menuButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
