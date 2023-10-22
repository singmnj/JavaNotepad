/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNotepad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author dell
 */
public class FindReplace extends javax.swing.JFrame {

    /**
     * Creates new form FindReplace
     */
    JTextArea jTextArea1;
    int lastIndex;
    public FindReplace() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public FindReplace(JTextArea jTextArea1){
        initComponents();
        this.jTextArea1 = jTextArea1;
        setTitle("FindReplace");
        down.setSelected(true);
        matchCase.setSelected(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    int findNext(){

        String s1=jTextArea1.getText();
        String s2=FindWhat.getText();

        lastIndex=jTextArea1.getCaretPosition();

        int selStart=jTextArea1.getSelectionStart();
        int selEnd=jTextArea1.getSelectionEnd();
        
        if(up.isSelected())
        {
            if(selStart!=selEnd)
                lastIndex=selEnd-s2.length()-1;

            if(!matchCase.isSelected())
                lastIndex=s1.toUpperCase().lastIndexOf(s2.toUpperCase(),lastIndex);
            else
                lastIndex=s1.lastIndexOf(s2,lastIndex);	
        }
        else
        {
            if(selStart!=selEnd)
                lastIndex=selStart+1;
            if(!matchCase.isSelected())
                lastIndex=s1.toUpperCase().indexOf(s2.toUpperCase(),lastIndex);
            else
                lastIndex=s1.indexOf(s2,lastIndex);	
        }
        
        return lastIndex;
    }

    void findNextWithSelection(){
        int idx = findNext();
        if(idx!=-1)
        {
            jTextArea1.setSelectionStart(idx);
            jTextArea1.setSelectionEnd(idx+FindWhat.getText().length());
        }
        else
            JOptionPane.showMessageDialog(this,"Cannot find"+" \""+FindWhat.getText()+"\"","Find",JOptionPane.INFORMATION_MESSAGE);
    }
    void replaceNext()
    {
        if(jTextArea1.getSelectionStart()==jTextArea1.getSelectionEnd()) 
            {findNextWithSelection();return;}

        String searchText=FindWhat.getText();
        String temp=jTextArea1.getSelectedText();	//get selected text

        if((matchCase.isSelected() && temp.equals(searchText))||(!matchCase.isSelected() && temp.equalsIgnoreCase(searchText)))
                jTextArea1.replaceSelection(ReplaceWith.getText());

            findNextWithSelection();
    }

    int replaceAllNext()
    {
        if(up.isSelected())
            jTextArea1.setCaretPosition(jTextArea1.getText().length()-1);
        else
            jTextArea1.setCaretPosition(0);

        int idx=0;
        int counter=0;
        do
        {
        idx=findNext();
        if(idx==-1) break;
        counter++;
        jTextArea1.replaceRange(ReplaceWith.getText(),idx,idx+FindWhat.getText().length());
        }while(idx!=-1);
        return counter;
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
        FindWhat = new javax.swing.JTextField();
        Find = new javax.swing.JButton();
        Replace = new javax.swing.JButton();
        ReplaceAll = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        up = new javax.swing.JRadioButton();
        down = new javax.swing.JRadioButton();
        matchCase = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ReplaceWith = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Find What :");

        Find.setText("Find Next");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Replace.setText("Replace");
        Replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceActionPerformed(evt);
            }
        });

        ReplaceAll.setText("Replace All");
        ReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceAllActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        up.setText("Up");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        down.setText("Down");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        matchCase.setText("Match Case");
        matchCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchCaseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Replace    :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matchCase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(down))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FindWhat, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(ReplaceWith))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Replace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReplaceAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FindWhat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(Replace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReplaceWith))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReplaceAll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matchCase)
                            .addComponent(up)
                            .addComponent(down))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        findNextWithSelection();
    }//GEN-LAST:event_FindActionPerformed

    private void matchCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matchCaseActionPerformed

    private void ReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceActionPerformed
        // TODO add your handling code here:
        replaceNext();
    }//GEN-LAST:event_ReplaceActionPerformed

    private void ReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceAllActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Total replacements made= "+replaceAllNext());
    }//GEN-LAST:event_ReplaceAllActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
        down.setSelected(false);
        up.setSelected(true);
    }//GEN-LAST:event_upActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
        up.setSelected(false);
        down.setSelected(true);
    }//GEN-LAST:event_downActionPerformed

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
            java.util.logging.Logger.getLogger(FindReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindReplace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Find;
    private javax.swing.JTextField FindWhat;
    private javax.swing.JButton Replace;
    private javax.swing.JButton ReplaceAll;
    private javax.swing.JTextField ReplaceWith;
    private javax.swing.JRadioButton down;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox matchCase;
    private javax.swing.JRadioButton up;
    // End of variables declaration//GEN-END:variables
}
