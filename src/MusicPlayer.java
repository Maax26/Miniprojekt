import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicPlayer {
	
	JButton play = new JButton("Play");
	JButton stop = new JButton("Stop");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicPlayer().createGUI();
	}

	private void createGUI() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,2,5,5));
		frame.add(play);
		frame.add(stop);
		frame.pack();
		frame.setVisible(true);
	}

}
