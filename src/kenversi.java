/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class kenversi extends javax.swing.JFrame {

    /**
     * Creates new form kenversi
     */
    public kenversi() {
        initComponents();
    }
    String from, hasil, angka = "";
    double jumlah, ang1, ang2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        h = new javax.swing.JTextField();
        o = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        to = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Heksa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 120, 29, 14);

        jLabel3.setText("Oktal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 25, 14);

        jLabel4.setText("Biner");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 180, 24, 14);

        jLabel5.setText("Desimal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 90, 50, 14);
        getContentPane().add(h);
        h.setBounds(90, 120, 70, 20);
        getContentPane().add(o);
        o.setBounds(90, 150, 70, 20);
        getContentPane().add(b);
        b.setBounds(90, 180, 70, 20);
        getContentPane().add(d);
        d.setBounds(90, 90, 70, 20);
        getContentPane().add(input);
        input.setBounds(230, 190, 110, 40);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 220, 73, 23);

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH INPUTAN--", "Desimal", "Heksa", "Oktal", "Biner" }));
        getContentPane().add(to);
        to.setBounds(230, 100, 114, 20);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

            if(to.getSelectedItem()=="Heksa"){
            String hexa = input.getText();
            int outDes = Integer.parseInt(hexa,16);
            d.setText(Integer.toUnsignedString(outDes));
            String hexa2 = input.getText();
            int outDes2 = Integer.parseInt(hexa2,16);
            String hasilDes = Integer.toUnsignedString(outDes2);
            int hasilBiner = Integer.parseInt(hasilDes);
            b.setText(Integer.toBinaryString(hasilBiner));
            String hexa3 = input.getText();
            int outDes3 = Integer.parseInt(hexa3,16);
            String hasilDes2 = Integer.toUnsignedString(outDes3);
            int hasilOktal2 = Integer.parseInt(hasilDes2);
            o.setText(Integer.toOctalString(hasilOktal2));
            String hexa4 = input.getText();
            h.setText(hexa4);}
        
            else if(to.getSelectedItem()=="Oktal"){
            String oktal = input.getText();
            int outDes3 = Integer.parseInt(oktal,8);
            d.setText(Integer.toUnsignedString(outDes3));
            String oktal2 = input.getText();
             int outDes4 = Integer.parseInt(oktal2,8);
             String hasilDes2 = Integer.toUnsignedString(outDes4);
             int hasilBiner2 = Integer.parseInt(hasilDes2);
             b.setText(Integer.toBinaryString(hasilBiner2));
             String hexa3 = input.getText();
             int outDes5 = Integer.parseInt(hexa3,8);
             String hasilDes3 = Integer.toUnsignedString(outDes5);
              int hasilHexa3 = Integer.parseInt(hasilDes3);
              h.setText(Integer.toHexString(hasilHexa3));
              String oktal4 = input.getText();
              o.setText(oktal4);}
        
        else if(to.getSelectedItem()=="Biner"){
        String biner4 = input.getText();
             int outDes6 = Integer.parseInt(biner4,2);
             d.setText(Integer.toUnsignedString(outDes6));
             String biner7 = input.getText();
             int outDes7 = Integer.parseInt(biner7,2);
             String hasilBiner7 = Integer.toUnsignedString(outDes7);
             int hasilOktal7 = Integer.parseInt(hasilBiner7);
             o.setText(Integer.toOctalString(hasilOktal7));
             String biner8 = input.getText();
             int outDes8 = Integer.parseInt(biner8,2);
             String hasilBiner8 = Integer.toUnsignedString(outDes8);
             int hasilHexa8 = Integer.parseInt(hasilBiner8);
             h.setText(Integer.toHexString(hasilHexa8));
             String biner9 = input.getText();
             b.setText(biner9);}

             else if(to.getSelectedItem()=="Desimal"){
        String desimal1 = input.getText();
             int outOktal9 = Integer.parseInt(desimal1);
             o.setText(Integer.toOctalString(outOktal9));
             String desimal2 = input.getText();
             int outBiner9 = Integer.parseInt(desimal2);
             b.setText(Integer.toBinaryString(outBiner9));
             String desimal3 = input.getText();
            int outHexa9 = Integer.parseInt(desimal3);
             h.setText(Integer.toHexString(outHexa9));
             String desimal4 = input.getText();
             d.setText(desimal4);} 
             

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kenversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kenversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kenversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kenversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kenversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField d;
    private javax.swing.JTextField h;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField o;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}
