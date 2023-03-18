import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
  public void paintComponent (Graphics g) {
    Graphics2D graph2D = (Graphics2D) g;
    int red =  (int) (Math.random() * 255);
    int green = (int) (Math.random() * 255);
    int blue = (int) (Math.random() * 255);
    Color startColor = new Color(red, green, blue);
    
     red =  (int) (Math.random() * 255);
     green = (int) (Math.random() * 255);
     blue = (int) (Math.random() * 255);

     Color endColor = new Color(red, green, blue);
     GradientPaint gradient = new GradientPaint(70, 70, startColor,150,150, endColor);
     graph2D.setPaint(gradient);
     graph2D.fillOval(70,70,100,100);
  }
}
