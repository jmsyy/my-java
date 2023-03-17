package src.makeSong;
import javax.swing.*;
import java.awt.event.*;

public class MyGui implements ActionListener{
  JButton button;
  public void start() {
    JFrame frame = new JFrame();
    button =  new JButton(" click me ");

    button.addActionListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(button);

    frame.setSize(300, 300);

    frame.setVisible(true);
  }

  public void actionPerformed (ActionEvent event ) {
    button.setText(" haved change ");
  }
  public static void main(String[] args) {
    MyGui gui = new MyGui();
    gui.start();
  }
}
