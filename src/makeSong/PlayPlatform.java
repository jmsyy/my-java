import javax.sound.midi.*;
import java.util.*;
import java.util.Timer;

import javax.swing.*;
import java.awt.*;
import static java.lang.System.out;

public class PlayPlatform implements ControllerEventListener{
	static MyPanel panel;
	 
   public void play(int aa1, int bb2) {
     try {
      Sequencer player = MidiSystem.getSequencer();
      player.open();
      Sequence seq = new Sequence(Sequence.PPQ, 4) ;
      Track track = seq.createTrack();

      ShortMessage first = new ShortMessage();
      first.setMessage(192, 1, bb2, 100);
      MidiEvent changeInstrument  =  new MidiEvent(first, 1);
      track.add(changeInstrument);

      ShortMessage a = new ShortMessage();
      a.setMessage(144, 1, aa1, 100);
      MidiEvent noteOn = new MidiEvent(a, 1);
      track.add(noteOn);

      ShortMessage b = new ShortMessage();
      b.setMessage(128, 1, aa1, 100);
      MidiEvent noteOff = new MidiEvent(b, 16);
      track.add(noteOff);

      player.setSequence(seq);

      player.start();

      out.println(" get a Sequencer");
     } catch (Exception e) {
      // TODO: handle exception
      out.println(" catch error");
     }
   }

   public void complexPlay () {
			setPanel();
      try {
        Sequencer player = MidiSystem.getSequencer();
        player.open();
				int[] eventListen = {27};
				player.addControllerEventListener(this, eventListen);
        Sequence seq = new Sequence(Sequence.PPQ, 4) ;
        Track track = seq.createTrack();

        for(int i =5; i<61; i+=4) {
          track.add(makeEvent(144,1, i, 100,i));
          track.add(makeEvent(176,1, 27, 100,i));
          track.add(makeEvent(128,1, i, 100,i +2));
        }
        player.setSequence(seq);
        player.setTempoInBPM(220);;
        player.start();
  
        out.println(" get a Sequencer");
  
      } catch (Exception e) {
        // TODO: handle exception
      }
   }

	 public void controlChange(ShortMessage evt) {
		out.println(" some song open");
		panel.autoChange();
	 }

	 public void setPanel () {
		JFrame frame = new JFrame();
		frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel = new MyPanel();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		
		frame.setSize(800,800);
    frame.setVisible(true);
    
	 }

	 public void repeatPlay (PlayPlatform p) {
		Timer timer = new Timer();
		class CD extends TimerTask {
			public void run() {
				p.complexPlay();
			}
		}
		timer.schedule(new CD(), 1000, 3000);
	 }

	class MyPanel extends JPanel implements ControllerEventListener{
		public void autoChange () {
			repaint();
		}

		public void controlChange(ShortMessage evt) {
			out.println("panel change");
			repaint();
		}
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
	
			int width = (int) (Math.random()*120 + 10);
			int height = (int) (Math.random()*120 + 10);
	
			int x = (int) (Math.random()*40 + 10);
			int y = (int) (Math.random()*40 + 10);
	
			// graph2D.fillRect(x, y, width, height);
			graph2D.fillOval(70,70,100,100);
	
		}
	}
   public static void main(String[] args){
    PlayPlatform p1 =  new PlayPlatform();
		p1.complexPlay();
   }


   public MidiEvent makeEvent (int com, int chanel, int one, int two, int tick) {
      MidiEvent event = null;
      try {
        ShortMessage ShortMessage = new ShortMessage();
        ShortMessage.setMessage(com, chanel, one, two);
        event = new MidiEvent(ShortMessage, tick);
				return  event;
      } catch (Exception e) {
        // TODO: handle exception
				return  event;
      }
      
   }
}
