/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sbd.school.attendances;

import id.sbd.school.connection.db_connection;
import static id.sbd.school.user.User.containsNumbers;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
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
public class Attendance extends javax.swing.JInternalFrame {

    ResultSet rs;
    boolean invalid;
    String idSelected;
    /**
     * Creates new form Attendance
     */
    public Attendance() {
        initComponents();
        try{
            String sql2 = "SELECT kode_semester from semester";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql2);
            cbKS.addItem("-Pilihan-");
            while (rs.next()) {
                cbKS.addItem(rs.getString("kode_semester"));
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        Date date = new Date();
        txtTanggal.getDateEditor().setDate(date);
        show_attendances();
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
        jLabel5 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        cbKS = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAttendance = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnCetakLaporan = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbSearch = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnReset2 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Data Absensi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Absen"));

        jLabel1.setText("Kode Semester");

        jLabel5.setText("Jenis Absen");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sakit", "Izin", "Alpha" }));

        jLabel7.setText("Tanggal");

        txtTanggal.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbKS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cbKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel1)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Siswa"));

        jLabel2.setText("NISN");

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

        jLabel3.setText("Nama");

        txtNama.setEnabled(false);

        jLabel6.setText("Tingkat Kelas");

        txtKelas.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNISN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtNama)
                    .addComponent(txtKelas))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(281, 281, 281)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel2)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        tableAttendance.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAttendanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAttendance);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/document.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/search.png"))); // NOI18N

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Siswa", "Tanggal Absen" }));
        cbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSearchItemStateChanged(evt);
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

        btnReset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/reset.png"))); // NOI18N
        btnReset2.setText("Reset");
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(18, 18, 18)
                            .addComponent(btnEdit)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete)
                            .addGap(18, 18, 18)
                            .addComponent(btnReset2)
                            .addGap(18, 18, 18)
                            .addComponent(btnCetakLaporan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnReset2)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete))
                    .addComponent(btnCetakLaporan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                int maxID = 0;
                String sqlmax = "SELECT MAX(CAST(kode_absen AS SIGNED)) as max FROM absensi";
                java.sql.Connection conn1 = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn1.prepareStatement(sqlmax);
                rs = pst.executeQuery();
                if (rs.next()) {
                    maxID = rs.getInt("max");
                }
                int maxIDnow = maxID + 1;
                String sql = "INSERT into absensi VALUES('"+maxIDnow+"','" + txtNISN.getText() + "','" + cbKS.getModel().getSelectedItem().toString() + "','" + cbJenis.getModel().getSelectedItem().toString() + "','" + checkDate() + "')";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst2 = conn.prepareStatement(sql);
                pst2.executeUpdate();
                resetField();
                resetTable();
                show_attendances();
                JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private String checkDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateAbsent = df.format(txtTanggal.getDate());
        return dateAbsent;
    }

    private boolean checkField() {
        Integer nipdLength = txtNISN.getText().length();
        if (nipdLength.compareTo(10) < 0) {
            JOptionPane.showMessageDialog(this, "NISN harus berupa 10 angka", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNISN.requestFocus(true);
            return true;
        } else if (txtNISN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NISN tidak boleh kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNISN.requestFocus();
            return true;
        } else if (cbKS.getModel().getSelectedItem().toString() == "-Pilihan-") {
            JOptionPane.showMessageDialog(null, "Kode Semester harus dipilih!", "Pesan", JOptionPane.WARNING_MESSAGE);
            cbKS.requestFocus();
            return true;
        } else if (txtTanggal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Tanggal tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtTanggal.requestFocus();
            return true;
        }
        return false;
    }

    private void resetTable() {
        DefaultTableModel model = (DefaultTableModel) tableAttendance.getModel();
        model.setRowCount(0);
    }

    private void resetField() {
        txtNISN.setText("");
        txtNama.setText("");
        txtKelas.setText("");
        cbJenis.setSelectedIndex(0);
        cbKS.setEnabled(true);
        cbJenis.setEnabled(true);
        txtTanggal.setEnabled(true);
        txtNISN.setEnabled(true);
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
    }

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

    private void txtNISNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNISNFocusLost
        if (!txtNISN.getText().equals("")) {
            getDetailStudents();
        }
    }//GEN-LAST:event_txtNISNFocusLost

    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakLaporanActionPerformed
        try {
            HashMap parameter = new HashMap();
            parameter.put("tgl_absen","");
            parameter.put("nisn", "");
            parameter.put("kode_semester", "");
            Connection conn = db_connection.configDB();
            File file = new File("src/id/sbd/school/report/reportAttendances.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        show_attendances();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSearchItemStateChanged
        show_attendances();
    }//GEN-LAST:event_cbSearchItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int reply = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin untuk menghapus data berikut?", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                String sql = "DELETE from absensi WHERE kode_absen = '"+idSelected+"'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_attendances();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAttendanceMouseClicked
        btnAdd.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        int i = tableAttendance.getSelectedRow();
        TableModel model = tableAttendance.getModel();
        idSelected = model.getValueAt(i, 0).toString();
        cbKS.getModel().setSelectedItem(model.getValueAt(i, 4));
        cbJenis.getModel().setSelectedItem(model.getValueAt(i, 5));
        txtTanggal.setDate(java.sql.Date.valueOf(model.getValueAt(i, 6).toString()));
        txtNISN.setText(model.getValueAt(i, 1).toString());
        getDetailStudents();
    }//GEN-LAST:event_tableAttendanceMouseClicked

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
        resetField();
    }//GEN-LAST:event_btnReset2ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                String sql ="UPDATE absensi SET kode_semester ='"+cbKS.getModel().getSelectedItem().toString()+"',jenis_absen='"+cbJenis.getModel().getSelectedItem().toString()+"'"
                        + ",tgl_absen='"+checkDate()+"',nisn='"+txtNISN.getText()+"' WHERE kode_absen = '"+idSelected+"'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_attendances();
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

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

    public void show_attendances() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Absen");
        model.addColumn("NISN");
        model.addColumn("Nama");
        model.addColumn("T.Kelas");
        model.addColumn("Kode Semester");
        model.addColumn("Jenis Absen");
        model.addColumn("Tgl Absen");
        try {
            String sql = null;
            if (cbSearch.getModel().getSelectedItem().equals("Nama Siswa")) {
                sql = "SELECT * FROM absensi,siswa,semester WHERE absensi.nisn = siswa.nisn AND semester.kode_semester = absensi.kode_semester"
                        + " AND siswa.nama LIKE '"+txtSearch.getText()+"%' ORDER BY semester.kode_semester";
            } else if (cbSearch.getModel().getSelectedItem().equals("Tanggal Absen")) {
                sql = "SELECT * FROM absensi,siswa,semester WHERE absensi.nisn = siswa.nisn AND semester.kode_semester = absensi.kode_semester"
                      + " AND absensi.tgl_absen LIKE '"+txtSearch.getText()+"%' ORDER BY semester.kode_semester";
            }
            
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("kode_absen"), rs.getString("nisn"), rs.getString("nama"), rs.getString("kelas"), rs.getString("kode_semester"), rs.getString("jenis_absen"), rs.getString("tgl_absen")});
            }
            tableAttendance.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset2;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbKS;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAttendance;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}
