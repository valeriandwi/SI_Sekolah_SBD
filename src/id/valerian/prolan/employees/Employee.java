/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.valerian.prolan.employees;

import id.valerian.prolan.connection.db_connection;
import static id.valerian.prolan.user.User.containsNumbers;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Valerian
 */
public class Employee extends javax.swing.JInternalFrame {

    ResultSet rs;
    boolean invalid;

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        show_employees();
        btnGroupJK.add(jRadioButton1);
        btnGroupJK.add(jRadioButton2);
        btnGroupStatus.add(RbAktif);
        btnGroupStatus.add(RbNonAktif);
        txtAlamat.setLineWrap(true);
        txtAlamat.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJK = new javax.swing.ButtonGroup();
        btnGroupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNIK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        RbAktif = new javax.swing.JRadioButton();
        RbNonAktif = new javax.swing.JRadioButton();
        tx = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        cbAgama = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCetakLaporan = new javax.swing.JButton();
        cbSearch = new javax.swing.JComboBox<>();
        lblCountData = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Data Guru");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pegawai"));

        jLabel4.setText("Tempat Lahir");

        txtTempatLahir.setNextFocusableComponent(txtTanggalLahir);
        txtTempatLahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTempatLahirKeyReleased(evt);
            }
        });

        jLabel1.setText("NIK");

        txtNIK.setNextFocusableComponent(txtNama);
        txtNIK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNIKKeyReleased(evt);
            }
        });

        jLabel2.setText("Nama");

        txtNama.setNextFocusableComponent(jRadioButton1);
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamaKeyReleased(evt);
            }
        });

        jLabel9.setText("Status");

        txtTanggalLahir.setToolTipText("");
        txtTanggalLahir.setDateFormatString("yyyy-MM-dd ");
        txtTanggalLahir.setNextFocusableComponent(txtAlamat);

        jLabel10.setText("Tanggal Lahir");

        txtAlamat.setColumns(15);
        txtAlamat.setRows(5);
        txtAlamat.setAutoscrolls(false);
        txtAlamat.setNextFocusableComponent(cbAgama);
        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAlamatKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtAlamat);

        RbAktif.setText("Aktif");

        RbNonAktif.setText("Non Aktif");

        tx.setText("Alamat");

        txtTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelpKeyReleased(evt);
            }
        });

        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilihan-", "Budha", "Hindu", "Islam", "Katholik", "Konghucu", "Kristen" }));
        cbAgama.setNextFocusableComponent(RbAktif);

        jLabel5.setText("Telepon");

        jLabel7.setText("Agama");

        jLabel3.setText("Jenis Kelamin ");

        jRadioButton1.setText("Laki-Laki");

        jRadioButton2.setText("Perempuan");
        jRadioButton2.setNextFocusableComponent(txtTempatLahir);

        jLabel6.setText("Email");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addComponent(txtNama)
                    .addComponent(txtTempatLahir)
                    .addComponent(txtNIK))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tx))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(26, 26, 26)
                            .addComponent(RbAktif)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RbNonAktif)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(31, 31, 31)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(RbAktif)
                            .addComponent(RbNonAktif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmployee);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/search.png"))); // NOI18N

        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/document.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIK", "Nama", "Jenis PTK" }));
        cbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSearchItemStateChanged(evt);
            }
        });

        lblCountData.setText("10000");

        lblData.setText("Jumlah Data :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCetakLaporan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd)
                                .addGap(10, 10, 10)
                                .addComponent(btnEdit)
                                .addGap(10, 10, 10)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCountData)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnCetakLaporan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblCountData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlamatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyReleased
        Integer alamatLength = txtAlamat.getText().length();
        String subStr = txtAlamat.getText();
        if (alamatLength.compareTo(50) > 0) {
            txtAlamat.setText(subStr.substring(0, alamatLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter Alamat hanya bisa 50!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtAlamatKeyReleased

    private void tableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeeMouseClicked
        btnAdd.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        int i = tableEmployee.getSelectedRow();
        TableModel model = tableEmployee.getModel();
        txtNIK.setEnabled(false);
        txtNIK.setText(model.getValueAt(i, 0).toString());
        txtNama.setText(model.getValueAt(i, 1).toString());
        switch (model.getValueAt(i, 2).toString()) {
            case "L":
                jRadioButton1.setSelected(true);
                break;
            case "P":
                jRadioButton2.setSelected(true);
                break;
        }
        txtTempatLahir.setText(model.getValueAt(i, 3).toString());
        txtTanggalLahir.setDate(java.sql.Date.valueOf(model.getValueAt(i, 4).toString()));
        txtAlamat.setText(model.getValueAt(i, 5).toString());
        txtTelp.setText(model.getValueAt(i, 6).toString());
        cbAgama.getModel().setSelectedItem(model.getValueAt(i, 7).toString());
        txtEmail.setText(model.getValueAt(i, 8).toString());
        switch (model.getValueAt(i, 9).toString()) {
            case "Aktif":
                RbAktif.setSelected(true);
                break;
            case "Non Aktif":
                RbNonAktif.setSelected(true);
                break;
        }
    }//GEN-LAST:event_tableEmployeeMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                String sql = "INSERT INTO guru VALUES ('" + txtNIK.getText() + "','" + txtNama.getText() + "','" + checkGender() + "','" + txtTempatLahir.getText() + "','" + checkBirthDate() + "','" + txtAlamat.getText() + "','" + cbAgama.getModel().getSelectedItem().toString() + "','" + checkStatus() +"','" + txtTelp.getText() + "','" + txtEmail.getText() + "')";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan data guru berhasil");
                resetField();
                resetTable();
                show_employees();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                String sql = "UPDATE guru SET Nama = '" + txtNama.getText() + "',Jenis_Kelamin = '" + checkGender() + "',Tempat_Lahir = '" + txtTempatLahir.getText() + "',Tanggal_Lahir = '" + checkBirthDate() + "',Alamat = '" + txtAlamat.getText() + "',Agama = '" + cbAgama.getModel().getSelectedItem().toString() + "',Status = '" + checkStatus() + "',Telepon = '" + txtTelp.getText() + "',Email = '" + txtEmail.getText() + "' WHERE NIK = '" + txtNIK.getText() + "'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_employees();
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int reply = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin untuk menghapus data berikut?", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM guru WHERE NIK = '" + txtNIK.getText() + "'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_employees();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtNIKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIKKeyReleased
        Integer nikLength = txtNIK.getText().length();
        String subStr = txtNIK.getText();
        if (nikLength.compareTo(16) > 0) {
            txtNIK.setText(subStr.substring(0, nikLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter NIK hanya bisa 16!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        if (!containsNumbers(subStr)) {
            txtNIK.setText(subStr.substring(0, nikLength - 1));
        }
    }//GEN-LAST:event_txtNIKKeyReleased

    private void txtNamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyReleased
        Integer namaLength = txtNama.getText().length();
        String subStr = txtNama.getText();
        if (namaLength.compareTo(32) > 0) {
            txtNama.setText(subStr.substring(0, namaLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter Nama hanya bisa 32!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        if (containsNumbers(subStr)) {
            txtNama.setText(subStr.substring(0, namaLength - 1));
        }
    }//GEN-LAST:event_txtNamaKeyReleased

    private void txtTempatLahirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempatLahirKeyReleased
        Integer tempatLahirLength = txtTempatLahir.getText().length();
        String subStr = txtTempatLahir.getText();
        if (tempatLahirLength.compareTo(30) > 0) {
            txtTempatLahir.setText(subStr.substring(0, tempatLahirLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter Tempat Lahir hanya bisa 30!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        if (containsNumbers(subStr)) {
            txtTempatLahir.setText(subStr.substring(0, tempatLahirLength - 1));
        }
    }//GEN-LAST:event_txtTempatLahirKeyReleased

    private void txtTelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpKeyReleased
        Integer telpLength = txtTelp.getText().length();
        String subStr = txtTelp.getText();
        if (telpLength.compareTo(15) > 0) {
            txtTelp.setText(subStr.substring(0, telpLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter Telepon hanya bisa 15!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        if (!containsNumbers(subStr)) {
            txtTelp.setText(subStr.substring(0, telpLength - 1));
        }
    }//GEN-LAST:event_txtTelpKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        Integer emailLength = txtEmail.getText().length();
        String subStr = txtEmail.getText();
        if (emailLength.compareTo(30) > 0) {
            txtEmail.setText(subStr.substring(0, emailLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter Email hanya bisa 30!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        show_employees();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakLaporanActionPerformed
        try {
            HashMap parameter = new HashMap();
            Connection conn = db_connection.configDB();
            File file = new File("src/id/valerian/prolan/report/reportEmployee.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanActionPerformed

    private void cbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSearchItemStateChanged
        show_employees();
    }//GEN-LAST:event_cbSearchItemStateChanged

    private boolean checkField() {
        Integer nikLength = txtNIK.getText().length();
        if (nikLength.compareTo(8) < 0) {
            JOptionPane.showMessageDialog(this, "NIPD harus berupa 16 angka", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNIK.requestFocus(true);
            return true;
        } else if (txtNIK.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NIK tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNIK.requestFocus();
            return true;
        } else if (txtNama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNama.requestFocus();
            return true;
        } else if (btnGroupJK.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Jenis Kelamin harus dipilih", "Pesan", JOptionPane.WARNING_MESSAGE);
            return true;
        } else if (txtTempatLahir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tempat Lahir tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtTempatLahir.requestFocus();
            return true;
        } else if (txtTanggalLahir.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Tanggal Lahir tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtTanggalLahir.requestFocus();
            return true;
        } else if (txtAlamat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtAlamat.requestFocus();
            return true;
        } else if (txtNIK.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NIK tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNIK.requestFocus();
            return true;
        } else if (cbAgama.getModel().getSelectedItem().equals("-Pilihan-")) {
            JOptionPane.showMessageDialog(null, "Agama tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            cbAgama.requestFocus();
            return true;
        } else if (btnGroupStatus.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Status harus dipilih", "Pesan", JOptionPane.WARNING_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    private void resetField() {
        btnAdd.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        txtNIK.setText("");
        txtNama.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        txtTempatLahir.setText("");
        txtTanggalLahir.setDate(null);
        txtAlamat.setText("");
        cbAgama.setSelectedIndex(0);
        RbAktif.setSelected(false);
        RbNonAktif.setSelected(false);
        txtTelp.setText("");
        txtEmail.setText("");
    }

    private void resetTable() {
        DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
        model.setRowCount(0);
    }

    private String checkBirthDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String birthDate = df.format(txtTanggalLahir.getDate());
        return birthDate;
    }

    private String checkGender() {
        String gender = null;
        if (jRadioButton1.isSelected()) {
            gender = "L";
        } else if (jRadioButton2.isSelected()) {
            gender = "P";
        }
        return gender;
    }

    private String checkStatus() {
        String status = null;
        if (RbAktif.isSelected()) {
            status = "Aktif";
        } else if (RbNonAktif.isSelected()) {
            status = "Non Aktif";
        }
        return status;
    }

    private void show_employees() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Alamat");
        model.addColumn("Telepon");
        model.addColumn("Agama");
        model.addColumn("Email");
        model.addColumn("Status");
        try {
            String sql = null;
            if (cbSearch.getModel().getSelectedItem().equals("NIK")) {
                sql = "SELECT * from guru WHERE NIK LIKE '" + txtSearch.getText() + "%' ORDER BY Nama";
            }else if (cbSearch.getModel().getSelectedItem().equals("Nama")) {
                sql = "SELECT * from guru WHERE nama LIKE '" + txtSearch.getText() + "%' ORDER BY Nama";
            }
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("NIK"), rs.getString("Nama"), rs.getString("Jenis_Kelamin"), rs.getString("Tempat_Lahir"), rs.getString("Tanggal_Lahir"), rs.getString("Alamat"), rs.getString("Telepon"), rs.getString("Agama"), rs.getString("email"), rs.getString("Status")});
            }
            tableEmployee.setModel(model);
            String sql_count = "SELECT COUNT(*) AS Jumlah FROM guru";
            ResultSet rs2 = st.executeQuery(sql_count);
            if(rs2.next()){
                String data_count = rs2.getString("Jumlah");
                lblCountData.setText("" + data_count);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbAktif;
    private javax.swing.JRadioButton RbNonAktif;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGroupJK;
    private javax.swing.ButtonGroup btnGroupStatus;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbAgama;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCountData;
    private javax.swing.JLabel lblData;
    private javax.swing.JTable tableEmployee;
    private javax.swing.JLabel tx;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtTanggalLahir;
    private javax.swing.JTextField txtTelp;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
