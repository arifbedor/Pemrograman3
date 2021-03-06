/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesktoputs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arief PC's
 */
public class FormGaji extends javax.swing.JFrame {
    private DefaultTableModel table;
    public FormGaji() {
        initComponents();
        setTitle("Form Penggajian Karyawan");
        jButton6.setEnabled(false);
        setLocationRelativeTo(null);
        String[] data = {"IdGaji","IdKaryawan","NamaKaryawan","Jabatan","Bulan","Total","GajiLembur","GajiPokok","Total"};
        table = new DefaultTableModel (data,0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
          
        };
        tblDataGaji.setModel(table);
        tampil();
        combobox1();
        combobox2();
        combobox3();
        combobox4();
        combobox5();
        combobox6();
        combobox7();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdGaji = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotalGaji = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataGaji = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("FORM GAJI");

        jLabel2.setText("ID Gaji");

        jLabel3.setText("ID Karyawan");

        jLabel4.setText("Nama Karyawan");

        jLabel5.setText("Bulan");

        jLabel6.setText("Tahun");

        jLabel7.setText("Gaji Pokok");

        jLabel8.setText("Gaji Lembur");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel9.setText("TOTAL GAJI");

        txtTotalGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGajiActionPerformed(evt);
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
        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017" }));

        jLabel11.setText("Jabatan");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Shoppingcart.png"))); // NOI18N
        jButton7.setText("Hitung!");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tblDataGaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Gaji", "ID Karyawan", "Nama Karyawan", "Jabatan", "Gaji Pokok", "Bulan", "Tahun", "Gaji Lembur", "Total Gaji"
            }
        ));
        tblDataGaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataGajiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataGaji);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(165, 165, 165)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtTotalGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(jButton7)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalGaji)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(6, 6, 6))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton6});

        jTabbedPane1.addTab("Form Gaji", jPanel1);

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ARIEF RACHMAN NUGRAHA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("4513210008");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("NAMA : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("NPM :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("TUGAS UTS PEMROGRAMAN 3");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("MEMBUAT APLIKASI JAVA DESKTOP PENGGAJIAN KARYAWAN");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Login_out.png"))); // NOI18N
        jButton5.setText("KLIK TOMBOL INI JIKA INGIN LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/news.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Icon UP.png"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jButton5))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel15)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(13, 13, 13)
                .addComponent(jLabel16)
                .addGap(23, 23, 23)
                .addComponent(jButton5)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jTabbedPane1.addTab("Logout", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin ingin logout?");
        if (result == JOptionPane.YES_NO_OPTION){
            new FormLogin().show();
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblDataGajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataGajiMouseClicked
        int i = tblDataGaji.getSelectedRow();
        if(i>=0){
            txtIdGaji.setText(table.getValueAt(i,0).toString());
            txtTotalGaji.setText(table.getValueAt(i,8).toString());
        }
    }//GEN-LAST:event_tblDataGajiMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int GajiLembur, GajiPokok, TotalGaji;
        GajiLembur = (Integer.parseInt(jComboBox5.getSelectedItem().toString()));
        GajiPokok = (Integer.parseInt(jComboBox6.getSelectedItem().toString()));
        TotalGaji = GajiLembur + GajiPokok;
        txtTotalGaji.setText(Integer.toString(TotalGaji));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin kembali ke form sebelumnya?");
        if (result == JOptionPane.YES_NO_OPTION){
            new FormGajiLembur().show();
            dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?","Delete",JOptionPane.YES_NO_OPTION);
        if (a==0){
            try {
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
                koneksi.createStatement().executeUpdate("delete from tabelGaji where IdGaji='"+txtIdGaji.getText()+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Hapus!");
                tampil();
                bersih();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Nama = jComboBox7.getSelectedItem().toString();
        String Karyawan = jComboBox1.getSelectedItem().toString();
        String Jabatan = jComboBox4.getSelectedItem().toString();
        String Bulan = jComboBox2.getSelectedItem().toString();
        String Tahun = jComboBox3.getSelectedItem().toString();
        String GajiLembur = jComboBox5.getSelectedItem().toString();
        String GajiPokok = jComboBox6.getSelectedItem().toString();
        try {
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            koneksi.createStatement().executeUpdate("update tabelGaji set IdKaryawan='"+Karyawan+"', NamaKaryawan='"+Nama+"', Jabatan='"+Jabatan+"', Bulan='"+Bulan+"', Tahun='"+Tahun+"', GajiLembur='"+GajiLembur+"', GajiPokok='"+GajiPokok+"' where IdGaji='"+txtIdGaji.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Ubah!");
            tampil();
            bersih();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Nama = jComboBox7.getSelectedItem().toString();
        String Karyawan = jComboBox1.getSelectedItem().toString();
        String Jabatan = jComboBox4.getSelectedItem().toString();
        String Bulan = jComboBox2.getSelectedItem().toString();
        String Tahun = jComboBox3.getSelectedItem().toString();
        String GajiLembur = jComboBox5.getSelectedItem().toString();
        String GajiPokok = jComboBox6.getSelectedItem().toString();
        try {
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            koneksi.createStatement().executeUpdate("insert into tabelGaji values('"+txtIdGaji.getText()+"','"+Karyawan+"','"+Nama+"','"+Jabatan+"','"+Bulan+"','"+Tahun+"','"+GajiPokok+"','"+GajiLembur+"','"+txtTotalGaji.getText()+"')");
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Simpan!");
            tampil();
            bersih();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error : "+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGajiActionPerformed

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
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDataGaji;
    private javax.swing.JTextField txtIdGaji;
    private javax.swing.JTextField txtTotalGaji;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        try{
            int row = tblDataGaji.getRowCount();
            for(int i=0; i<row; i++){
                table.removeRow(0);
            }
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select * from tabelGaji");
            while(dst.next()){
                String[] data = {dst.getString(1), dst.getString(2), dst.getString(3), dst.getString(4), dst.getString(5), dst.getString(6), dst.getString(7), dst.getString(8), dst.getString(9)};
                table.addRow(data);
            }
        } catch (SQLException ex){
            
        }
    }
    
    private void combobox1(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select idKaryawan from tabelKaryawan");
            while(dst.next()){
                String idKaryawan = dst.getString("IdKaryawan");
                jComboBox1.addItem(idKaryawan);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox2(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select Jabatan from tabelKaryawan");
            while(dst.next()){
                String Jabatan = dst.getString("Jabatan");
                jComboBox4.addItem(Jabatan);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox3(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select Bulan from tabelGaji");
            while(dst.next()){
                String Bulan = dst.getString("Bulan");
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox4(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select Tahun from tabelGaji");
            while(dst.next()){
                String Tahun = dst.getString("Tahun");
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox5(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select GajiLembur from tabelGajiLembur");
            while(dst.next()){
                String GajiLembur = dst.getString("GajiLembur");
                jComboBox5.addItem(GajiLembur);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox6(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select GajiPokok from tabelKaryawan");
            while(dst.next()){
                String GajiPokok = dst.getString("GajiPokok");
                jComboBox6.addItem(GajiPokok);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
    private void combobox7(){
        try{
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/javadesktop","root","");
            ResultSet dst = koneksi.createStatement().executeQuery("select NamaKaryawan from tabelKaryawan");
            while(dst.next()){
                String Nama = dst.getString("NamaKaryawan");
                jComboBox7.addItem(Nama);
            }
        }
        catch(Exception ex){
         System.out.println("Error : "+ex);   
        }
    }
    
     private void bersih() {
        txtIdGaji.setText("");
        txtTotalGaji.setText("");        
    }
}
