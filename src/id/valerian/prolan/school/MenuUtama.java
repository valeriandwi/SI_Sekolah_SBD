/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.valerian.prolan.school;

import id.valerian.prolan.attendances.Attendance;
import id.valerian.prolan.attendances.reportAttendance;
import id.valerian.prolan.chart.gradeChart;
import id.valerian.prolan.chart.studentChart;
import id.valerian.prolan.connection.db_connection;
import id.valerian.prolan.courses.Course;
import id.valerian.prolan.employees.Employee;
import id.valerian.prolan.employees.reportEmployee;
import id.valerian.prolan.extracurricular.Extracurricular;
import id.valerian.prolan.grade.Grade;
import id.valerian.prolan.grade.reportGrade;
import id.valerian.prolan.students.Students;
import id.valerian.prolan.students.reportStudents;
import id.valerian.prolan.user.User;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.Box;
import javax.swing.JOptionPane;

/**
 *
 * @author Valerian
 */
public class MenuUtama extends javax.swing.JFrame {

    private static String username;
    private static int hak_akses;

    /**
     * Creates new form MenuUtama
     *
     * @param username
     * @param hak_akses
     */
    public MenuUtama(String username, int hak_akses) {
        initComponents();
        this.username=username;
        this.hak_akses = hak_akses;
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null,
                        "Apakah Anda Yakin Untuk Menutup Program Ini ?", "Peringatan",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    exitAction(username);
                }
            }
        });
        this.setTitle("Sistem Informasi Sekolah");
        //cek hak akses
        if(hak_akses == 2){
            jMenu1.setVisible(false);
        }else if(hak_akses == 3){
            miPengguna.setVisible(false);
        }else if(hak_akses == 4){
            jMenu3.setVisible(false);
            miPengguna.setVisible(false);
            miSiswa.setVisible(false);
            miPTK.setVisible(false);
            miMatpel.setVisible(false);
            miAbsensi.setVisible(false);
            miLaporanSiswa.setVisible(false);
            miLaporanPTK.setVisible(false);
            miLaporanAbsensi.setVisible(false);
        }
        mbMenuUtama.add(Box.createHorizontalGlue());
        mbMenuUtama.add(jMenu7);
        jMenu7.setText(username);
    }

    private void exitAction(String username) {
        try {
            String sql2 = "UPDATE pengguna SET aktif = 0 WHERE username='" + username + "'";
            java.sql.Connection conn = (Connection) db_connection.configDB();
            java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst2.executeUpdate();
            dispose();
            new Login().setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        mbMenuUtama = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miPengguna = new javax.swing.JMenuItem();
        miSiswa = new javax.swing.JMenuItem();
        miPTK = new javax.swing.JMenuItem();
        miMatpel = new javax.swing.JMenuItem();
        miNilai = new javax.swing.JMenuItem();
        miAbsensi = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miLaporanSiswa = new javax.swing.JMenuItem();
        miLaporanPTK = new javax.swing.JMenuItem();
        miLaporanNilai = new javax.swing.JMenuItem();
        miLaporanAbsensi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/edit.png"))); // NOI18N
        jMenu1.setText("Mengelola Data");

        miPengguna.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miPengguna.setText("Pengguna");
        miPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPenggunaActionPerformed(evt);
            }
        });
        jMenu1.add(miPengguna);

        miSiswa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miSiswa.setText("Siswa");
        miSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSiswaActionPerformed(evt);
            }
        });
        jMenu1.add(miSiswa);

        miPTK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miPTK.setText("Guru");
        miPTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPTKActionPerformed(evt);
            }
        });
        jMenu1.add(miPTK);

        miMatpel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miMatpel.setText("Mata Pelajaran");
        miMatpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMatpelActionPerformed(evt);
            }
        });
        jMenu1.add(miMatpel);

        miNilai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miNilai.setText("Nilai");
        miNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNilaiActionPerformed(evt);
            }
        });
        jMenu1.add(miNilai);

        miAbsensi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miAbsensi.setText("Absensi");
        miAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbsensiActionPerformed(evt);
            }
        });
        jMenu1.add(miAbsensi);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Ekskul");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mbMenuUtama.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/document.png"))); // NOI18N
        jMenu2.setLabel("Laporan Data");

        miLaporanSiswa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miLaporanSiswa.setText("Laporan Siswa");
        miLaporanSiswa.setName(""); // NOI18N
        miLaporanSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLaporanSiswaActionPerformed(evt);
            }
        });
        jMenu2.add(miLaporanSiswa);

        miLaporanPTK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miLaporanPTK.setText("Laporan Tenaga Kerja");
        miLaporanPTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLaporanPTKActionPerformed(evt);
            }
        });
        jMenu2.add(miLaporanPTK);

        miLaporanNilai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miLaporanNilai.setText("Laporan Nilai");
        miLaporanNilai.setToolTipText("");
        miLaporanNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLaporanNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(miLaporanNilai);

        miLaporanAbsensi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miLaporanAbsensi.setText("Laporan Absensi Siswa");
        miLaporanAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLaporanAbsensiActionPerformed(evt);
            }
        });
        jMenu2.add(miLaporanAbsensi);

        mbMenuUtama.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/002-pie-chart.png"))); // NOI18N
        jMenu3.setText("Grafik");

        jMenuItem8.setText("Grafik Siswa");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Grafik Nilai");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        mbMenuUtama.add(jMenu3);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/users.png"))); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/exit-1.png"))); // NOI18N
        jMenuItem1.setText("Keluar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/settings-4.png"))); // NOI18N
        jMenuItem7.setText("Ubah Password");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        mbMenuUtama.add(jMenu7);

        setJMenuBar(mbMenuUtama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPenggunaActionPerformed
        User user = new User();
        jDesktopPane1.add(user);
        user.setVisible(true);
    }//GEN-LAST:event_miPenggunaActionPerformed

    private void miSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSiswaActionPerformed
        Students std = new Students();
        jDesktopPane1.add(std);
        std.setVisible(true);
    }//GEN-LAST:event_miSiswaActionPerformed

    private void miLaporanSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLaporanSiswaActionPerformed
        reportStudents rs = new reportStudents();
        jDesktopPane1.add(rs);
        rs.setVisible(true);
    }//GEN-LAST:event_miLaporanSiswaActionPerformed

    private void miLaporanNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLaporanNilaiActionPerformed
        reportGrade rg = new reportGrade();
        jDesktopPane1.add(rg);
        rg.setVisible(true);
    }//GEN-LAST:event_miLaporanNilaiActionPerformed

    private void miNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNilaiActionPerformed
        Grade gd = new Grade();
        jDesktopPane1.add(gd);
        gd.setVisible(true);
    }//GEN-LAST:event_miNilaiActionPerformed

    private void miLaporanPTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLaporanPTKActionPerformed
        reportEmployee re = new reportEmployee();
        jDesktopPane1.add(re);
        re.setVisible(true);
    }//GEN-LAST:event_miLaporanPTKActionPerformed

    private void miPTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPTKActionPerformed
        Employee emp = new Employee();
        jDesktopPane1.add(emp);
        emp.setVisible(true);
    }//GEN-LAST:event_miPTKActionPerformed

    private void miMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMatpelActionPerformed
        Course cr = new Course();
        jDesktopPane1.add(cr);
        cr.setVisible(true);
    }//GEN-LAST:event_miMatpelActionPerformed

    private void miAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbsensiActionPerformed
        Attendance att = new Attendance();
        jDesktopPane1.add(att);
        att.setVisible(true);
    }//GEN-LAST:event_miAbsensiActionPerformed

    private void miLaporanAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLaporanAbsensiActionPerformed
        reportAttendance rAtt = new reportAttendance();
        jDesktopPane1.add(rAtt);
        rAtt.setVisible(true);
    }//GEN-LAST:event_miLaporanAbsensiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        exitAction(username);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        EditPassword ep = new EditPassword(this,true,username);
        ep.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        studentChart sc = new studentChart();
        jDesktopPane1.add(sc);
        sc.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        gradeChart gc = new gradeChart();
        jDesktopPane1.add(gc);
        gc.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Extracurricular ec = new Extracurricular();
        jDesktopPane1.add(ec);
        ec.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama(username, hak_akses).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar mbMenuUtama;
    private javax.swing.JMenuItem miAbsensi;
    private javax.swing.JMenuItem miLaporanAbsensi;
    private javax.swing.JMenuItem miLaporanNilai;
    private javax.swing.JMenuItem miLaporanPTK;
    private javax.swing.JMenuItem miLaporanSiswa;
    private javax.swing.JMenuItem miMatpel;
    private javax.swing.JMenuItem miNilai;
    private javax.swing.JMenuItem miPTK;
    private javax.swing.JMenuItem miPengguna;
    private javax.swing.JMenuItem miSiswa;
    // End of variables declaration//GEN-END:variables
}
