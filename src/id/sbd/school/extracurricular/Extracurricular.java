/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sbd.school.extracurricular;

import id.sbd.school.connection.db_connection;
import static id.sbd.school.user.User.containsNumbers;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class Extracurricular extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    boolean invalid;
    String idSelected;
    
    /**
     * Creates new form Extracurricular
     */
    public Extracurricular() {
        initComponents();
        try {
            String sql = "SELECT kd_ekskul from ekskul";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            cbKdEkskul.addItem("-Pilihan-");
            while (rs.next()) {
                cbKdEkskul.addItem(rs.getString("kd_ekskul"));
            }
            String sql2 = "SELECT kode_semester from semester";
            rs = st.executeQuery(sql2);
            cbKS.addItem("-Pilihan-");
            while (rs.next()) {
                cbKS.addItem(rs.getString("kode_semester"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        show_excul();
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
        txtNISN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbKS = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbKdEkskul = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEkskul = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbNilai = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExcul = new javax.swing.JTable();
        cbSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCetakLaporan = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Data Ekskul");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Siswa"));

        txtNISN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNISNFocusLost(evt);
            }
        });
        txtNISN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNISNKeyReleased(evt);
            }
        });

        jLabel2.setText("NISN");

        jLabel3.setText("Nama");

        txtNama.setEnabled(false);

        jLabel5.setText("Kelas");

        txtKelas.setEnabled(false);

        jLabel11.setText("Kode Semester");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama)
                            .addComponent(txtNISN)
                            .addComponent(txtKelas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(cbKS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Ekskul"));

        jLabel1.setText("Kode Ekskul");

        cbKdEkskul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKdEkskulItemStateChanged(evt);
            }
        });

        jLabel4.setText("Nama");

        txtEkskul.setEnabled(false);

        jLabel6.setText("Nilai");

        cbNilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T", "A", "B", "C", "D" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbNilai, 0, 172, Short.MAX_VALUE)
                    .addComponent(cbKdEkskul, 0, 172, Short.MAX_VALUE)
                    .addComponent(txtEkskul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbKdEkskul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEkskul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableExcul.setModel(new javax.swing.table.DefaultTableModel(
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
        tableExcul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableExculMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableExcul);

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Siswa", "Nama Ekskul" }));
        cbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSearchItemStateChanged(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/search.png"))); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/document.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCetakLaporan)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnCetakLaporan)
                    .addComponent(btnReset)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNISNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNISNFocusLost
        if (!txtNISN.getText().equals("")) {
            getDetailStudents();
        }
    }//GEN-LAST:event_txtNISNFocusLost

    private void txtNISNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNISNKeyReleased
        Integer nipdLength = txtNISN.getText().length();
        String subStr = txtNISN.getText();
        if (nipdLength.compareTo(nipdLength - 1) > 0) {
            txtNama.setText("");
            txtKelas.setText("");
        }
        if (!txtNISN.getText().equals("")) {
            if (!containsNumbers(subStr)) {
                txtNISN.setText(subStr.substring(0, nipdLength - 1));
            } else {
                if (nipdLength.compareTo(10) > 0) {
                    txtNISN.setText(subStr.substring(0, nipdLength - 1));
                    JOptionPane.showMessageDialog(this, "Maksimal karakter NIPD hanya bisa 10!", "Pesan", JOptionPane.WARNING_MESSAGE);
                }
                if (nipdLength.compareTo(9) > 0) {
                    getDetailStudents();
                }
            }
        }
    }//GEN-LAST:event_txtNISNKeyReleased

    private void tableExculMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExculMouseClicked
        btnAdd.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        TableModel model = tableExcul.getModel();
        int i = tableExcul.getSelectedRow();
        txtNISN.setEnabled(false);
        txtNISN.setText(model.getValueAt(i, 1).toString());
        idSelected = model.getValueAt(i, 0).toString();
        cbKdEkskul.getModel().setSelectedItem(model.getValueAt(i, 3).toString());
        cbKS.getModel().setSelectedItem(model.getValueAt(i, 6).toString());
        cbNilai.getModel().setSelectedItem(model.getValueAt(i, 5).toString());
        getDetailStudents();
    }//GEN-LAST:event_tableExculMouseClicked

    private void cbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSearchItemStateChanged
        show_excul();
    }//GEN-LAST:event_cbSearchItemStateChanged

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        show_excul();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                int maxID = 0;
                String sqlmax = "SELECT MAX(CAST(kode_detail_ekskul AS SIGNED)) as max FROM detail_ekskul";
                java.sql.Connection conn1 = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn1.prepareStatement(sqlmax);
                rs = pst.executeQuery();
                if (rs.next()) {
                    maxID = rs.getInt("max");
                }
                int maxIDnow = maxID + 1;
                String sql = "INSERT into detail_ekskul VALUES('"+maxIDnow+"','"+txtNISN.getText()+"','"+cbKdEkskul.getModel().getSelectedItem().toString()+"','"+cbNilai.getModel().getSelectedItem().toString()+"','"+cbKS.getModel().getSelectedItem().toString()+"')";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst2 = conn.prepareStatement(sql);
                pst2.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan data ekskul berhasil");
                resetField();
                resetTable();
                show_excul();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                String sql = "UPDATE detail_ekskul SET nisn='"+txtNISN.getText()+"',kd_ekskul='"+cbKdEkskul.getModel().getSelectedItem().toString()+"',nilai='"+cbNilai.getModel().getSelectedItem().toString()+"',kode_semester='"+cbKS.getModel().getSelectedItem().toString()+"'"
                        + " WHERE kode_detail_ekskul='"+idSelected+"'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_excul();
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
                String sql = "DELETE FROM detail_ekskul WHERE kode_detail_ekskul = '" + idSelected + "'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_excul();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakLaporanActionPerformed
        try {
            HashMap parameter = new HashMap();
            Connection conn = db_connection.configDB();
            parameter.put("ekskul", "");
            File file = new File("src/id/sbd/school/report/reportExtracurricular.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanActionPerformed

    private void cbKdEkskulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKdEkskulItemStateChanged
        try {
            if (!cbKdEkskul.getModel().getSelectedItem().equals("-Pilihan-")) {
                String sql = "SELECT ekskul from ekskul WHERE kd_ekskul = '"+cbKdEkskul.getModel().getSelectedItem().toString()+"'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                Statement st = conn.createStatement();
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    txtEkskul.setText(rs.getString("ekskul"));
                }
            }else{
                txtEkskul.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbKdEkskulItemStateChanged

    private void getDetailStudents() {
        try {
            String sql = "SELECT nama,kelas from siswa WHERE nisn = '"+txtNISN.getText()+"'";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txtNama.setText(rs.getString("nama"));
                txtKelas.setText(rs.getString("kelas"));
            } else {
                JOptionPane.showMessageDialog(null, "NIPD tidak ditemukan!");
                txtNISN.setText("");
                txtNISN.requestFocus(true);
                txtNama.setText("");
                txtKelas.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private boolean checkField() {
        if (txtNISN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NIPD tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNISN.requestFocus();
            return true;
        } else if (cbKdEkskul.getModel().getSelectedItem().equals("-Pilihan")) {
            JOptionPane.showMessageDialog(null, "Kode Ekskul harus dipilih", "Pesan", JOptionPane.WARNING_MESSAGE);
            cbKdEkskul.requestFocus();
            return true;
        } else if (cbKS.getModel().getSelectedItem().equals("-Pilihan")) {
            JOptionPane.showMessageDialog(null, "Kode Semester harus dipilih", "Pesan", JOptionPane.WARNING_MESSAGE);
            cbKS.requestFocus();
            return true;
        } 
        return false;
    }
    
    private void show_excul() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NISN");
        model.addColumn("Nama");
        model.addColumn("Kode Ekskul");
        model.addColumn("Ekskul");
        model.addColumn("Nilai");
        model.addColumn("Kd Semester");
        try {
            String sql = null;
            int data_count = 0;
            if (cbSearch.getModel().getSelectedItem().equals("Nama Siswa")) {
                sql = "SELECT * FROM detail_ekskul,ekskul,siswa,semester WHERE detail_ekskul.nisn=siswa.nisn AND detail_ekskul.kd_ekskul = ekskul.kd_ekskul AND detail_ekskul.kode_semester = semester.kode_semester"
                        + " AND siswa.nama LIKE '"+txtSearch.getText()+"%' ORDER BY (SELECT CAST(kode_detail_ekskul as SIGNED))";
            } else if (cbSearch.getModel().getSelectedItem().equals("Nama Ekskul")) {
                sql = "SELECT * FROM detail_ekskul,ekskul,siswa,semester WHERE detail_ekskul.nisn=siswa.nisn AND detail_ekskul.kd_ekskul = ekskul.kd_ekskul AND detail_ekskul.kode_semester = semester.kode_semester"
                        + " AND ekskul.ekskul LIKE '"+txtSearch.getText()+"%' ORDER BY (SELECT CAST(kode_detail_ekskul as SIGNED))";
            }
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("kode_detail_ekskul"), rs.getString("nisn"), rs.getString("nama"), rs.getString("kd_ekskul"), rs.getString("ekskul"), rs.getString("nilai"), rs.getString("kode_semester")});
                data_count++;
            }
            tableExcul.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void resetField() {
        txtNISN.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        txtNISN.setText("");
        txtNama.setText("");
        txtKelas.setText("");
        txtEkskul.setText("");
        cbNilai.setSelectedIndex(0);
        cbKS.setSelectedIndex(0);
        cbKdEkskul.setSelectedIndex(0);
        txtSearch.setText("");
    }

    private void resetTable() {
        DefaultTableModel model = (DefaultTableModel) tableExcul.getModel();
        model.setRowCount(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbKS;
    private javax.swing.JComboBox<String> cbKdEkskul;
    private javax.swing.JComboBox<String> cbNilai;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableExcul;
    private javax.swing.JTextField txtEkskul;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
