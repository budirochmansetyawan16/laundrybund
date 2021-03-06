/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrybunds;

/**
 *
 * @author user
 */
import controller.koneksi;
import static controller.koneksi.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class Data_Barang extends javax.swing.JFrame {

    /**
     * Creates new form Data_Barang
     */
    DefaultTableModel model;
    private String tglin;
    private String tglout;
    public Data_Barang() {
        initComponents();
        String [] judul = {"ID Pelanggan","Nama Pelanggan","Alamat","No Telp","ID Barang",
            "Nama Barang","Jumlah Barang","Tanggal Masuk","Tanggal Keluar","Berat Barang",
            "Harga","Uang DiBayar","Uang Kembalian"};
        model = new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        tglkeluar = new com.toedter.calendar.JDateChooser();
        tglmasuk = new com.toedter.calendar.JDateChooser();
        txtCetak = new javax.swing.JTextField();
        cari = new javax.swing.JTextField();
        textnotelp = new javax.swing.JTextField();
        textalamat = new javax.swing.JTextField();
        textidpelanggan = new javax.swing.JTextField();
        textnamapelanggan = new javax.swing.JTextField();
        uangkembali = new javax.swing.JTextField();
        uangbayar = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        idBeratBarang = new javax.swing.JTextField();
        idJumlahBarang = new javax.swing.JTextField();
        idNamaBarang = new javax.swing.JTextField();
        idBarang = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 700));
        setPreferredSize(new java.awt.Dimension(1400, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 440, 1160, 190);

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetak);
        btnCetak.setBounds(1150, 310, 80, 30);

        btnreset.setText("Reset");
        btnreset.setPreferredSize(new java.awt.Dimension(71, 29));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);
        btnreset.setBounds(1150, 270, 80, 29);

        btnhapus.setText("Hapus");
        btnhapus.setPreferredSize(new java.awt.Dimension(71, 29));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus);
        btnhapus.setBounds(1150, 190, 80, 29);

        btnedit.setText("Edit");
        btnedit.setPreferredSize(new java.awt.Dimension(71, 29));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(1150, 230, 80, 29);

        btntambah.setText("Tambah");
        btntambah.setPreferredSize(new java.awt.Dimension(71, 29));
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah);
        btntambah.setBounds(1150, 150, 80, 29);

        btnback.setText("Back");
        btnback.setPreferredSize(new java.awt.Dimension(71, 29));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(50, 30, 80, 29);

        tglkeluar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglkeluarPropertyChange(evt);
            }
        });
        getContentPane().add(tglkeluar);
        tglkeluar.setBounds(770, 190, 200, 30);

        tglmasuk.setMaxSelectableDate(new java.util.Date(253370743306000L));
        tglmasuk.setMinSelectableDate(new java.util.Date(-62135791094000L));
        tglmasuk.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglmasukPropertyChange(evt);
            }
        });
        getContentPane().add(tglmasuk);
        tglmasuk.setBounds(770, 150, 200, 30);
        getContentPane().add(txtCetak);
        txtCetak.setBounds(1069, 310, 70, 30);

        cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cari.setPreferredSize(new java.awt.Dimension(59, 29));
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(1040, 400, 200, 30);

        textnotelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textnotelp.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(textnotelp);
        textnotelp.setBounds(310, 270, 200, 30);

        textalamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textalamat.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(textalamat);
        textalamat.setBounds(310, 230, 200, 30);

        textidpelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textidpelanggan.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(textidpelanggan);
        textidpelanggan.setBounds(310, 190, 200, 30);

        textnamapelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textnamapelanggan.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(textnamapelanggan);
        textnamapelanggan.setBounds(310, 150, 200, 30);

        uangkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uangkembali.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(uangkembali);
        uangkembali.setBounds(770, 350, 200, 30);

        uangbayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uangbayar.setPreferredSize(new java.awt.Dimension(59, 29));
        uangbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uangbayarKeyReleased(evt);
            }
        });
        getContentPane().add(uangbayar);
        uangbayar.setBounds(770, 310, 200, 30);

        harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harga.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(harga);
        harga.setBounds(770, 270, 200, 30);

        idBeratBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idBeratBarang.setPreferredSize(new java.awt.Dimension(59, 29));
        idBeratBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idBeratBarangKeyReleased(evt);
            }
        });
        getContentPane().add(idBeratBarang);
        idBeratBarang.setBounds(770, 230, 200, 30);

        idJumlahBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idJumlahBarang.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(idJumlahBarang);
        idJumlahBarang.setBounds(310, 390, 200, 30);

        idNamaBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idNamaBarang.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(idNamaBarang);
        idNamaBarang.setBounds(310, 350, 200, 30);

        idBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idBarang.setPreferredSize(new java.awt.Dimension(59, 29));
        getContentPane().add(idBarang);
        idBarang.setBounds(310, 310, 200, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Tanggal Keluar");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(540, 190, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Tanggal Masuk");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(540, 150, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("No Telepon");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 270, 200, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Alamat");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 230, 200, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("ID Pelanggan");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 190, 200, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Nama Pelanggan");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(80, 150, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Uang Kembalian");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 350, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Uang Yang Dibayar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 310, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("(Tergantung Berat Barang)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(610, 280, 150, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Harga");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 270, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Berat Barang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 230, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Jumlah Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 390, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 350, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ID Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 310, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgdatabarang.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1400, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 700);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(Data_Barang.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
            con.createStatement().executeUpdate("delete from datatransaksi where idpelanggan = '"+textidpelanggan.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Data_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
            con.createStatement().executeUpdate("update datatransaksi set namapelanggan = '"+textnamapelanggan.getText()+"',"
                    + "alamat = '"+textalamat.getText()+"',notelepon = '"+textnotelp.getText()+"',"
                            + "idbarang = '"+idBarang.getText()+"',namabarang = '"+idNamaBarang.getText()+
                    "',jumlahbarang = '"+idJumlahBarang.getText()+"',tglmasuk = '"+tglin+"',tglkeluar = '"+tglout+"',"
                            + "beratbarang = '"+idBeratBarang.getText()+
                    "',harga = '"+harga.getText()+"',uangdibayar = '"+uangbayar.getText()+
                    "',uangkembalian = '"+uangkembali.getText()+"' where idpelanggan ='"+textidpelanggan.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke" +
                        " database"+ex.getMessage(),"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
            con.createStatement().executeUpdate("insert into datatransaksi values"+"('"+textidpelanggan.getText()+"',"
                    + "'"+textnamapelanggan.getText()+"',"
                    + "'"+textalamat.getText()+"','"+textnotelp.getText()+"','"+idBarang.getText()+"',"
                            + "'"+idNamaBarang.getText()+
                    "','"+idJumlahBarang.getText()+"','"+tglin+"','"+tglout+"','"+idBeratBarang.getText()+"',"
                            + "'"+harga.getText()+"','"+uangbayar.getText()+
                    "','"+uangkembali.getText()+"')");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Masukkan Data Dengan Benar!"+ex.getMessage(),
                    "infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int i = tabel.getSelectedRow();
        
        if(i>-1){
            textnamapelanggan.setText(model.getValueAt(i,1).toString());
            textidpelanggan.setText(model.getValueAt(i,0).toString());
            textalamat.setText(model.getValueAt(i,2).toString());
            textnotelp.setText(model.getValueAt(i,3).toString());
            idBarang.setText(model.getValueAt(i,4).toString());
            idNamaBarang.setText(model.getValueAt(i,5).toString());
            idJumlahBarang.setText(model.getValueAt(i,6).toString());
            //tglmasuk.setDate(model.getValueAt(i, 7).toString());
            idBeratBarang.setText(model.getValueAt(i,9).toString());
            harga.setText(model.getValueAt(i,10).toString());
            uangbayar.setText(model.getValueAt(i,11).toString());
            uangkembali.setText(model.getValueAt(i,12).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void uangbayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangbayarKeyReleased
        int jumlahkembalian = Integer.parseInt(uangbayar.getText())-Integer.parseInt(harga.getText());
        uangkembali.setText(""+jumlahkembalian);
    }//GEN-LAST:event_uangbayarKeyReleased

    private void idBeratBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idBeratBarangKeyReleased
        int hargabarang = Integer.parseInt(idBeratBarang.getText())*5000;
        harga.setText(""+hargabarang);
    }//GEN-LAST:event_idBeratBarangKeyReleased

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        Search();
    }//GEN-LAST:event_cariKeyReleased

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        java.sql.Connection con = null;
        try{
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName(jdbcDriver);           
            String url;
            url="jdbc:mysql://localhost:3306/laundry";
            String username = "root";
            String password ="";            
            con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();
            try{
                String report = ("C:\\Users\\user\\Documents\\NetBeansProjects\\"
                        + "LaundryBunds\\src\\laundrybunds\\report1.jrxml");
                HashMap hash = new HashMap();
                hash.put("kode", txtCetak.getText());
                JasperReport jprt = JasperCompileManager.compileReport(report);
                JasperPrint jprint = JasperFillManager.fillReport(jprt, hash, con);
                JasperViewer.viewReport(jprint, false);
            }catch(Exception e){
                System.out.println("Report Can't view because : "+e);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Data_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Data_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtCetak.setText("");    
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tglmasukPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglmasukPropertyChange
        if(tglmasuk.getDate()!=null){
            SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyyMMdd");
            tglin = format_tanggal.format(tglmasuk.getDate());
        }
    }//GEN-LAST:event_tglmasukPropertyChange

    private void tglkeluarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglkeluarPropertyChange
        if(tglkeluar.getDate()!=null){
            SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyyMMdd");
            tglout = format_tanggal.format(tglkeluar.getDate());
        }
    }//GEN-LAST:event_tglkeluarPropertyChange

    private void reset(){
    textnamapelanggan.setText("");
    textidpelanggan.setText("");
    textalamat.setText("");
    textnotelp.setText("");
    idBarang.setText("");
    idNamaBarang.setText("");
    idJumlahBarang.setText("");
    tglmasuk.setDate(null);
    tglkeluar.setDate(null);
    idBeratBarang.setText("");
    harga.setText("");
    uangbayar.setText("");
    uangkembali.setText("");
}
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
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField idBarang;
    private javax.swing.JTextField idBeratBarang;
    private javax.swing.JTextField idJumlahBarang;
    private javax.swing.JTextField idNamaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField textalamat;
    private javax.swing.JTextField textidpelanggan;
    private javax.swing.JTextField textnamapelanggan;
    private javax.swing.JTextField textnotelp;
    private com.toedter.calendar.JDateChooser tglkeluar;
    private com.toedter.calendar.JDateChooser tglmasuk;
    private javax.swing.JTextField txtCetak;
    private javax.swing.JTextField uangbayar;
    private javax.swing.JTextField uangkembali;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = tabel.getRowCount();
        for(int a=0; a<row; a++){
        model.removeRow(0);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM datatransaksi");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                    rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Data_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Search(){
        String search = cari.getText();
        int row = tabel.getRowCount();
        for(int a=0; a<row; a++){
        model.removeRow(0);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * "
                    + "FROM datatransaksi where idpelanggan LIKE '%"+search+"%'");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                    rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Data_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
