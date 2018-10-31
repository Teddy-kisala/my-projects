
import java.awt.event.*;
import javax.swing.*;

public class NewJFrame extends JFrame {

    final int balance = 1000;
    int totalBalance;
   // int newBalance = 0;
    int deduction =balance;
    int newBalance=0;
    Integer[] Amounts = {10, 100, 1000};

    public NewJFrame() {
        setTitle("ATM Simulator");
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

        jTextField1 = new javax.swing.JTextField();
        jCheckBoxBalance = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxWithdrawals = new javax.swing.JCheckBox();
        jCheckBoxDeposit = new javax.swing.JCheckBox();
        Message = new javax.swing.JTextField();
        jComboBoxOptions = new JComboBox();
        DisplayBalance = new javax.swing.JLabel();
        deposit = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        newAmounttxt = new javax.swing.JTextField();
        balancetxt = new javax.swing.JTextField();
        jButtoneENTER = new javax.swing.JButton();
        jButtonCANCEL = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBoxBalance.setText("Balance");
        jCheckBoxBalance.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxBalanceItemStateChanged(evt);
            }
        });

        jLabel1.setText("                           FIRST NATIONAL TEDDY  BANK  SELF SERVICE ATM");

        jCheckBoxWithdrawals.setText("Withdraw");
        jCheckBoxWithdrawals.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxWithdrawalsItemStateChanged(evt);
            }
        });

        jCheckBoxDeposit.setText("Deposit");
        jCheckBoxDeposit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxDepositItemStateChanged(evt);
            }
        });

        Message.setEditable(false);
        Message.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 102)));

        jComboBoxOptions.setModel(new DefaultComboBoxModel(Amounts));
        jComboBoxOptions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOptionsItemStateChanged(evt);
            }
        });

        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        jButton.setText("deposit");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        newAmounttxt.setEditable(false);
        newAmounttxt.setBackground(new java.awt.Color(204, 255, 255));

        balancetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balancetxtActionPerformed(evt);
            }
        });

        jButtoneENTER.setBackground(new java.awt.Color(0, 102, 51));
        jButtoneENTER.setForeground(new java.awt.Color(0, 204, 204));
        jButtoneENTER.setText("Enter");
        jButtoneENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneENTERActionPerformed(evt);
            }
        });

        jButtonCANCEL.setBackground(new java.awt.Color(0, 51, 0));
        jButtonCANCEL.setForeground(new java.awt.Color(0, 204, 204));
        jButtonCANCEL.setText("Cancel");
        jButtonCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCANCELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DisplayBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtoneENTER)
                                .addGap(105, 105, 105)
                                .addComponent(jButtonCANCEL))
                            .addComponent(jCheckBoxDeposit)
                            .addComponent(jCheckBoxBalance)
                            .addComponent(jCheckBoxWithdrawals)
                            .addComponent(jComboBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAmounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(balancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoneENTER)
                    .addComponent(jButtonCANCEL))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxWithdrawals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(DisplayBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDeposit)
                .addGap(18, 18, 18)
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newAmounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxBalanceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxBalanceItemStateChanged
        // TODO add your handling code here:
        Object source = evt.getSource();
        int select = evt.getStateChange();

        if (source == jCheckBoxBalance) {
            if (select == ItemEvent.SELECTED) {
                totalBalance = balance;
            }
            balancetxt.setText(" Available balance is R" + totalBalance);
        }
    }//GEN-LAST:event_jCheckBoxBalanceItemStateChanged

    private void jCheckBoxWithdrawalsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxWithdrawalsItemStateChanged
        // TODO add your handling code here:
        Object source = evt.getSource();
        int select = evt.getStateChange();

        if (source == jCheckBoxWithdrawals) {
            //Integer chosenAmount = (Integer) jComboBoxoptions.getSelectedItem();

            if (select == ItemEvent.SELECTED) {

                Message.setText("Choose the Amount the you want to withdraw From the drop box below");
            }
        }
    }//GEN-LAST:event_jCheckBoxWithdrawalsItemStateChanged

    private void jComboBoxOptionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOptionsItemStateChanged
        // TODO add your handling code here:
        Integer choosenAmount = (Integer) jComboBoxOptions.getSelectedItem();
          newBalance = deduction- (choosenAmount);

        if (choosenAmount >= balance) {
           
            JOptionPane.showMessageDialog(null, "insufficient funds");
        } else {
           // jTextField2.setText("you have with drawn R" + choosenAmount + " Remaining Balance is R" + newBalance);
           JOptionPane.showMessageDialog(null, "you have withddrawn R" + choosenAmount + " Remaining Balance is " + newBalance);
        }
    }//GEN-LAST:event_jComboBoxOptionsItemStateChanged

    private void jCheckBoxDepositItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxDepositItemStateChanged
        // TODO add your handling code here:
        Object source = evt.getSource();
        int select = evt.getStateChange();

        if (source == jCheckBoxDeposit) {
            if (select == ItemEvent.SELECTED) {

                //deposit.setText("");
            }
        }

    }//GEN-LAST:event_jCheckBoxDepositItemStateChanged

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        int NewAmount;
        int Deposit = Integer.parseInt(deposit.getText());
        if (source == jButton) {
            String amount = deposit.getText();
            NewAmount = Deposit + newBalance;
            newAmounttxt.setText("new balance is R" + NewAmount);
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void balancetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balancetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balancetxtActionPerformed

    private void jButtonCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCANCELActionPerformed
        // TODO add your handling code here:
         Object source = evt.getSource();
//       

        if (source == jButtonCANCEL) {
            System.exit(0);
        }
         
    }//GEN-LAST:event_jButtonCANCELActionPerformed

    private void jButtoneENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneENTERActionPerformed
        // TODO add your handling code here:
         Object source = evt.getSource();
        
        if (source==jButtoneENTER){
            JOptionPane.showMessageDialog(null,"WELCOME TO FIRST NATIONAL TEDDY BANK SELF SERVICE !!");
        }
    }//GEN-LAST:event_jButtoneENTERActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositActionPerformed

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
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisplayBalance;
    private javax.swing.JTextField Message;
    private javax.swing.JTextField balancetxt;
    private javax.swing.JTextField deposit;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButtonCANCEL;
    private javax.swing.JButton jButtoneENTER;
    private javax.swing.JCheckBox jCheckBoxBalance;
    private javax.swing.JCheckBox jCheckBoxDeposit;
    private javax.swing.JCheckBox jCheckBoxWithdrawals;
    private javax.swing.JComboBox<String> jComboBoxOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField newAmounttxt;
    // End of variables declaration//GEN-END:variables
}
