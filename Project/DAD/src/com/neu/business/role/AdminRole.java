/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.DB4OUtil.DB4OUtil;
import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.organization.Organization;
import com.neu.business.userAccount.UserAccount;
import com.neu.userinterface.administrativeRole.AdminWorkAreaPanel;
//import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        return new AdminWorkAreaPanel(userProcessContainer,account, enterprise,dB4OUtil,business);
    }

}
