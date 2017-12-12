/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.valerian.prolan.user;

import id.valerian.prolan.connection.db_connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Valerian
 */
public class User extends javax.swing.JInternalFrame {

    ResultSet rs;
    boolean invalid;

    /**
     * Creates new form UserIF
     */
    public User() {
        initComponents();
        show_user();
        txtUsername.requestFocus();
        this.setResizable(false);
        this.setTitle("Data Master Pengguna");
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        cbSearch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbHakAkses = new javax.swing.JComboBox<>();
        lblHakAses = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblNamaPengguna = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNamaPengguna = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Email", "Nama Pengguna", "HA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "Nama Pengguna", "Email" }));
        cbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSearchItemStateChanged(evt);
            }
        });
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/search.png"))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 326, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pengguna"));
        jPanel2.setForeground(java.awt.SystemColor.control);

        cbHakAkses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbHakAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilihan-", "Administrator", "Kepala Sekolah", "Tata Usaha", "Pengajar" }));

        lblHakAses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHakAses.setText("Hak Akses");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPassword.setText("Password");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("Email");
        lblEmail.setPreferredSize(new java.awt.Dimension(59, 15));

        lblNamaPengguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNamaPengguna.setText("Nama Pengguna");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/valerian/prolan/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtNamaPengguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNamaPengguna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamaPenggunaKeyReleased(evt);
            }
        });

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHakAses)
                    .addComponent(lblPassword)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamaPengguna)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbHakAkses, 0, 160, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtEmail)
                    .addComponent(txtNamaPengguna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername))
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHakAses, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        btnDelete.setEnabled(true);
        btnEdit.setEnabled(true);
        btnAdd.setEnabled(false);
        int i = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtUsername.setText(model.getValueAt(i, 0).toString());
        txtPassword.setText(model.getValueAt(i, 1).toString());
        txtEmail.setText(model.getValueAt(i, 3).toString());
        txtNamaPengguna.setText(model.getValueAt(i, 2).toString());
        cbHakAkses.setSelectedItem(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableUserMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        show_user();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                int hak_akses = HakAksesSelection();
                String sql = "INSERT INTO t_pengguna(username, password, nama_pengguna, email_pengguna , hak_akses) VALUES ('" + txtUsername.getText() + "',MD5('" + txtPassword.getText() + "'),'" + txtNamaPengguna.getText() + "','" + txtEmail.getText() + "','" + hak_akses + "')";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_user();
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        invalid = checkField();
        if (!invalid) {
            try {
                int hak_akses = HakAksesSelection();
                String sql = "UPDATE t_pengguna SET email_pengguna = '" + txtEmail.getText() + "',nama_pengguna = '" + txtNamaPengguna.getText() + "',hak_akses = '" + hak_akses + "' WHERE username = '" + txtUsername.getText() + "'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_user();
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
                String sql = "DELETE FROM t_pengguna WHERE username = '" + txtUsername.getText() + "'";
                java.sql.Connection conn = (Connection) db_connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                resetField();
                resetTable();
                show_user();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        Integer usernameLength = txtUsername.getText().length();
        String subStr = txtUsername.getText();
        if (usernameLength.compareTo(15) > 0) {
            txtUsername.setText(subStr.substring(0, usernameLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter username hanya bisa 15!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        Integer passwordLength = txtPassword.getText().length();
        String subStr = txtPassword.getText();
        if (passwordLength.compareTo(25) > 0) {
            txtPassword.setText(subStr.substring(0, passwordLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter password hanya bisa 25!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        Integer emailLength = txtEmail.getText().length();
        String subStr = txtEmail.getText();
        if (emailLength.compareTo(50) > 0) {
            txtEmail.setText(subStr.substring(0, emailLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter email hanya bisa 50!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNamaPenggunaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaPenggunaKeyReleased
        Integer namaLength = txtNamaPengguna.getText().length();
        String subStr = txtNamaPengguna.getText();
        if (namaLength.compareTo(50) > 0) {
            txtNamaPengguna.setText(subStr.substring(0, namaLength - 1));
            JOptionPane.showMessageDialog(this, "Maksimal karakter email hanya bisa 50!", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
        if (containsNumbers(subStr)) {
            txtNamaPengguna.setText(subStr.substring(0, namaLength - 1));
        }
    }//GEN-LAST:event_txtNamaPenggunaKeyReleased

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        show_user();
    }//GEN-LAST:event_cbSearchActionPerformed

    private void cbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSearchItemStateChanged
        show_user();
    }//GEN-LAST:event_cbSearchItemStateChanged
    /**
     * Function to check the field is number.
     */
    public boolean isNumber(String str) {
        String regex = "\\d*";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(str).matches();
    }

    /**
     * Function to check the field is contains number.
     */
    public static boolean containsNumbers(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function to check the field is invalid or not.
     */
    private boolean checkField() {
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtSearch.requestFocus();
            return true;
        } else if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtPassword.requestFocus();
            return true;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return true;
        } else if (txtNamaPengguna.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            txtNamaPengguna.requestFocus();
            return true;
        } else if (cbHakAkses.getModel().getSelectedItem().equals("-Pilihan-")) {
            JOptionPane.showMessageDialog(null, "Hak akses tidak boleh kosong!", "Pesan", JOptionPane.WARNING_MESSAGE);
            cbHakAkses.requestFocus();
            return true;
        } else {
            return false;
        }
    }

    private int HakAksesSelection() {
        int hak_akses = 0;
        String itemSelected = cbHakAkses.getModel().getSelectedItem().toString();
        switch (itemSelected) {
            case "Administrator":
                hak_akses = 1;
                break;
            case "Kepala Sekolah":
                hak_akses = 2;
                break;
            case "Tata Usaha":
                hak_akses = 3;
                break;
            case "Pengajar":
                hak_akses = 4;
                break;
        }
        return hak_akses;
    }

    /**
     * Method to Reset all field become invalid.
     */
    private void resetField() {
        btnAdd.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtNamaPengguna.setText("");
        txtUsername.requestFocus(true);
        txtSearch.setText("");
        cbHakAkses.setSelectedIndex(0);
    }

    private void resetTable() {
        DefaultTableModel model = (DefaultTableModel) tableUser.getModel();
        model.setRowCount(0);
    }

    /**
     * Show Data from database to table.
     */
    private void show_user() {
        String sql = null;
        String hak_akses = null;
        resetTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Nama Pengguna");
        model.addColumn("Email");
        model.addColumn("Hak Akses");
        try {
            if (cbSearch.getModel().getSelectedItem().equals("Username")) {
                sql = "SELECT * FROM t_pengguna WHERE username LIKE '" + txtSearch.getText() + "%'";
            } else if (cbSearch.getModel().getSelectedItem().equals("Nama Pengguna")) {
                sql = "SELECT * FROM t_pengguna WHERE nama_pengguna LIKE '" + txtSearch.getText() + "%'";
            } else if (cbSearch.getModel().getSelectedItem().equals("Email")) {
                sql = "SELECT * FROM t_pengguna WHERE email_pengguna LIKE '" + txtSearch.getText() + "%'";
            }
            java.sql.Connection conn = (Connection) db_connection.configDB();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                switch (rs.getInt("hak_akses")) {
                    case 1:
                        hak_akses = "Administrator";
                        break;
                    case 2:
                        hak_akses = "Kepala Sekolah";
                        break;
                    case 3:
                        hak_akses = "Tata Usaha";
                        break;
                    case 4:
                        hak_akses = "Pengajar";
                        break;
                }
                model.addRow(new Object[]{rs.getString("username"), rs.getString("password"), rs.getString("nama_pengguna"), rs.getString("email_pengguna"), hak_akses});
            }
            tableUser.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbHakAkses;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHakAses;
    private javax.swing.JLabel lblNamaPengguna;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNamaPengguna;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
