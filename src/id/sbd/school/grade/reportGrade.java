/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sbd.school.grade;

import id.sbd.school.connection.db_connection;
import static id.sbd.school.user.User.containsNumbers;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
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
public class reportGrade extends javax.swing.JInternalFrame {
    ResultSet rs;
    /**
     * Creates new form reportGrade
     */
    public reportGrade() {
        initComponents();
        setTA();
    }

    public void setTA(){
        try {
            String sql = "SELECT DISTINCT kode_semester from semester";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            cbTA.addItem("Semua");
            while (rs.next()) {
                cbTA.addItem(rs.getString("kode_semester"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        btnCetakLaporan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbTA = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Laporan Nilai Siswa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cetak Laporan Berdasarkan :");

        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/document.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        jLabel5.setText("Tahun Ajaran");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/open-book.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Laporan Nilai Siswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        txt.setText("Nama");

        txtNama.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(cbTA, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCetakLaporan)
                                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt))
                .addGap(17, 17, 17)
                .addComponent(btnCetakLaporan)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakLaporanActionPerformed
        try {
            HashMap parameter = new HashMap();
            if (cbTA.getSelectedIndex() == 0) {
                parameter.put("kode_semester", "");
            } else {
                parameter.put("kode_semester", cbTA.getModel().getSelectedItem().toString());
            }
            if (txtNISN.getText()=="") {
                parameter.put("nisn", "");
            } else {
                parameter.put("nisn", txtNISN.getText());
            }
            Connection conn = db_connection.configDB();
            File file = new File("src/id/sbd/school/report/reportGrades.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanActionPerformed

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

    private void getDetailStudents() {
        try {
            String sql = "SELECT nama,kelas from siswa WHERE nisn = '"+txtNISN.getText()+"'";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txtNama.setText(rs.getString("nama"));
            } else {
                JOptionPane.showMessageDialog(null, "NIPD tidak ditemukan!");
                txtNISN.setText("");
                txtNISN.requestFocus(true);
                txtNama.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JComboBox<String> cbTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
