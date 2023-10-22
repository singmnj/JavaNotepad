/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaNotepad;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Desktop;
import java.net.URI;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author M Singh
 */
public class ProjectSearch extends javax.swing.JFrame {

    /**
     * Creates new form ProjectSearch
     */
    String str;
    public ProjectSearch(String s) {
        str = s;
        initComponents();
        setTitle("Search");
        jLabel2.setText(str);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public ProjectSearch() {
        initComponents();
        setTitle("Search");
        jLabel2.setText(str);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(4);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel6.setText("Search Pronunciation");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 360, 180, 14);

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel5.setText("Search Wikipedia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 360, 150, 14);

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel4.setText("Search Word");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 360, 110, 14);

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 110, 240, 30);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel1.setText("WORD TO SEARCH : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 110, 260, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaNotepad/images/WordLogo.jpg"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 210, 130, 130);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaNotepad/images/WikiLogo.jpg"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 210, 130, 130);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaNotepad/images/PronunciationLogo.jpg"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 210, 130, 130);

        jLabel3.setName(""); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/"+str));
        } catch (Exception e) {
            System.err.println("Error : "+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("http://www.dictionary.com/browse/"+str+"?s=t"));
        } catch (Exception e) {
            System.err.println("Error : "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("http://dictionary.cambridge.org/pronunciation/english/"+str));
        } catch (Exception e) {
            System.err.println("Error : "+e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                Properties props = new Properties();
                props.put("logoString", "JavaNotepad");
                AcrylLookAndFeel.setCurrentTheme(props);
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
