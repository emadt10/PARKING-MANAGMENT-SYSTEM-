/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Emad
 */
public class Request extends javax.swing.JFrame {

//    ArrayList<Book> bList;
//    bookfn b = new bookfn();
    User u;
    userd ud;
    /**
     * Creates new form issueBook
     */
    public Request(User u) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.u = u;
        txtuid.setText(u.userid);
        
    }
    
    
    public void setComboboxData() {
//        Book bk = new Book();
//        for (int i = 0; i < bList.size(); i++) {
//            bk = bList.get(i);
//            titlecb.addItem(bk.getTitle());
        }
    

    public Request() {
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

        jLabel7 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        btnissue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuid = new javax.swing.JTextField();
        cbcat = new javax.swing.JComboBox<>();
        txtlic = new javax.swing.JTextField();
        txtlotid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtspaceid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 320));
        getContentPane().setLayout(null);

        btnclose.setBackground(new java.awt.Color(51, 0, 255));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose);
        btnclose.setBounds(350, 250, 100, 23);

        btnissue.setBackground(new java.awt.Color(51, 51, 255));
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("REQUEST");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue);
        btnissue.setBounds(200, 250, 100, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("  REQUEST PARKING");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 20, 220, 42);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Subscription");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("User ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 110, 80, 10);

        txtuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuidActionPerformed(evt);
            }
        });
        getContentPane().add(txtuid);
        txtuid.setBounds(440, 100, 150, 30);

        cbcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silver", "Gold", "Platinum" }));
        cbcat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbcatItemStateChanged(evt);
            }
        });
        cbcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcatActionPerformed(evt);
            }
        });
        getContentPane().add(cbcat);
        cbcat.setBounds(120, 110, 170, 22);
        getContentPane().add(txtlic);
        txtlic.setBounds(440, 160, 150, 30);

        txtlotid.setEditable(false);
        getContentPane().add(txtlotid);
        txtlotid.setBounds(120, 160, 50, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Lot-ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 160, 50, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Space-ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 160, 60, 16);

        txtspaceid.setEditable(false);
        getContentPane().add(txtspaceid);
        txtspaceid.setBounds(240, 160, 50, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Liscence Plate");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 160, 80, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/requ.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 640, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
      this.setVisible(false);
        userd ud=new userd(u);
        ud.setVisible(true);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        u.requestParking(txtuid.getText(), txtlic.getText(), txtlotid.getText(), txtspaceid.getText());
       this.setVisible(false);
       ud= new userd(u);
       ud.setVisible(true);
    }//GEN-LAST:event_btnissueActionPerformed

    private void txtuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuidActionPerformed

    private void cbcatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcatItemStateChanged
       int LotID = u.getLotBySub(cbcat.getSelectedItem().toString());
       txtlotid.setText(String.valueOf(LotID));
       int SpaceID= u.getAvailableSpaceID(LotID);
       txtspaceid.setText(String.valueOf(SpaceID));
    }//GEN-LAST:event_cbcatItemStateChanged

    private void cbcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcatActionPerformed

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
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnissue;
    private javax.swing.JComboBox<String> cbcat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtlic;
    private javax.swing.JTextField txtlotid;
    private javax.swing.JTextField txtspaceid;
    private javax.swing.JTextField txtuid;
    // End of variables declaration//GEN-END:variables
}
