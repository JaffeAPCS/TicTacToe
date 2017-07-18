/*
 * Copyright 2017 Roger Jaffe
 * All rights reserved
 */
package tictactoe;
 
import javax.swing.JButton;

/**
 *
 * @author Roger Jaffe
 */
public class View extends javax.swing.JFrame {

  boolean whoseTurn;
  boolean gameOver;
  
  /**
   * Creates new form View
   */
  public View() {
    initComponents();
    this.whoseTurn = false;
    this.gameOver = false;
  }
  
  /**
   * Checks the board to see if there's a winner
   * @return "X" or "O".  Blank string if no winner yet
   */
  private String isWinner() {
    // Get the text contents of each button.  Be sure you're accessing the
    // buttons in the order you want.  The Netbeans UI sometimes mixes up
    // the numbers on the button names so they're not in the order you expect
    String[][] status = new String[3][3];
    status[0][0] = jButton1.getText();
    status[0][1] = jButton2.getText();
    status[0][2] = jButton3.getText();
    status[1][0] = jButton4.getText();
    status[1][1] = jButton5.getText();
    status[1][2] = jButton6.getText();
    status[2][0] = jButton7.getText();
    status[2][1] = jButton8.getText();
    status[2][2] = jButton9.getText();
    
    // Check the rows and columns for a tic tac toe
    for (int i=0; i<3; i++) {
      if (status[i][0].equals(status[i][1]) && status[i][0].equals(status[i][2]))
        return status[i][0];
      if (status[0][i].equals(status[1][i]) && status[0][i].equals(status[2][i]))
        return status[0][i];
    }
    
    // Check the diagonals
    if (status[0][0].equals(status[1][1]) && status[0][0].equals(status[2][2]))
      return status[0][0];
    if (status[0][2].equals(status[1][1]) && status[0][2].equals(status[2][0]))
      return status[0][2];
    
    // If we haven't found it, then return a blank string
    return "";
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
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton1.setName("00-"); // NOI18N
    jButton1.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton1.setSize(new java.awt.Dimension(75, 75));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton2.setName("01-"); // NOI18N
    jButton2.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton2.setSize(new java.awt.Dimension(75, 75));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton3.setName("02-"); // NOI18N
    jButton3.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton3.setSize(new java.awt.Dimension(75, 75));
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton4.setName("12-"); // NOI18N
    jButton4.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton4.setSize(new java.awt.Dimension(75, 75));
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton5.setName("11-"); // NOI18N
    jButton5.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton5.setSize(new java.awt.Dimension(75, 75));
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton6.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton6.setName("10-"); // NOI18N
    jButton6.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton6.setSize(new java.awt.Dimension(75, 75));
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton7.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton7.setName("22-"); // NOI18N
    jButton7.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton7.setSize(new java.awt.Dimension(75, 75));
    jButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton8.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton8.setName("21-"); // NOI18N
    jButton8.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton8.setSize(new java.awt.Dimension(75, 75));
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jButton9.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    jButton9.setName("20-"); // NOI18N
    jButton9.setPreferredSize(new java.awt.Dimension(75, 75));
    jButton9.setSize(new java.awt.Dimension(75, 75));
    jButton9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClick(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
    jLabel1.setText("jLabel1");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(81, 81, 81))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(40, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("") && !this.gameOver) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      String winner = this.isWinner();
      if (!winner.equals("")) {
        jLabel1.setText(winner+" WINS THE GAME!!");
        this.gameOver = true;
      }
      this.whoseTurn = !this.whoseTurn;
    }
  }//GEN-LAST:event_onClick

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
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new View().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JButton jButton9;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}
