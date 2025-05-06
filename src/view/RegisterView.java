
package view;

import controller.UserController;
import java.util.Optional;
import javax.swing.JOptionPane;
import model.User;
import java.sql.SQLException;


public class RegisterView extends javax.swing.JFrame {

  
    public RegisterView() {
        initComponents();
        setLocationRelativeTo(null);
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        new LoginView().setVisible(true);  // open login
        dispose(); 
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        sginUp = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        Username2 = new javax.swing.JLabel();
        Username3 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        Username5 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Welcome back!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fullName.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20)));
        fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameActionPerformed(evt);
            }
        });

        email.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        sginUp.setBackground(new java.awt.Color(34, 40, 49));
        sginUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sginUp.setForeground(new java.awt.Color(255, 255, 255));
        sginUp.setText("SIGN UP");
        sginUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sginUpActionPerformed(evt);
            }
        });

        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        confirmPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jPanel2.setBackground(new java.awt.Color(49, 54, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Downloads\\Illustration.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CABIFY");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("C");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(118, 171, 174));
        jLabel9.setText("F");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("We analyze, you just need relax");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Create Account");

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username.setText("Fullname:");

        Username1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username1.setText("Email:");

        Username2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username2.setText("Password:");

        Username3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username3.setText("Confirm Password:");

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(118, 171, 174));
        loginLabel.setText("Login");

        Username5.setText("Already have an accoutn?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(confirmPass)
                                .addComponent(pass)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fullName)
                                .addComponent(sginUp, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(Username)
                            .addComponent(Username1)
                            .addComponent(Username2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Username5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Username)
                .addGap(0, 0, 0)
                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username1)
                .addGap(0, 0, 0)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Username2)
                .addGap(0, 0, 0)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Username3)
                .addGap(0, 0, 0)
                .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(Username5))
                .addGap(26, 26, 26)
                .addComponent(sginUp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameActionPerformed
        
    }//GEN-LAST:event_fullNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        
    }//GEN-LAST:event_emailActionPerformed
    private void registerUser(String name, String email, String password) {
             try {
                    UserController userController = new UserController();
                    Optional<User> registeredUser = userController.register(name, email, password);

                    if (registeredUser.isPresent()) {
                        JOptionPane.showMessageDialog(this, 
                            "Registration successful!\nWelcome " + name + "!", 
                            "Success", 
                            JOptionPane.INFORMATION_MESSAGE);

                        LoginView loginView = new LoginView();
                        loginView.setLocationRelativeTo(null);
                        loginView.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, 
                            "Registration failed. Email might already be in use.", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, 
                        "Database error occurred. Please try again.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    java.util.logging.Logger.getLogger(RegisterView.class.getName())
                        .log(java.util.logging.Level.SEVERE, "Database error during registration", e);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this, 
                        e.getMessage(), 
                        "Validation Error", 
                        JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, 
                        "An unexpected error occurred: " + e.getMessage(), 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    java.util.logging.Logger.getLogger(RegisterView.class.getName())
                        .log(java.util.logging.Level.SEVERE, "Unexpected error during registration", e);
                }
}
    private void sginUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sginUpActionPerformed
                String name = fullName.getText().trim();
                String emailInput = email.getText().trim();
                String password = new String(pass.getPassword());
                String confirmPassword = new String(confirmPass.getPassword());

                pass.setText("");
                confirmPass.setText("");

                 if (name.isEmpty() || emailInput.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "All fields are required!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
                }

                if (name.length() < 2) {
                JOptionPane.showMessageDialog(this, 
                    "Name must be at least 2 characters long!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!emailInput.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter a valid email address!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (password.length() < 8) {
                JOptionPane.showMessageDialog(this, 
                    "Password must be at least 8 characters long!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, 
                    "Passwords do not match!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Proceed with registration
            registerUser(name, emailInput, password);
    }//GEN-LAST:event_sginUpActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Username1;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel Username3;
    private javax.swing.JLabel Username5;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton sginUp;
    // End of variables declaration//GEN-END:variables

  

 

   
}
