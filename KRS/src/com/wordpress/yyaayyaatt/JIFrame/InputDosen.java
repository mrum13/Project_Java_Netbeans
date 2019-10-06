/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputDosen.java
 *
 * Created on Oct 19, 2010, 7:50:44 PM
 */
package com.wordpress.yyaayyaatt.JIFrame;

import com.wordpress.yyaayyaatt.model.Dosen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import krs.KRS;

/**
 *
 * @author bahrie
 */
public class InputDosen extends javax.swing.JInternalFrame {

    List<Dosen> dosens = new ArrayList<Dosen>();
    Dosen dosen;
    int row;

    /**
     * Creates new form DataDosen
     */
    public InputDosen() {
        initComponents();
        this.statusAwal();
    }

    void kosongkanTeks() {
        txtDosen.setText("");
        txtKdDosen.setText("");
        txtPwd.setText("");
        txtNipy.setText("");
    }

    void Enabled(Boolean b) {
        txtDosen.setEnabled(b);
        txtKdDosen.setEnabled(b);
        txtNipy.setEnabled(b);
        txtPwd.setEnabled(b);
    }

    void isiTabel() {
        try {
            dosens = KRS.getDosenService().getAll();
            Object[][] data = new Object[dosens.size()][3];

            int x = 0;
            for (Dosen dosen : dosens) {
                data[x][0] = dosen.getKd_dosen();
                data[x][1] = dosen.getDosen();
                data[x][2] = dosen.getPwd();
                x++;
            }
            String[] judul = {"Kode Dosen", "Nama"};
            tableDosen.setModel(new DefaultTableModel(data, judul));
            jScrollPane1.setViewportView(tableDosen);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    void statusAwal() {
        this.isiTabel();
        this.kosongkanTeks();
        Enabled(false);

        btnTambah.setText("Tambah");
        btnUpdate.setText("Edit");
        btnTambah.setEnabled(true);
        btnHapus.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new com.apotik.widget.Panel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKdDosen = new javax.swing.JTextField();
        txtDosen = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtNipy = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDosen = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        resetBotton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Input Dosen");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/report/logoPolForm.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Dosen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Kode Dosen :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIPY:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDosen)
                    .addComponent(txtKdDosen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNipy)
                    .addComponent(txtPwd, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKdDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNipy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Dosen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel4.setOpaque(false);

        tableDosen.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDosen);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setOpaque(false);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/tambah.gif"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/kurang.gif"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/resep.gif"))); // NOI18N
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        resetBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordpress/yyaayyaatt/gui/resource/button/exit.gif"))); // NOI18N
        resetBotton.setText("Batal");
        resetBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(resetBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnUpdate)
                    .addComponent(resetBotton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void saveOrUpdateData() {
        if (dosen == null) {
            dosen = new Dosen();
        }
        System.out.println("dosen = "+dosen);
        dosen.setKd_dosen(txtKdDosen.getText());
        dosen.setDosen(txtDosen.getText());
        dosen.setNipy(txtNipy.getText());
        dosen.setPwd(txtPwd.getText());
        KRS.getDosenService().insert(dosen);
        this.statusAwal();
        dosen = new Dosen();
    }
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        if (btnTambah.getText().equals("Tambah")) {
            btnTambah.setText("Simpan");
            Enabled(true);
            txtKdDosen.requestFocusInWindow();
        } else if (btnTambah.getText().equals("Simpan")) {
            if (txtKdDosen.getText().equals("")) {
JOptionPane.showMessageDialog(InputDosen.this, "Field diisi Semua","Informasi",JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kode = null,nama=null;
                List<Dosen> d = KRS.getDosenService().getDosenByKode(txtKdDosen.getText());
                for (Dosen d1 : d) {
                    kode = d1.getKd_dosen();
                    nama = d1.getDosen();
                }
                System.out.println("d = "+kode);
                if(kode ==null){
                saveOrUpdateData();
                btnTambah.setText("Tambah");
                statusAwal();
                }else{
                    JOptionPane.showMessageDialog(InputDosen.this, "Kode Dosen Sudah terpakai oleh "+nama,"Peringatan",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
}//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        if (dosen != null) {
            KRS.getDosenService().delete(dosen);
            statusAwal();
            JOptionPane.showMessageDialog(this, "Berhasil");
            kosongkanTeks();
            statusAwal();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal!!!");
//            }
        }
}//GEN-LAST:event_btnHapusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(btnUpdate.getText().equals("Edit")){
            btnUpdate.setText("Simpan");
            btnHapus.setEnabled(false);
            Enabled(true);
            txtKdDosen.requestFocusInWindow();
        }else if(btnUpdate.getText().equals("Simpan")){
            saveOrUpdateData();
            statusAwal();
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed
    void klikTable() {
        if (tableDosen.getSelectedRow() >= 0) {
            dosen = dosens.get(tableDosen.getSelectedRow());
            dosen = KRS.getDosenService().getDosen(dosen.getId());
            System.out.println("dosen:" + dosen);
            loadModelToForm();
        }
    }

    private void loadModelToForm() {
        txtKdDosen.setText(dosen.getKd_dosen());
        txtDosen.setText(dosen.getDosen());
        txtPwd.setText(dosen.getPwd());
        txtNipy.setText(dosen.getNipy());
    }
    private void resetBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBottonActionPerformed
        this.statusAwal();
}//GEN-LAST:event_resetBottonActionPerformed

    private void tableDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDosenMouseClicked
        // TODO add your handling code here:
        klikTable();
        btnHapus.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnTambah.setEnabled(false);
    }//GEN-LAST:event_tableDosenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.apotik.widget.Panel panel1;
    private javax.swing.JButton resetBotton;
    private javax.swing.JTable tableDosen;
    private javax.swing.JTextField txtDosen;
    private javax.swing.JTextField txtKdDosen;
    private javax.swing.JTextField txtNipy;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}