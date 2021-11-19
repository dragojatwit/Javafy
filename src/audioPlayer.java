import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class audioPlayer 
{
	private String filepath;
	private AudioInputStream audioStream;
	private Clip clip;
	
	public audioPlayer(String filepath) 
	throws UnsupportedAudioFileException,
	IOException, LineUnavailableException
	{
		audioStream = AudioSystem.getAudioInputStream(new File(filepath));
		clip = AudioSystem.getClip();
		clip.open(audioStream);
	}
	
	public Clip getClip()
	{
		return clip;
	}
	public void play()
	{
		clip.start();
		System.out.println("playing");
	}
	
}
