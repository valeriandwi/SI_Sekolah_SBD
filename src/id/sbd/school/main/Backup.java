/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sbd.school.main;

import id.sbd.school.connection.db_connection;
import static id.sbd.school.connection.db_connection.settingPanel;
import static id.sbd.school.main.MenuUtama.username;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Valerian
 */
public class Backup extends javax.swing.JInternalFrame {

    JFileChooser chooser;

    /**
     * Creates new form Backup
     */
    public Backup() {
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

        txtURL = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        btnBackup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtURLsql = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Backup");

        txtURL.setEnabled(false);

        btnChoose.setText("Choose Path");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/backup.png"))); // NOI18N
        btnBackup.setText("Backup");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/sbd/school/images/database2.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Backup");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        txtURLsql.setText("C:/xampp/mysql/bin/mysqldump.exe");
        txtURLsql.setEnabled(false);

        btnSelect.setText("Edit Path");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel1.setText("Lokasi Simpan Backup :");

        jLabel2.setText("Lokasi Mysqldump :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btnChoose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtURLsql, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelect)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtURLsql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose))
                .addGap(18, 18, 18)
                .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Save");
        chooser.setAcceptAllFileFilterUsed(false);
        FileFilter filter = new FileNameExtensionFilter("sql", "sql");
        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showSaveDialog(this);
        File file = chooser.getSelectedFile();
        if (file != null) {
            File sqlFile = new File(file.toString() + ".sql");
            String file_name = chooser.getSelectedFile().toString();
            if (file.exists()) {
                int result = JOptionPane.showConfirmDialog(this,
                        String.format("%s already exists.%n Overwrite?", file.getName()),
                        "File already exists", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    txtURL.setText(checkFileName(file_name));
                }
            } else if (sqlFile.exists()) {
                int result = JOptionPane.showConfirmDialog(this,
                        String.format("%s.sql already exists.%n Overwrite?", file.getName()),
                        "File already exists", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    txtURL.setText(checkFileName(file_name));
                }
            } else {
                txtURL.setText(checkFileName(file_name));
            }
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        if(txtURL.getText() != ""){
            saveBackup();
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum memilih tempat backup!");
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select");
        chooser.setAcceptAllFileFilterUsed(false);
        FileFilter filter = new FileNameExtensionFilter("exe", "exe");
        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String file_name = chooser.getSelectedFile().toString();
        txtURLsql.setText(file_name);
    }//GEN-LAST:event_btnSelectActionPerformed

    private String checkFileName(String file_name) {
        String file_name_new = null;
        if (!file_name.toLowerCase().endsWith(".sql")) {
            file_name_new = file_name+".sql";
        } else if (file_name.toLowerCase().endsWith(".sql")) {
            file_name_new = file_name;
        }
        return file_name_new;
    }
    
    private void saveBackup() {
        Process p=null;
        try {
            String db = settingPanel("DBName");
            String user = settingPanel("DBUsername"); //user admin database
            String pass = settingPanel("DBPassword"); //pass admin db
            String path = txtURL.getText().replace("\\", "/");
            String pathsql = txtURLsql.getText().replace("\\", "/");
            Runtime runtime = Runtime.getRuntime();
            resetAktif();
            if(pass == null || pass == "" || pass.equals("") || pass.isEmpty()){
                p=runtime.exec(""+pathsql+" -u"+user+" --add-drop-database -B "+db+" -r "+path+"");
            }else{
                p=runtime.exec(""+pathsql+" -u"+user+" -p"+pass+" --add-drop-database -B "+db+" -r "+path+"");
            }
            int processComplete = p.waitFor();
            if (processComplete==0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dibackup!");
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal dibackup!"
                        + "\nPastikan lokasi mysqldump berada pada folder yang benar!");
            }
            setAktif();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void resetAktif(){
        try{
         String sql = "UPDATE pengguna SET aktif = 0";
         java.sql.Connection conn = (Connection) db_connection.configDB();
         java.sql.PreparedStatement pst2 = conn.prepareStatement(sql);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setAktif(){
        try{
         String sql = "UPDATE pengguna SET aktif = 1 WHERE username ='"+ username +"'";
         java.sql.Connection conn = (Connection) db_connection.configDB();
         java.sql.PreparedStatement pst2 = conn.prepareStatement(sql);
         pst2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtURLsql;
    // End of variables declaration//GEN-END:variables
}
