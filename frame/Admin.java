package frame;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Admin extends javax.swing.JInternalFrame {

    private void kosongkan(){
        txtidadmin.setEditable(true);
        txtidadmin.setText(null);
        txtnama.setText(null);
        cbjk.setSelectedItem(this);
        txtjabatan.setText(null);
    }
    private void tampilkan(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID Admin");
        model.addColumn("Nama Pegawai");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Jabatan");
        
        try{
            String sql="select *from admin";
            java.sql.Connection conn=(Connection)Connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
                
            }
            tableadmin.setModel(model);
        }catch(SQLException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    public Admin() {
        initComponents();
        
        tampilkan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidadmin = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbjk = new javax.swing.JComboBox<>();
        txtjabatan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableadmin = new javax.swing.JTable();
        tbAdd = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbDelete = new javax.swing.JButton();
        tbCancel = new javax.swing.JButton();
        tbSave = new javax.swing.JButton();
        tbExit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setTitle("Admin");

        jLabel1.setText("Tabel Admin");

        jLabel2.setText("ID Admin");

        jLabel3.setText("Nama Pegawai");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Jabatan");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        cbjk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        tableadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Admin", "Nama Pegawai", "Jenis Kelamin", "Jabatan"
            }
        ));
        tableadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableadminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableadmin);

        tbAdd.setText("Add");
        tbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAddActionPerformed(evt);
            }
        });

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbDelete.setText("Delete");
        tbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDeleteActionPerformed(evt);
            }
        });

        tbCancel.setText("Cancel");
        tbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCancelActionPerformed(evt);
            }
        });

        tbSave.setText("Save");
        tbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSaveActionPerformed(evt);
            }
        });

        tbExit.setText("Exit");
        tbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbAdd)
                        .addGap(18, 18, 18)
                        .addComponent(tbEdit)
                        .addGap(18, 18, 18)
                        .addComponent(tbDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbCancel)
                        .addGap(21, 21, 21)
                        .addComponent(tbSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(tbExit)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbAdd)
                            .addComponent(tbEdit)
                            .addComponent(tbDelete)
                            .addComponent(tbCancel)
                            .addComponent(tbSave))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tbExit)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
      
    }//GEN-LAST:event_txtnamaActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try{
            String sql="update admin set id_admin='"+txtidadmin.getText()+"',nama_pegawai='"+txtnama.getText()+"',jenis_kelamin='"+cbjk.getSelectedItem()+"',jabatan='"+txtjabatan.getText()+"' where id_admin='"+txtidadmin.getText()+"'";
            java.sql.Connection conn=(Connection)Connect.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Edit data");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        tampilkan();
        kosongkan();
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAddActionPerformed
        kosongkan();
        txtidadmin.setFocusable(true);
    }//GEN-LAST:event_tbAddActionPerformed

    private void tbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tbExitActionPerformed

    private void tbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSaveActionPerformed
         try{
            String sql="insert into admin values('"+txtidadmin.getText()+"','"+txtnama.getText()+"','"+cbjk.getSelectedItem()+"','"+txtjabatan.getText()+"')";
            java.sql.Connection conn=(Connection)Connect.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
            tampilkan();
            kosongkan();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }                                        
    }//GEN-LAST:event_tbSaveActionPerformed

    private void tbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDeleteActionPerformed
        try{
            String sql="delete from admin where id_admin='"+txtidadmin.getText()+"'";
            java.sql.Connection conn=(Connection)Connect.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Hapus data");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        tampilkan();
        kosongkan();
    }//GEN-LAST:event_tbDeleteActionPerformed

    private void tbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCancelActionPerformed
        kosongkan();
    }//GEN-LAST:event_tbCancelActionPerformed

    private void tableadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableadminMouseClicked
        int baris=tableadmin.rowAtPoint(evt.getPoint());
        String id=tableadmin.getValueAt(baris, 0).toString();
        txtidadmin.setText(id);
        
        String nama=tableadmin.getValueAt(baris, 1).toString();
        txtnama.setText(nama);
        
        String jk=tableadmin.getValueAt(baris, 2).toString();
        cbjk.setSelectedItem(jk);
        
        String jabatan=tableadmin.getValueAt(baris, 3).toString();
        txtjabatan.setText(jabatan);
    }//GEN-LAST:event_tableadminMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tableadmin;
    private javax.swing.JButton tbAdd;
    private javax.swing.JButton tbCancel;
    private javax.swing.JButton tbDelete;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbExit;
    private javax.swing.JButton tbSave;
    private javax.swing.JTextField txtidadmin;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
