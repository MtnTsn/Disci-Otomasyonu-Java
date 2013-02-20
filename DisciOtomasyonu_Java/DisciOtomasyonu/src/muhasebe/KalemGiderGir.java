/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KalemGiderGir.java
 *
 * Created on 17.Ara.2011, 13:51:53
 */
package muhasebe;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ercan
 */
public class KalemGiderGir extends javax.swing.JFrame {

    /** Creates new form KalemGiderGir */
    public KalemGiderGir() {
        initComponents();
        this.setIconImage(new ImageIcon("disci.jpg").getImage());
        baglanDB();
        kime.setText("");
        this.setLocation(600, 400);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        geri = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy","##/##/##",'_');
        jLabel3 = new javax.swing.JLabel();
        kime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aciklama = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        odenen = new javax.swing.JTextField();
        kaydet = new javax.swing.JButton();
        kalemEskiKime = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        toplamBorc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kalanBorc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("YENİ KALEM GİDER");

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel2.setText("Tarih");

        jDateChooser1.setDate(new Date());

        jLabel3.setText("Kime (yeni)");

        kime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimeFocusGained(evt);
            }
        });
        kime.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                kimeİnputMethodTextChanged(evt);
            }
        });

        jLabel4.setText("Açıklama");

        aciklama.setColumns(20);
        aciklama.setRows(5);
        jScrollPane1.setViewportView(aciklama);

        jLabel5.setText("Ödenen Miktar");

        kaydet.setText("Kaydet");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });

        kalemEskiKime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kalemEskiKime.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kalemEskiKimeİtemStateChanged(evt);
            }
        });
        kalemEskiKime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kalemEskiKimeFocusGained(evt);
            }
        });

        jLabel6.setText("Eski ");

        jLabel7.setText("Toplam Borç");

        jLabel8.setText("Kalan Borç");

        kalanBorc.setEditable(false);
        kalanBorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalanBorcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toplamBorc)
                            .addComponent(kalanBorc, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel2)
                                        .addGap(64, 64, 64)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(125, 125, 125))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kime, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(kalemEskiKime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(odenen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(kaydet)
                                .addGap(18, 18, 18)
                                .addComponent(geri)))
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kalemEskiKime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(kime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toplamBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(kalanBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(odenen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kaydet)
                            .addComponent(geri))
                        .addGap(225, 225, 225))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new MuhasebeAnaForm().setVisible(true);
}//GEN-LAST:event_geriActionPerformed
int kalanSecili=0;
String kimSecili=null;
private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed

    if(kaydet.getText()=="Kaydet"){
    try {
            DateFormat f = null;
            java.sql.Connection conn = null;
            try {
                // TODO add your handling code here:
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/disci?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement komut = conn.createStatement();
                f = new SimpleDateFormat("dd/MM/yyyy");
                String tarih = f.format(jDateChooser1.getDate()).toString();
                int ode = Integer.parseInt(odenen.getText());
                int toplam = Integer.parseInt(toplamBorc.getText());
                 int kalan =toplam-ode;

                String ay_yil=tarih.substring(3, 10);
                 String yil=tarih.substring(6, 10);
                komut.executeUpdate("insert into cari values (" + null + ",'" + tarih +"','"+ay_yil+"','"+yil+"'," + toplam +","+kalan+ ",'" +aciklama.getText() +"','"+kime.getText()+ "'," + ode + ")");
            } catch (SQLException ex) {
                System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
                
            } catch (ClassNotFoundException ex) {
               System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
                
            }
            conn.close();
            odenen.setText("");
            aciklama.setText("");
            kime.setText("");
            toplamBorc.setText("");
            kalanBorc.setText("");

        } catch (SQLException ex) {
            System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
                
        }
        baglanDB();

 }else if(kaydet.getText()=="Güncelle"){
 
            try {
            DateFormat f = null;
            java.sql.Connection conn = null;
            try {
                // TODO add your handling code here:
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/disci?useUnicode=true&characterEncoding=UTF-8", "root", "");
               Statement komut = conn.createStatement();
                f = new SimpleDateFormat("dd/MM/yyyy");
                String tarih = f.format(jDateChooser1.getDate()).toString();
                int ode = Integer.parseInt(odenen.getText());
                int toplam = Integer.parseInt(toplamBorc.getText());
                 int kalan = Integer.parseInt(kalanBorc.getText());

                String ay_yil=tarih.substring(3, 10);
                 String yil=tarih.substring(6, 10);
                komut.executeUpdate("insert into cari values (" + null + ",'" + tarih +"','"+ay_yil+"','"+yil+"'," + toplam +","+kalan+ ",'" +aciklama.getText() +"','"+kimSecili+ "'," + ode + ")");
                komut.executeUpdate("UPDATE cari SET KALAN="+(kalanSecili-Integer.parseInt(odenen.getText()))+" WHERE KIME='"+kimSecili+"'");
                
            } catch (SQLException ex) {
                System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
               System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
            }
            conn.close();
            
             odenen.setText("");
            aciklama.setText("");
            kime.setText("");
            toplamBorc.setText("");
            kalanBorc.setText("");
          //  kalanBorc.setText(String.valueOf(conn));
        } catch (SQLException ex) {
            System.out.println("hata:" + ex.getMessage());
                ex.printStackTrace();
        }
            baglanDB();
   
 }


}//GEN-LAST:event_kaydetActionPerformed

