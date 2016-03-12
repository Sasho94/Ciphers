package newpackage;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


//ПОЛИБИЙ
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(447, 660));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("                Enter text to encrypt");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 170, 210, 20);

        jTextPane1.setBackground(new java.awt.Color(242, 228, 200));
        jTextPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextPane1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 210, 51);

        jButton1.setBackground(new java.awt.Color(222, 201, 162));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 200, 90, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("                Enter code to decrypt  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 290, 210, 17);

        jTextPane2.setBackground(new java.awt.Color(242, 228, 200));
        jTextPane2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextPane2ComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 320, 210, 49);

        jButton2.setBackground(new java.awt.Color(222, 201, 162));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(299, 316, 90, 50);

        jButton3.setBackground(new java.awt.Color(222, 201, 162));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Next >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 560, 100, 23);

        jButton4.setBackground(new java.awt.Color(222, 201, 162));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 520, 100, 23);

        jTextField1.setBackground(new java.awt.Color(253, 240, 214));
        jTextField1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextField1ComponentAdded(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 450, 170, 67);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("                 Result");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 430, 160, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("Polybius Cipher");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(137, 50, 174, 28);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/sqare pulibius.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 380, 200, 208);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 420, 160, 170);

        jButton5.setBackground(new java.awt.Color(222, 201, 162));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("<<Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 560, 90, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/polibii.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 30, 100, 130);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/papirus_dyplom542.gif"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 430, 620);

        setSize(new java.awt.Dimension(441, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane1ComponentAdded

    //Бутон за криптиране на текста
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //приема текста от jTextPane1 и го записва в str
        String str=jTextPane1.getText();
        //изпраща текста в метода Encrypt за криптиране 
	jTextField1.setText(Encrypt(str.toLowerCase()));
                
    }//GEN-LAST:event_jButton1ActionPerformed
    //Бутон за декриптиране
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str=jTextPane2.getText();
        //изпраща кода в метода Decrypt за криптиране
	jTextField1.setText(Decrypt(str.toLowerCase()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPane2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextPane2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane2ComponentAdded

    private void jTextField1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextField1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ComponentAdded

    
    // Бутон за препращане към следващата страница(Цезар)
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //създава обект от типа на следващата страница
       SecondPage sp=new SecondPage();
       //прави SecondPage видима 
       sp.setVisible(true);
       //унищожава текущата страница
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Бутон за записване на текста във файл
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        
        Path path = Paths.get("Result.txt");

        if (!Files.exists(path)) {
         File f=new File("Result.txt");
        }
        try {
            FileWriter fw=new FileWriter("Result.txt",true);
            fw.write(jTextField1.getText());
            fw.flush();
            fw.write( System.getProperty("line.separator"));
            fw.flush();
            fw.close();
            } catch (IOException ex) {
             String message = "Problem writing to file!";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed
    //Бутон за препращане към меню
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Menu sp=new Menu();
       sp.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Метод за попълване на таблицата на Полибий
    public char[][] Polibii(){
        char[][]ch=new char[7][7];
        try{
			
	char ch1='a';
	for(int i=0;i<5;i++){
	    for(int j=0;j<5;j++){
		if(ch1!='i'){
		ch[i][j]=ch1;
		}
		else {ch[i][j]=ch1++;
		}
		ch1++;
	    }
	}
        ch[6][6]=' ';
			
	    	
        }catch(IndexOutOfBoundsException e){
             String message = "There was error in the program please restart it";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
        }
        return ch;
    }
    //Метод за криптиране
    public String Encrypt(String str){
    	char ch[][]=Polibii();
        StringBuilder sb=new StringBuilder();
        try{
    	for(int i=0;i<str.length();i++){
         	for(int j=0;j<5;j++){
	 		for(int k=0;k<5;k++){
	 		if(str.charAt(i)==ch[j][k]){
	 		sb.append(j+1);
	 		sb.append(k+1);
	 		}
         
	 	}
	    }
            if(str.charAt(i)==' '){
            sb.append(" ");
            }
        }
                }catch(IndexOutOfBoundsException e){
             String message = "There was error in the program please restart it";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
        }
			return sb.toString();
	    }
    
    //Метод Decrypt
   public String Decrypt(String str){
       char ch[][]=Polibii();
       StringBuilder sb=new StringBuilder(); 
       StringBuilder sb1=new StringBuilder(); 
       try{
           for(int i=0;i<str.length();i++){
           char cha=str.charAt(i);
           //Проверка дали въведения код е само от цифри
               if(cha>='0' && cha<='9')
                 {
                   sb.append(cha);
                 }
               if(cha==' '){
               sb.append(66);
               }
   }
   int counter=0;
   int k=0,m=0;
   String s="";
   for(int i=0;i<sb.toString().length();i++){
       if(counter==0){
           k=Integer.parseInt(s+sb.toString().charAt(i));
                      
       }
       if(counter==1){
           m=Integer.parseInt(s+sb.toString().charAt(i));
           
       }
       counter++;
       if(counter==2){
         sb1.append(ch[k-1][m-1]);
        
         counter=0;
         
         
       }
       
   }
   }catch(IndexOutOfBoundsException e){
             String message = "There was error in the program please enter only numbers between 1-6.";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
        }
   return sb1.toString();
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables

    private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pitagor_0.png")));
        
    }
    
  
}
