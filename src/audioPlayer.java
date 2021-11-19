import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class audioPlayer 
{

	public static MediaPlayer playSound(File file){
		
		try
		{
        Media audio = new Media(file.toURI().toURL().toString());
        MediaPlayer player = new MediaPlayer(audio);
        return player;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
    }

}
