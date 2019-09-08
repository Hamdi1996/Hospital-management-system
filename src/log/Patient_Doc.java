/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 7_amdi
 */
public class Patient_Doc extends javax.swing.JFrame {

    /**
     * Creates new form Patient_Doc
     */
    Connection con=null;
     PreparedStatement pst=null;
     ResultSet rest=null;
    public Patient_Doc() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
      this.setResizable(false);
      con=conn.connect();
    this.tabel();
    }

    
    
    
    
     public void tabel(){
    try{
    String select="SELECT * FROM hospital.patient_doctor";
    pst=con.prepareStatement(select);
    rest=pst.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rest));
    
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this, e);
    }
    finally{ 
        try {
            rest.close();
        } catch (SQLException ex) {
            Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iddoc = new javax.swing.JTextField();
        idpat = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ID_Doctor :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 160, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID_Patient :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 110, 130, 30);
        jPanel1.add(iddoc);
        iddoc.setBounds(230, 160, 210, 40);
        jPanel1.add(idpat);
        idpat.setBounds(230, 110, 210, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/Button-Add-icon.png"))); // NOI18N
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 600, 150, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/Button-Close-icon.png"))); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 600, 150, 80);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/Actions-edit-redo-icon.png000.png"))); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(210, 600, 190, 80);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/Button-Close-icon.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(420, 600, 180, 80);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/Go-back-icon.png"))); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(620, 600, 160, 80);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(600, 30, 320, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\7_amdi\\Downloads\\New Folder\\search-button-icon.png")); // NOI18N
        jLabel6.setText("Search ID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 30, 120, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Patient", "ID_Doctor"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 90, 452, 402);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/dentist-pain-borowac-cure-52527.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 980, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         try{
       String add="INSERT INTO `hospital`.`patient_doctor` (`ID_Patient`,`ID_Doctor`) VALUES('"+idpat.getText()+"','"+iddoc.getText()+"')";
       pst =con.prepareStatement(add);
       pst.execute();
       idpat.setText("");
       iddoc.setText("");
        
          }
   catch(Exception e){
       JOptionPane.showMessageDialog(this, e);
       
   } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            String updat="update hospital.patient_doctor set ID_Patient=? , ID_Doctor=? where ID_Doctor='"+iddoc.getText()+"';";
            pst=con.prepareStatement(updat);
            pst.setString(1, idpat.getText());
            pst.setString(2, iddoc.getText());
           
            pst.execute();
            iddoc.setText("");
            idpat.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        finally{
            try {
                rest.close();
            } catch (SQLException ex) {
                Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);

            }
            this.tabel();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try{
            String del="delete from hospital.patient_doctor where ID_Patient=?";
            pst=con.prepareStatement(del);
            pst.setString(1, idpat.getText());

            pst.execute();
            idpat.setText("");
            iddoc.setText("");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        finally{
            try {
                rest.close();
            } catch (SQLException ex) {
                Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);

            }
            this.tabel();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new form3().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased

        if(jTextField5.getText().equals("")){
            this.tabel();
            iddoc.setText("");
            idpat.setText("");
        }
        else
        try{
            String scan="select *  FROM hospital.patient_doctor where ID_Doctor=?";
            pst=con.prepareStatement(scan);
            pst.setString(1, jTextField5.getText());

            rest =pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rest));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        finally{
            try {
                rest.close();
            } catch (SQLException ex) {
                Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);

            }
            //  this.tabel();
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try{
            int row =jTable1.getSelectedRow();
            String clk=(jTable1.getModel().getValueAt(row, 0).toString());
            String excut="SELECT * FROM hospital.patient_doctor where ID_Doctor='"+clk+"'";
            pst=con.prepareStatement(excut);
            rest=pst.executeQuery();
            if(rest.next())
            {String add=rest.getString("ID_Doctor");
                iddoc.setText(add);
                String add1=rest.getString("ID_Patient");
                idpat.setText(add1);
                
            }

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Patient_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField iddoc;
    private javax.swing.JTextField idpat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
