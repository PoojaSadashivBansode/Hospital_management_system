package hospitalmanagement;
import hospitalmanagement.*;
import javax.swing.*;
import java.awt.event.*;
public class MainFrame extends javax.swing.JFrame 
{
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("LIFELINE  HOSPITAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 374, 32));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 6, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 37));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Receptionist");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 37));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 130, 39));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Lab Technician");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, 39));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Pharmacist");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, 39));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/file.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoctorFrame doctorFrame = new DoctorFrame();
        doctorFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ReceptionistFrame recFrame = new ReceptionistFrame();
        recFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AdminFrame adFrame = new AdminFrame();
        adFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        labportal ltFrame = new labportal();
        ltFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Pharmacistportal phFrame = new Pharmacistportal();
        phFrame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

/*public class MainFrame extends JFrame
{
    public MainFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create buttons for each section
        JButton patientButton = new JButton("Patients");
        JButton appointmentButton = new JButton("Appointments");
        JButton doctorButton = new JButton("Doctors");
        JButton billingButton = new JButton("Billing");
        JButton pharmacyButton = new JButton("Pharmacy");
        JButton labReportButton = new JButton("Lab Test Reports");
        
        // Set button positions
        patientButton.setBounds(100, 50, 200, 30);
        appointmentButton.setBounds(100, 90, 200, 30);
        doctorButton.setBounds(100, 130, 200, 30);
        billingButton.setBounds(100, 170, 200, 30);
        pharmacyButton.setBounds(100, 210, 200, 30);
        labReportButton.setBounds(100, 250, 200, 30);
        
        // Add buttons to the frame
        add(patientButton);
        add(appointmentButton);
        add(doctorButton);
        add(billingButton);
        add(pharmacyButton);
        add(labReportButton);
        
        // Add action listeners to the buttons
        patientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPatientFrame();
            }
        });
        
        appointmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAppointmentFrame();
            }
        });
        
        doctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDoctorFrame();
            }
        });
        
        billingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openBillingFrame();
            }
        });
        
        pharmacyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPharmacyFrame();
            }
        });
        
        labReportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLabTestReportFrame();
            }
        });
        
        // Make the frame visible
        setVisible(true);
    }
    
    // Methods to open respective frames
    private void openPatientFrame() {
        new PatientFrame().setVisible(true);
    }

    private void openAppointmentFrame() {
        new AppointmentFrame().setVisible(true);
    }

    private void openDoctorFrame() {
        new DoctorFrame().setVisible(true);
    }

    private void openBillingFrame() {
        new BillingFrame().setVisible(true);
    }

    private void openPharmacyFrame() {
        new PharmacyFrame().setVisible(true);
    }

    private void openLabTestReportFrame() {
        new LabTestReportFrame().setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}
*/