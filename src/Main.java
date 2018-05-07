import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {
	
	
	
	public static void main(String[] args) {
		try {
	         // Open an audio input stream.
			File soundFile = new File("Hippy.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(soundFile));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
	      
	      
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
