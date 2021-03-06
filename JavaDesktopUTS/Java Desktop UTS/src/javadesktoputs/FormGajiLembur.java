/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesktoputs;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arief PC's
 */
public class FormGajiLembur extends javax.swing.JFrame {
    private DefaultTableModel table;
    /**
     * Creates new form FormGajiLembur
     */
    public FormGajiLembur() {
        initComponents();
        setTitle("Form Penggajian Lembur Karyawan");
        setLocationRelativeTo(null);
        String[] data = {"IdLembur","IdKaryawan","JamLembur","GajiLembur"};
        table = new DefaultTableModel (data,0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
          
        };
        tblGajiLembur.setModel(table);
        tampil();
        combobox();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdLembur = new javax.swing.JTextField();
        txtJamLembur = new javax.swing.JTextField();
        txtGajiLembur = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGajiLembur = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("FORM GAJI LEMBUR");

        jLabel2.setText("ID Lembur");

        jLabel3.setText("ID Karyawan");

        jLabel4.setText("Waktu Lembur (per Jam)");

        jLabel5.setText("Gaji Lembur");

        txtJamLembur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJamLemburKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Save_1.png"))); // NOI18N
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Edit.png"))); // NOI18N
        jButton3.setText("Ubah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Prohibit.png"))); // NOI18N
        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Login_out.png"))); // NOI18N
        jButton6.setText("Kembali");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tblGajiLembur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Lembur", "ID Karyawan", "Jam Lembur", "Gaji Lembur"
            }
        ));
        tblGajiLembur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGajiLemburMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGajiLembur);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Home.png"))); // NOI18N
        jButton1.setText("Menuju Ke Form Selanjutnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel6.setText("Per Jam Lembur = 50000");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Shoppingcart.png"))); // NOI18N
        jButton5.setText("Hitung");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtJamLembur, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtGajiLembur)
                                            .addComponent(txtIdLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJamLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGajiLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton5, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FormGaji().show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin kembali ke form karyawan?");
        if (result == JOptionPane.YES_NO_OPTION){
            new FormKaryawan().show();
            dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String IdKaryawan = jComboBox1.getSelectedItem().toString();
        try {
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            koneksi.createStatement().executeUpdate("insert into tabelGajiLembur values('"+txtIdLembur.getText()+"','"+IdKaryawan+"','"+txtJamLembur.getText()+"','"+txtGajiLembur.getText()+"')");
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Simpan!");
            tampil();
            bersih();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblGajiLemburMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGajiLemburMouseClicked
        int i = tblGajiLembur.getSelectedRow();
        if(i>=0){
            txtIdLembur.setText(table.getValueAt(i,0).toString());
            txtJamLembur.setText(table.getValueAt(i,2).toString());
            txtGajiLembur.setText(table.getValueAt(i,3).toString());
        }
    }//GEN-LAST:event_tblGajiLemburMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String IdKaryawan = jComboBox1.getSelectedItem().toString();
        try {
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            koneksi.createStatement().executeUpdate("update tabelGajiLembur set IdKaryawan='"+IdKaryawan+"', JamLembur='"+txtJamLembur.getText()+"', GajiLembur='"+txtGajiLembur.getText()+"' where IdLembur='"+txtIdLembur.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Ubah!");
            tampil();
            bersih();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?","Delete",JOptionPane.YES_NO_OPTION);
        if (a==0){
            try {
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
                koneksi.createStatement().executeUpdate("delete from tabelGajiLembur where IdLembur='"+txtIdLembur.getText()+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Hapus!");
                tampil();
                bersih();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtJamLemburKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJamLemburKeyPressed
        int jam,gaji;
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         jam = Integer.parseInt(txtJamLembur.getText());
         gaji = jam * 50000;
         txtGajiLembur.setText(Integer.toString(gaji));
       }
    }//GEN-LAST:event_txtJamLemburKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int jam,gaji;
         jam = Integer.parseInt(txtJamLembur.getText());
         gaji = jam * 50000;
         txtGajiLembur.setText(Integer.toString(gaji));
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FormGajiLembur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGajiLembur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGajiLembur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGajiLembur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGajiLembur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGajiLembur;
    private javax.swing.JTextField txtGajiLembur;
    private javax.swing.JTextField txtIdLembur;
    private javax.swing.JTextField txtJamLembur;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        try{
            int row = tblGajiLembur.getRowCount();
            for(int i=0; i<row; i++){
                table.removeRow(0);
            }
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select * from tabelGajiLembur");
            while(dst.next()){
                String[] data = {dst.getString(1), dst.getString(2), dst.getString(3), dst.getString(4)};
                table.addRow(data);
            }
        } catch (SQLException ex){
            
        }
    }
    
    private void bersih() {
        txtIdLembur.setText("");
        txtGajiLembur.setText("");
        txtJamLembur.setText("");
        txtGajiLembur.setText("");
    }
    
    private void combobox(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select idKaryawan from tabelKaryawan");
            while(dst.next()){
                String idKaryawan = dst.getString("idKaryawan");
                jComboBox1.addItem(idKaryawan);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
}
