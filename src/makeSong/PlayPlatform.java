package src.makeSong;
import javax.sound.midi.*;
import java.util.*;
import static java.lang.System.out;

public class PlayPlatform {
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

   public static void main(String[] args){
    PlayPlatform p1 =  new PlayPlatform();
    if(args.length < 2) {
      out.println(" you need set instrument and channel");
    }else {
      int aa1 =  Integer.parseInt(args[0]);
      int bb2 =  Integer.parseInt(args[1]);
      Timer timer = new Timer();
      class CD extends TimerTask {
        public void run() {
          p1.play(aa1, bb2);
        }
      }
      timer.schedule(new CD(), 1000, 3000);
    }
    
   }
}
