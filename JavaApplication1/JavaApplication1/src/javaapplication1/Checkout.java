/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Emad
 */
public class Checkout extends javax.swing.JFrame {

    User u = new User();

    public Checkout() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Checkout(User u) {
        initComponents();
        this.u = u;
        txtresid.setText(String.valueOf(u.getReservedUserID(u.username)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtresid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtehours = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CHECKOUT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("RESERVATION ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 110, 16);
        getContentPane().add(txtresid);
        txtresid.setBounds(150, 80, 153, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("EXIT HOURS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 80, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(" TOTAL AMOUNT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 100, 20);

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal);
        txttotal.setBounds(150, 230, 153, 30);

        btnnext.setBackground(new java.awt.Color(153, 153, 255));
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setText("Checkout");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext);
        btnnext.setBounds(290, 310, 90, 23);

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(10, 310, 90, 23);

        txtehours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtehoursMouseExited(evt);
            }
        });
        txtehours.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtehoursInputMethodTextChanged(evt);
            }
        });
        getContentPane().add(txtehours);
        txtehours.setBounds(150, 160, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/checkout.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

        u.checkout(Integer.parseInt(u.userid), Integer.parseInt(txtresid.getText()),
                txtehours.getText(), Float.parseFloat(txttotal.getText()));

    }//GEN-LAST:event_btnnextActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        userd ud = new userd(u);
        ud.setVisible(true);

        //        userd ud = new userd(u);
        //        this.setVisible(false);
        //        ud.setVisible(true);
        //        String uname = txtusername.getText();
        //        boolean b = bk.userdisplay(uname);
        //            txtname.setText(bk.name);
        //            txtaddress.setText(bk.add);
        //            txtno.setText(bk.pn);
        //            txtemail.setText(bk.em);
        //            JOptionPane.showMessageDialog(null, "USER DISPLAYED");
        //            this.setVisible(false);
        //            userd ud = new userd();
        //            ud.setVisible(true);
        //        } else {
        //            JOptionPane.showMessageDialog(null, "ERROR");
        //        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtehoursInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtehoursInputMethodTextChanged
        
    }//GEN-LAST:event_txtehoursInputMethodTextChanged

    private void txtehoursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtehoursMouseExited
       txttotal.setText(Float.toString(u.getTotalAmount(txtehours.getText(), Integer.parseInt(txtehours.getText()))));
    }//GEN-LAST:event_txtehoursMouseExited

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        {
//            public void run() {
//                new userdisplayadm().setVisible(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtehours;
    private javax.swing.JTextField txtresid;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
