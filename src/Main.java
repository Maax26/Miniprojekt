import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	
	
	
	public static void main(String[] args) {
		new Main();
	}
	

	public Main() {
		try {
	         // Open an audio input stream.
			//Song song = new Song("HiHat", "drum", "HiHat.wav",14);
			File soundFile = new File("HiHat.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	       // clip.open(audioIn);
	        clip.start();
	        clip.stop();
	        
	        clip.close();
	      
	      
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	}
	


}
