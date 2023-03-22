import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyGui{
  JFrame frame;
  JButton button =  new JButton(" change color");
  JButton button2 =  new JButton(" onclick me");
  boolean flagText = true;
  public void start() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    button.addActionListener(new ColorAction());
    button2.addActionListener(new TextAction());

    MyPanel drawPanel = new MyPanel();

    frame.getContentPane().add(BorderLayout.SOUTH, button);
    frame.getContentPane().add(BorderLayout.NORTH, button2);
    frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

    frame.setSize(800,800);
    frame.setVisible(true);
  }

  class ColorAction implements ActionListener{
    public void actionPerformed (ActionEvent event) {
      frame.repaint();
    }
  }

  class TextAction implements ActionListener{
    public void actionPerformed(ActionEvent event) {
      button2.setText(flagText?"has changed":"click me");
      flagText = !flagText;
    }
  }

  // public static void main(String[] args) {
  //   MyGui gui = new MyGui();
  //   gui.start();
  // }
}
