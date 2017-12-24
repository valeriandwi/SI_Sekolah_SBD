/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.valerian.prolan.attendances;

import id.valerian.prolan.connection.db_connection;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class reportAttendance extends javax.swing.JInternalFrame {

    ResultSet rs;

    /**
     * Creates new form reportAttendance
     */
    public reportAttendance() {
        initComponents();
        setTA();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        cbTA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCetakLaporan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbBerdasarkan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Laporan Absensi Siswa");

        jLabel5.setText("Tahun Ajaran");

        cbTA.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cetak Laporan Berdasarkan :");

        btnCetakLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/document.png"))); // NOI18N
        btnCetakLaporan.setText("Cetak Laporan");
        btnCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakLaporanActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/test.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Laporan Absensi Siswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        cbBerdasarkan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tahun Ajaran", "NISN", "Tanggal Absen" }));
        cbBerdasarkan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBerdasarkanItemStateChanged(evt);
            }
        });

        jLabel7.setText("NISN");

        txtNISN.setEnabled(false);

        txtTanggal.setDateFormatString("dd-MM-yyyy");
        txtTanggal.setEnabled(false);

        jLabel8.setText("Tanggal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnCetakLaporan))
                    .addComponent(cbBerdasarkan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTA, 0, 177, Short.MAX_VALUE)
                            .addComponent(txtNISN)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBerdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCetakLaporan)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setTA(){
        try {
            String sql = "SELECT kode_semester from semester";
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
    
    private void btnCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakLaporanActionPerformed
        try {
            HashMap parameter = new HashMap();
            if (cbTA.getSelectedIndex() == 0) {
                parameter.put("kode_semester", "");
            } else {
                parameter.put("kode_semester", cbTA.getModel().getSelectedItem().toString());
            }
            if (txtNISN.getText() == "") {
                parameter.put("nisn", "");
            } else {
                parameter.put("nisn", txtNISN.getText());
            }
            if (txtTanggal.isEnabled()) {
                parameter.put("tgl_absen", checkDate());
            }else{
                parameter.put("tgl_absen", "");
            }
            Connection conn = db_connection.configDB();
            File file = new File("src/id/valerian/prolan/report/reportAttendances.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCetakLaporanActionPerformed

    private void cbBerdasarkanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBerdasarkanItemStateChanged
        if(cbBerdasarkan.getModel().getSelectedItem().toString() == "-"){
           cbTA.setEnabled(false);
           txtNISN.setEnabled(false);
           txtTanggal.setEnabled(false);
           txtTanggal.setDate(null);
        }else if(cbBerdasarkan.getModel().getSelectedItem().toString() == "Tahun Ajaran"){
           cbTA.setEnabled(true);
           txtNISN.setEnabled(false);
           txtTanggal.setEnabled(false);
           txtTanggal.setDate(null);
        }else if(cbBerdasarkan.getModel().getSelectedItem().toString() == "NISN"){
           cbTA.setEnabled(false);
           txtNISN.setEnabled(true);
           txtTanggal.setEnabled(false);
           txtTanggal.setDate(null);
        }else if(cbBerdasarkan.getModel().getSelectedItem().toString() == "Tanggal Absen"){
           cbTA.setEnabled(false);
           txtNISN.setEnabled(false);
           txtTanggal.setEnabled(true);
           txtTanggal.setDate(java.sql.Timestamp.from(java.time.Instant.now()));
        }
    }//GEN-LAST:event_cbBerdasarkanItemStateChanged
    
    private String checkDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateAbsent = df.format(txtTanggal.getDate());
        return dateAbsent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakLaporan;
    private javax.swing.JComboBox<String> cbBerdasarkan;
    private javax.swing.JComboBox<String> cbTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNISN;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}