private void kalanBorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalanBorcActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_kalanBorcActionPerformed

private void kalemEskiKimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kalemEskiKimeFocusGained
    // TODO add your handling code here:
    kime.setText("");
}//GEN-LAST:event_kalemEskiKimeFocusGained

private void kalemEskiKimeİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kalemEskiKimeİtemStateChanged
        try {
            // TODO add your handling code here:
            java.sql.Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/disci?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement komut = (Statement) conn.createStatement();
            ResultSet donenDeger = komut.executeQuery("select KIME,TOPLAM_BORC,KALAN from cari where KIME='" + kalemEskiKime.getSelectedItem().toString() + "'");
            donenDeger.next();
            toplamBorc.setText(donenDeger.getString(2));
            int kalan=donenDeger.getInt(3);
            kalanSecili=kalan;
            kimSecili=kalemEskiKime.getSelectedItem().toString();
            kalanBorc.setText(String.valueOf(kalan));

            conn.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        kaydet.setText("Güncelle");



}//GEN-LAST:event_kalemEskiKimeİtemStateChanged

private void kimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimeFocusGained
    // TODO add your handling code here:
    kaydet.setText("Kaydet");
    toplamBorc.setText("");
    kalanBorc.setText("");
}//GEN-LAST:event_kimeFocusGained

private void kimeİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kimeİnputMethodTextChanged
    // TODO add your handling code here:
    toplamBorc.setText("");
}//GEN-LAST:event_kimeİnputMethodTextChanged

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
            java.util.logging.Logger.getLogger(KalemGiderGir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalemGiderGir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalemGiderGir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalemGiderGir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new KalemGiderGir().setVisible(true);
            }
        });
    }

     private void baglanDB() {
        try {
            java.sql.Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/disci?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement komut = (Statement) conn.createStatement();
            ResultSet donenDeger = komut.executeQuery("select KIME from cari group by KIME ");
            DefaultComboBoxModel cmd = new DefaultComboBoxModel();

            while (donenDeger.next()) {
                cmd.addElement(donenDeger.getString(1));

            }

          kalemEskiKime.setModel(cmd);

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MuhasebeFormDokum.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MuhasebeFormDokum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aciklama;
    private javax.swing.JButton geri;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kalanBorc;
    private javax.swing.JComboBox kalemEskiKime;
    private javax.swing.JButton kaydet;
    private javax.swing.JTextField kime;
    private javax.swing.JTextField odenen;
    private javax.swing.JTextField toplamBorc;
    // End of variables declaration//GEN-END:variables
}
