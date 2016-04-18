/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface;

import com.neu.business.DB4OUtil.DB4OUtil;
import com.neu.userinterface.administrativeRole.*;
import com.neu.business.EcoSystem;
import com.neu.business.employee.Employee;
import com.neu.business.employee.Schedule;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.Organization;
import static com.neu.business.organization.Organization.Type.Patient;
import com.neu.business.organization.OrganizationDirectory;
import com.neu.business.organization.PatientOrganization;
import com.neu.business.patients.Patients;
import com.neu.business.role.Role;
import com.neu.business.userAccount.UserAccount;
import com.neu.userinterface.util.UIUtilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankur
 */
public class UserSignUpPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    private String weekDay;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public UserSignUpPanel(OrganizationDirectory organizationDirectory) {

        this.organizationDirectory = organizationDirectory;

        detailsPanel.setVisible(false);
        jScrollPane3.setVisible(false);

    }

    public UserSignUpPanel(EcoSystem ecoSystem, JPanel userProcessContainer, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = ecoSystem;
        this.dB4OUtil = dB4OUtil;
        if(ecoSystem.getNetworkList().size() == 0)
        {
            JOptionPane.showMessageDialog(null, "System is not instantiated","Admin Error",JOptionPane.ERROR_MESSAGE);
            returnToHome();
        }else{
        populateCityComboBox();
        msgLabel.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        }
    }

    private void populateCityComboBox() {
        cityNameCombo.removeAllItems();
//        hospitalEnterprise.removeAllItems();
//        organizationCombo.removeAllItems();

        for (Network network : system.getNetworkList()) {
            cityNameCombo.addItem(network);

        }
        populateHospitalComboBox();
    }

    private void populateHospitalComboBox() {
        //cityNameCombo.removeAllItems();
        hospitalEnterprise.removeAllItems();
        //organizationCombo.removeAllItems();
        Network network = (Network) cityNameCombo.getSelectedItem();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            hospitalEnterprise.addItem(enterprise);
        }

    }

    private void populateOrganizations() {
        organizationCombo.removeAllItems();
        Enterprise e = (Enterprise) hospitalEnterprise.getSelectedItem();
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PatientOrganization) {
                organizationCombo.addItem(organization);
            }
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

        headingLabel = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        detailsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        organizationCombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        confirmPswdField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pswdField = new javax.swing.JPasswordField();
        jScrollPane5 = new javax.swing.JScrollPane();
        detailsPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        cityNameCombo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        hospitalEnterprise = new javax.swing.JComboBox();
        ageSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        mobileJTextfield = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(239, 239, 239));
        setPreferredSize(new java.awt.Dimension(418, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headingLabel.setText("Sign Up");
        add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitJButton.setText("Home");
        submitJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitJButton.setPreferredSize(new java.awt.Dimension(75, 31));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 121, 35));

        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        detailsPanel.setBorder(dropShadowBorder1);
        detailsPanel.setAutoscrolls(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/submit-button_small.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        organizationCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Create Account");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel13.setText("User Type");

        confirmPswdField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Confirm Password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Password");

        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameTxtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Username");

        pswdField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        pswdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswdFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPswdField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswdField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(24, 24, 24)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPswdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jScrollPane3.setViewportView(detailsPanel);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 390, 270));

        detailsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        detailsPanel1.setBorder(dropShadowBorder2);
        detailsPanel1.setAutoscrolls(true);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel11.setText("Name");

        nameJTextField.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJTextFieldFocusLost(evt);
            }
        });
        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel12.setText("Mobile Number");

        msgLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 51, 51));
        msgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/alert-bad.gif"))); // NOI18N
        msgLabel.setText("msgLabel");

        cityNameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameComboActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel15.setText("City");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel16.setText("Hospital");

        hospitalEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalEnterprise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hospitalEnterpriseItemStateChanged(evt);
            }
        });
        hospitalEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalEnterpriseActionPerformed(evt);
            }
        });

        ageSpinner.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ageSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Age");

        try {
            mobileJTextfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mobileJTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileJTextfieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout detailsPanel1Layout = new javax.swing.GroupLayout(detailsPanel1);
        detailsPanel1.setLayout(detailsPanel1Layout);
        detailsPanel1Layout.setHorizontalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanel1Layout.createSequentialGroup()
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameJTextField)
                            .addComponent(cityNameCombo, 0, 120, Short.MAX_VALUE)
                            .addComponent(hospitalEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageSpinner)
                            .addComponent(mobileJTextfield))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        detailsPanel1Layout.setVerticalGroup(
            detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(9, 9, 9)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(hospitalEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mobileJTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(detailsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jScrollPane5.setViewportView(detailsPanel1);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        userProcessContainer.removeAll();
        LoginPanel panel = new LoginPanel(system, userProcessContainer, dB4OUtil);
        userProcessContainer.add("LoginPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
        dB4OUtil.storeSystem(system);

//        Network network = (Network) networkJComboBox.getSelectedItem();
//        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
//
//        if (network == null || type == null) {
//            JOptionPane.showMessageDialog(null, "Invalid Input!");
//            return;
//        }
//
//        String name = nameJTextField.getText();
//
//        Enterprise enterprise = network.getEnterpriseDirectory().createEnterprise(name, type);
//
//        //         system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getSupportedRole().add(new Nurse());
//        //         system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getSupportedRole().add(new Receptionist());
//        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String name = nameJTextField.getText();
        organization = (Organization) organizationCombo.getSelectedItem();
        if (organization == null) {
            JOptionPane.showMessageDialog(null, "Admin has not created the patient Directory.");
            return;
        }

        if (UIUtilities.isEmpty(nameJTextField) || UIUtilities.isEmpty(mobileJTextfield)
                || UIUtilities.isEmpty(pswdField) || UIUtilities.isEmpty(confirmPswdField)) {
            msgLabel.setVisible(true);
            msgLabel.setText("Error : Some fields are Mandatory!!");
            return;
        }

        Patients patient = organization.getPatientDirectory().createPatient(name);

        //patient.setEmailId(emailIdTxt.getText());
        patient.setMobileNum(mobileJTextfield.getText());
        patient.setAge(Integer.valueOf(ageSpinner.getValue().toString()));

        if (pswdField.getText().equalsIgnoreCase(confirmPswdField.getText())) {
            if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(usernameTxt.getText())) {
                UserAccount ua = organization.getUserAccountDirectory().
                        createUserAccount(usernameTxt.getText(), pswdField.getText(),
                                patient, organization.getSupportedRole().get(0));
                msgLabel.setVisible(true);
                msgLabel.setText("Successfully created!!!");
                msgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/success.gif")));
                msgLabel.setForeground(Color.green);
                resetFields();
            } else {
                msgLabel.setVisible(true);
                msgLabel.setText("Error : Username Exists!!!");
                msgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/alert-bad.gif")));
                msgLabel.setForeground(Color.red);
                usernameTxt.setText("");
                return;
            }
        }
        //populateEmpTable();
        //resetFields();
        resetFields();
        returnToHome();
        //populateEmpTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetFields() {
        nameJTextField.setText("");
        mobileJTextfield.setText("");
        //emailIdTxt.setText("");
        //addresstxt.setText("");
        usernameTxt.setText("");
        pswdField.setText("");
        confirmPswdField.setText("");
        //enableDisableComponents(false);
    }

    private void hospitalEnterpriseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hospitalEnterpriseItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_hospitalEnterpriseItemStateChanged

    private void hospitalEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalEnterpriseActionPerformed
        // TODO add your handling code here:

        if (null != hospitalEnterprise.getSelectedItem()) {
            populateOrganizations();
        }

    }//GEN-LAST:event_hospitalEnterpriseActionPerformed

    private void cityNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameComboActionPerformed
        // TODO add your handling code here:
        if (cityNameCombo.getSelectedItem() != null) {
            populateHospitalComboBox();

        }
    }//GEN-LAST:event_cityNameComboActionPerformed

    private void nameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJTextFieldFocusLost
        // TODO add your handling code here:
        if (UIUtilities.isEmpty(nameJTextField)) {
            nameJTextField.setText("");
            nameJTextField.setBackground(Color.yellow);
            //evt.consume();
            msgLabel.setVisible(true);
            msgLabel.setText("Error : Name field is empty");
        } else {
            nameJTextField.setBackground(Color.white);
            msgLabel.setVisible(false);

        }
    }//GEN-LAST:event_nameJTextFieldFocusLost

    private void mobileJTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileJTextfieldFocusLost
        // TODO add your handling code here:
        if (UIUtilities.isEmpty(mobileJTextfield)) {
            mobileJTextfield.setText("");
            mobileJTextfield.setBackground(Color.yellow);
            //evt.consume();
            msgLabel.setVisible(true);
            msgLabel.setText("Error : Mobile Num field is empty");
        } else {
            mobileJTextfield.setBackground(Color.white);
            msgLabel.setVisible(false);

        }
    }//GEN-LAST:event_mobileJTextfieldFocusLost

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        // TODO add your handling code here:
        if (UIUtilities.isEmpty(usernameTxt)) {
            usernameTxt.setText("");
            usernameTxt.setBackground(Color.yellow);
            //evt.consume();
            msgLabel.setVisible(true);
            msgLabel.setText("Error : User Name field is empty");
        } else {
            usernameTxt.setBackground(Color.white);
            msgLabel.setVisible(false);

        }

    }//GEN-LAST:event_usernameTxtFocusLost

    private void pswdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswdFieldFocusLost
        // TODO add your handling code here:
        if (UIUtilities.isEmpty(pswdField)) {
            pswdField.setText("");
            pswdField.setBackground(Color.yellow);
            //evt.consume();
            msgLabel.setVisible(true);
            msgLabel.setText("Error : Password field is empty");
        } else {
            pswdField.setBackground(Color.white);
            msgLabel.setVisible(false);

        }

    }//GEN-LAST:event_pswdFieldFocusLost

    private void nameJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyTyped
        // TODO add your handling code here:
        UIUtilities.restrictAlphabetinTxtFields(evt);
    }//GEN-LAST:event_nameJTextFieldKeyTyped

    private void usernameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_usernameTxtKeyTyped
    public void returnToHome() {
        userProcessContainer.removeAll();
        LoginPanel panel = new LoginPanel(system, userProcessContainer, dB4OUtil);
        userProcessContainer.add("LoginPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JComboBox cityNameCombo;
    private javax.swing.JPasswordField confirmPswdField;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel detailsPanel1;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JComboBox hospitalEnterprise;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JFormattedTextField mobileJTextfield;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JPasswordField pswdField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
