/*
 * Copyright 2017 Roger Jaffe
 * All rights reserved
 */
package tictactoe;

/**
 *
 * @author Roger Jaffe
 */
public class TicTacToe {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    TicTacToe ttt = new TicTacToe();
  }
  
  public TicTacToe() {
    View view = new View();
    view.setVisible(true);
  }
  
}
