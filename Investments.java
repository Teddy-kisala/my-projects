
import javax.swing.*;

public class Investments extends JFrame {
// declarations 

    String[] investmenttypes = {" ", "Aggressive", "Moderate"};
    double intRate = 0;

    String choosenItem = null;

    public Investments() {
        setTitle("Investment calculator");

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        termsGroup = new ButtonGroup();
        jLabelCustomerName = new javax.swing.JLabel();
        jTextFieldNameInput = new javax.swing.JTextField();
        jLabelAmount = new javax.swing.JLabel();
        jTextFieldAmountInput = new javax.swing.JTextField();
        jLabelSelection = new javax.swing.JLabel();
        jComboBoxInvestmentTypes = new JComboBox();
        jLabelTermSelection = new javax.swing.JLabel();
        jRadioButtonFiveYears = new javax.swing.JRadioButton();
        jRadioButton10years = new javax.swing.JRadioButton();
        jRadioButton15yeras = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuExit = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCalculate = new javax.swing.JMenuItem();
        jMenuItemClear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        jLabelCustomerName.setForeground(new java.awt.Color(0, 102, 102));
        jLabelCustomerName.setText("Customer Name: ");

        jLabelAmount.setForeground(new java.awt.Color(0, 153, 153));
        jLabelAmount.setText("Enter Amount");

        jLabelSelection.setForeground(new java.awt.Color(0, 153, 153));
        jLabelSelection.setText("Select Type");

        jComboBoxInvestmentTypes.setModel(new DefaultComboBoxModel(investmenttypes));
        jComboBoxInvestmentTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInvestmentTypesActionPerformed(evt);
            }
        });

        jLabelTermSelection.setForeground(new java.awt.Color(0, 153, 153));
        jLabelTermSelection.setText("Select term");

        termsGroup.add(jRadioButtonFiveYears);
        jRadioButtonFiveYears.setText("5 years");
        jRadioButtonFiveYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFiveYearsActionPerformed(evt);
            }
        });

        termsGroup.add(jRadioButton10years);
        jRadioButton10years.setText("10 years");

        termsGroup.add(jRadioButton15yeras);
        jRadioButton15yeras.setText("15 years");

        jMenuExit.setText("File");

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuExit.add(jMenuItemExit);

        jMenuBar1.add(jMenuExit);

        jMenu2.setText("Edit");

        jMenuItemCalculate.setText("Calculate");
        jMenuItemCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCalculateActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCalculate);

        jMenuItemClear.setText("Clear");
        jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemClear);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabelSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTermSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton15yeras)
                            .addComponent(jRadioButton10years))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxInvestmentTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonFiveYears, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 175, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jTextFieldAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelection)
                    .addComponent(jComboBoxInvestmentTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTermSelection)
                    .addComponent(jRadioButtonFiveYears))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton10years)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton15yeras)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//add actions to exit button
    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed

        Object source = evt.getSource();
        if (source == jMenuItemExit) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenuItemExitActionPerformed
// add action to calculate button
    private void jMenuItemCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalculateActionPerformed

        Object source = evt.getSource();
        String name = null;
        double InterestAmount = 0;
        double totalAmount = 0;
        double months = 0;
        double Interest = 0;

        if (source == jMenuItemCalculate) {

            name = jTextFieldNameInput.getText();
            choosenItem = (String) jComboBoxInvestmentTypes.getSelectedItem(); // gets the selected item from combo box
            InterestAmount = Double.parseDouble(jTextFieldAmountInput.getText()); //converts input to int
           
            jRadioButtonFiveYears.setActionCommand("5");
            jRadioButton10years.setActionCommand("10 ");
            jRadioButton15yeras.setActionCommand("15 ");

//            if (evt.getActionCommand().equals(jRadioButtonFiveYears) & evt.getActionCommand().equals(jRadioButton10years)
//                    & evt.getActionCommand().equals(jRadioButton15yeras)) {
//
//            }
            if (jComboBoxInvestmentTypes.getSelectedItem().equals("Aggressive")) {
                intRate = 0.15;//sets interest rate if the aggresive option is selected
            } else if (jComboBoxInvestmentTypes.getSelectedItem().equals("Moderate")) {
                intRate = 0.10; // sets rate if moderate option is selected
            }
            if (jRadioButtonFiveYears.isSelected()) { // sets valuees to terms to be calculated
                months = 60; 

            } else if (jRadioButton10years.isSelected()) {
                months = 120;
            } else if (jRadioButton15yeras.isSelected()) {
                months = 180;
            }
            //A = p * Math.pow(1 + (r / n), n * t); (formular to calculate compount interest
            totalAmount = InterestAmount * Math.pow(1 + (intRate / 12), months);
            Interest = totalAmount - InterestAmount;

        }
        //print out report

        JOptionPane.showMessageDialog(null, "Investment Report" + "\n" + "\n" + "customer name: " + name + "\n"
                + "Original Amount: R " + InterestAmount + "\n"
                + "Years Invested: " + termsGroup.getSelection().getActionCommand() + "\n" + "Total Amount: R " +Math.round( Interest));
    }//GEN-LAST:event_jMenuItemCalculateActionPerformed

    private void jMenuItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClearActionPerformed
// sets actions for clear button
        Object source = evt.getSource();
        if (source == jMenuItemClear) {
            jTextFieldNameInput.setText("");
            jTextFieldAmountInput.setText("");
            jComboBoxInvestmentTypes.setSelectedIndex(0);
            termsGroup.clearSelection();

        }

    }//GEN-LAST:event_jMenuItemClearActionPerformed

    private void jRadioButtonFiveYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFiveYearsActionPerformed

    }//GEN-LAST:event_jRadioButtonFiveYearsActionPerformed

    private void jComboBoxInvestmentTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInvestmentTypesActionPerformed


    }//GEN-LAST:event_jComboBoxInvestmentTypesActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Investments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Investments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Investments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Investments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Investments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxInvestmentTypes;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelSelection;
    private javax.swing.JLabel jLabelTermSelection;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuItemCalculate;
    private javax.swing.JMenuItem jMenuItemClear;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JRadioButton jRadioButton10years;
    private javax.swing.JRadioButton jRadioButton15yeras;
    private javax.swing.JRadioButton jRadioButtonFiveYears;
    private javax.swing.JTextField jTextFieldAmountInput;
    private javax.swing.JTextField jTextFieldNameInput;
    private javax.swing.ButtonGroup termsGroup;
    // End of variables declaration//GEN-END:variables
}
