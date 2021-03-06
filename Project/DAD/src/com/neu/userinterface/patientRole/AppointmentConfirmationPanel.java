/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.patientRole;

import com.neu.business.EcoSystem;
import com.neu.business.employee.Employee;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.userAccount.UserAccount;
import com.neu.business.workQueue.AppointmentRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AppointmentConfirmationPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Employee doctor;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AppointmentRequest appointmentRequest;
    private MakeAnAppointmentPanel makeAnAppointmentPanel;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public AppointmentConfirmationPanel(JPanel userProcessContainer, EcoSystem system,
            Enterprise enterprise, Employee doctor, UserAccount ua, AppointmentRequest appointmentRequest,
            MakeAnAppointmentPanel makeAnAppointmentPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.doctor = doctor;
        this.userAccount = ua;
        this.enterprise = enterprise;
        this.appointmentRequest = appointmentRequest;
        this.makeAnAppointmentPanel = makeAnAppointmentPanel;
        docName.setText(doctor.getName());
        speciality.setText(doctor.getSpeciality());
        initData();
    }

    public void enableDisableComponents(boolean morningFlag, boolean afternoonFlag,
            boolean eveningFlag, String capacity) {
    }

    private void initData() {
        requestId.setText("<html><b>Request Id:</b> " + appointmentRequest.getRequestId() + " </html>");
        requestMessage.setText("<html><b>Requestor Name:</b> "
                + appointmentRequest.getSender().getPatients().getName() + " </html>");
        //appointmentRequest.getStatus();
        selectedAppointment.setText("Selected Slot:" + appointmentRequest.getAppointmentSlot());
        msgLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        speciality = new javax.swing.JLabel();
        docName = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        selectedAppointment = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        requestMessage = new javax.swing.JLabel();
        requestId = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        setBorder(dropShadowBorder1);
        setPreferredSize(new java.awt.Dimension(418, 537));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());

        speciality.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        speciality.setText("jLabel2");
        jPanel2.add(speciality);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 40));

        docName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        docName.setText("jLabel1");
        add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        confirmBtn.setText("Confirm Appointment");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 410, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectedAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectedAppointment.setForeground(new java.awt.Color(255, 51, 51));
        selectedAppointment.setText("jLabel1");
        jPanel1.add(selectedAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 290, 40));

        msgLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msgLabel.setText("jLabel1");
        jPanel1.add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        requestMessage.setText("jLabel1");
        jPanel1.add(requestMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, -1));

        requestId.setText("jLabel1");
        jPanel1.add(requestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 220));

        cancelBtn.setText("Cancel Appointment");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 410, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imgs/Arrow-Back-3-icon.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 410, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        appointmentRequest.setStatus("Requested");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            //org.getWorkQueue().getWorkRequestList().add(appointmentRequest);
            org.getUserAccountDirectory().searchUserAccount(doctor).getWorkQueue().getWorkRequestList().add(appointmentRequest);
            //userAccount.getWorkQueue().getWorkRequestList().add(appointmentRequest);
            UserAccount receiverUserAccount = org.getUserAccountDirectory().searchUserAccount(doctor);
            appointmentRequest.setReceiver(receiverUserAccount);
            msgLabel.setVisible(true);
            msgLabel.setText("Appointment Placed Successsfully!!");
            this.setBackground(new Color(122, 182, 128));
            cancelBtn.setEnabled(false);
            String mobNum = userAccount.getPatients().getMobileNum();
            //try{
            CallMessageUtility.sendMessage("+1" + mobNum, "Dear Customer,Appointment has been placed!!");
            
        }

        //populateRequestTable();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        appointmentRequest.setStatus("Requested Appointment cancelled");
        appointmentRequest.setMessage("Cancelled from the System");
        msgLabel.setVisible(true);
        msgLabel.setText("Appointment Placed Successsfully!!");
        this.setBackground(new Color(255, 182, 173));
        confirmBtn.setEnabled(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        makeAnAppointmentPanel.populateRequestTable();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel docName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel requestId;
    private javax.swing.JLabel requestMessage;
    private javax.swing.JLabel selectedAppointment;
    private javax.swing.JLabel speciality;
    // End of variables declaration//GEN-END:variables
}
