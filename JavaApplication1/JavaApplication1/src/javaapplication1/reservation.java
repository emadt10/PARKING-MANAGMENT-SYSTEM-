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
public class reservation extends javax.swing.JFrame {

//    bookfn bb=new bookfn();
//    bookfn b = new bookfn();
//    ArrayList<user> User = b.displayuser();
//    int i=0;
    public reservation() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Reservation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 11, 120, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("UserId");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 55, 54, 15);
        getContentPane().add(txtname);
        txtname.setBounds(107, 52, 153, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Vehicle No");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 101, 70, 15);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(107, 98, 153, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Status");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 65, 15);
        getContentPane().add(txtno);
        txtno.setBounds(107, 144, 153, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 203, 53, 15);
        getContentPane().add(txtemail);
        txtemail.setBounds(107, 200, 153, 30);

        btnnext.setBackground(new java.awt.Color(153, 153, 255));
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setText("Back");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext);
        btnnext.setBounds(310, 252, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
//        boolean b=bb.displayuser();
//        if(b)
//        {
//            txtname.setText(bb.name);
//            txtaddress.setText(bb.add);
//            txtno.setText(bb.pn);
//            txtemail.setText(bb.em);
//            
//        }
//        else
//        {
//            JOptionPane.showConfirmDialog(null, "Error");
//        }
//      if (i==User.size())
//        {
//            JOptionPane.showMessageDialog(null, "All User Displayed!");
//            this.setVisible(false);
//            libf lf=new libf();
//            lf.setVisible(true);
//        }
//        else
//        {
//        user uobj = User.get(i);
//        txtname.setText(uobj.getName());
//        txtaddress.setText(uobj.getAddress());
//        txtno.setText(uobj.getPhoneno());
//        txtemail.setText(uobj.getEmail());
//        
//        i=i+1;
//        
//        }        
    }//GEN-LAST:event_btnnextActionPerformed

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
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables

}