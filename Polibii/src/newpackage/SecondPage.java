/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
//ЦЕЗАР
public class SecondPage extends javax.swing.JFrame {

    /**
     * Creates new form SecondPage
     */
    public SecondPage() {
        initComponents();
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(447, 660));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(222, 201, 162));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(24, 568, 90, 23);

        jButton2.setBackground(new java.awt.Color(222, 201, 162));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Next >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(299, 568, 90, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Caesar Cipher");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 50, 190, 50);

        jTextPane2.setBackground(new java.awt.Color(242, 228, 200));
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 340, 150, 70);

        jTextPane1.setBackground(new java.awt.Color(242, 228, 200));
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.setName("TxtEncrypt"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 150, 70);

        jTextPane3.setBackground(new java.awt.Color(242, 228, 200));
        jTextPane3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextPane3.setText("3");
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(70, 270, 150, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Enter text to encrypt");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 134, 130, 20);

        textField1.setBackground(new java.awt.Color(242, 228, 200));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1);
        textField1.setBounds(70, 470, 150, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Enter key");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 250, 100, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Enter code to decrypt");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 320, 130, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Result");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 450, 80, 17);

        jButton3.setBackground(new java.awt.Color(222, 201, 162));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 180, 90, 25);

        jButton4.setBackground(new java.awt.Color(222, 201, 162));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 360, 90, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Ceaser.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 390, 180, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/CaesarBust.JPEG"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 20, 80, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/papirus_dyplom542.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 620);

        setSize(new java.awt.Dimension(447, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Бутон back  връща към миналата страница(Полибий)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           NewJFrame ff=new NewJFrame();
           ff.setVisible(true);
           dispose();
           
    }//GEN-LAST:event_jButton1ActionPerformed
    // Бутон за криптиране
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String text=jTextPane1.getText();
    String key=jTextPane3.getText();
    //проверка за дължината на съобщението
    if(text.length()<80){
    try{
        
    int k=Integer.parseInt(key);
    textField1.setText(Encrypt(text,k));
    }catch(Exception e){
       //Обработка на Exception (Може да възникне при въвеждане на буква за ключ) 
        String message = "The key should be a number\n between 0 and 30 with no blank spaces. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
    }
    }else {
         String message = "The text entered should be less than 80. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
    }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    //Бутон за декриптиране
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String text=jTextPane2.getText();
    String key=jTextPane3.getText();
    if(text.length()<80){
    try{
    int k=Integer.parseInt(key);
    textField1.setText(Decrypt(text,k));
    }catch(Exception e){
        String message = "The key should be a number\n between 0 and 30 with no blank spaces. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
    } // TODO add your handling code here:
    }
    else{
        String message = "The text entered should be less than 80. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed
    // Бутон за препращане към Виженер
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ThirdPage ff=new ThirdPage();
        ff.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //Метод за криптиране
    public String Encrypt(String str,int key){
        StringBuilder sb=new StringBuilder();
        //Текста се записва в str като се прави изцяло от главни букви 
        str=str.toUpperCase();
        Boolean bl=false;
        //всички позволени символи
        String arr="АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,:/";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<arr.length();j++){
              //Проверка дали символите от текста ги има в позволените  
              if(str.charAt(i)==arr.charAt(j)){
                  bl=true;
                  //Проверка дали дължината на стринга с позволени символи е по-голяма 
                  //от сумата на ключа(3) и номера на символа от текст.
                  if(arr.length()>(j+key)) {
                      sb.append(arr.charAt(j+key));
                  } 
                  else {
                      sb.append(arr.charAt(arr.length()-j));
                  }
              }  
            }
           if(bl==false){
               String message = "There is a symbol which is not part of {M}. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
           }
           bl=false;
           
        }
        return sb.toString();
    }
    //Метод за декриптиране аналогичен на метода за криптиране.
    public String Decrypt(String str,int key){
        StringBuilder sb=new StringBuilder();
        str=str.toUpperCase();
         Boolean bl=false;
        String arr="АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,:/";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<arr.length();j++){
                
              if(str.charAt(i)==arr.charAt(j)){
                   bl=true;
                  if(arr.length()>(j-key)) {
                      sb.append(arr.charAt(j-key));
                  } 
                  else {
                      sb.append(arr.charAt(arr.length()+j));
                  }
              }  
            }
           if(bl==false){
               String message = "There is a symbol which is not part of {M}. ";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
           }
           bl=false;
           
           
        }
        return sb.toString();
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
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
// Метод за поставяне на икона при стартиране на приложението.
private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pitagor_0.png")));
        
    }
}