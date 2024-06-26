
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Riyan
 */
public class KelolaUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form kelolaUser
     */
    public KelolaUser() {
        initComponents();

        DefaultTableModel userTable = (DefaultTableModel) this.userTable.getModel();

        Object[] row1 = {1, "Gudang", "Ahmad", "Bandung", "08768172837"};

        userTable.addRow(row1);

        Object[] row2 = {2, "Kasir", "Bambang", "Purwakarta", "08768172838"};

        userTable.addRow(row2);

        Object[] row3 = {3, "Gudang", "Ujang", "Sumedang", "08768172839"};

        userTable.addRow(row3);
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
        cmbTipeUser = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        inpNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inpTelepon = new javax.swing.JTextField();
        inpUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inpAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inpPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        inpCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kelola User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cmbTipeUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTipeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gudang", "Kasir" }));
        getContentPane().add(cmbTipeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 214, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipe User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 94, -1, -1));
        getContentPane().add(inpNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telepon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        getContentPane().add(inpTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 30));
        getContentPane().add(inpUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        getContentPane().add(inpAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));
        getContentPane().add(inpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        btnTambah1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTambah1.setText("Tambah");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        inpCari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(inpCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 540, 30));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kasir", "Tipe User", "Nama User", "Alamat", "Telepon"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menambah data?");

        if (confirmResult == 0) {
            String tipeUser = cmbTipeUser.getItemAt(cmbTipeUser.getSelectedIndex());
            String nama = inpNama.getText();
            String telepon = inpTelepon.getText();
            String alamat = inpAlamat.getText();
            String username = inpUsername.getText();
            String password = inpPassword.getText();

            DefaultTableModel userTable = (DefaultTableModel) this.userTable.getModel();

            Object[] row = {1, tipeUser, nama, alamat, telepon};

            userTable.addRow(row);

            resetField();
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    int selectedRow;

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        // TODO add your handling code here:
        this.selectedRow = userTable.getSelectedRow();

        fillField();
    }//GEN-LAST:event_userTableMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin mengubah data?");

        if (confirmResult == 0) {
            String tipeUser = cmbTipeUser.getItemAt(cmbTipeUser.getSelectedIndex());
            String nama = inpNama.getText();
            String telepon = inpTelepon.getText();
            String alamat = inpAlamat.getText();
            String username = inpUsername.getText();
            String password = inpPassword.getText();

            if (tipeUser.length() == 0 && nama.length() == 0 && telepon.length() == 0 && alamat.length() == 0 && username.length() == 0 && password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Semua field wajib diisi");
            } else {
                userTable.setValueAt(tipeUser, selectedRow, 1);
                userTable.setValueAt(nama, selectedRow, 2);
                userTable.setValueAt(alamat, selectedRow, 3);
                userTable.setValueAt(telepon, selectedRow, 4);

                resetField();
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?");

        if (confirmResult == 0) {
            String tipeUser = cmbTipeUser.getItemAt(cmbTipeUser.getSelectedIndex());
            String nama = inpNama.getText();
            String telepon = inpTelepon.getText();
            String alamat = inpAlamat.getText();
            String username = inpUsername.getText();
            String password = inpPassword.getText();

            if (tipeUser.length() == 0 && nama.length() == 0 && telepon.length() == 0 && alamat.length() == 0 && username.length() == 0 && password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Semua field wajib diisi");
            } else {
                DefaultTableModel userTable = (DefaultTableModel) this.userTable.getModel();

                userTable.removeRow(selectedRow);
                
                resetField();
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    public void fillField() {
        int selectedRow = userTable.getSelectedRow();

        if (userTable.getValueAt(selectedRow, 1) == "Gudang") {
            cmbTipeUser.setSelectedIndex(0);
        } else {
            cmbTipeUser.setSelectedIndex(1);
        }

        inpNama.setText((String) userTable.getValueAt(selectedRow, 2));
        inpTelepon.setText((String) userTable.getValueAt(selectedRow, 4));
        inpAlamat.setText((String) userTable.getValueAt(selectedRow, 3));
    }

    public void resetField() {
        cmbTipeUser.setSelectedIndex(0);
        inpNama.setText("");
        inpTelepon.setText("");
        inpAlamat.setText("");
        inpUsername.setText("");
        inpPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JComboBox<String> cmbTipeUser;
    private javax.swing.JTextField inpAlamat;
    private javax.swing.JTextField inpCari;
    private javax.swing.JTextField inpNama;
    private javax.swing.JTextField inpPassword;
    private javax.swing.JTextField inpTelepon;
    private javax.swing.JTextField inpUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
