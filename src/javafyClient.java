import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;


public class javafyClient extends Application implements Runnable
{
	static File currentSong = new File("");
//	public static void play(){
//		//Resumes the current song
//	}
//	
//	public static void play(Song song){
//		//Skips the queue and current song and plays the song specified. Must be formatted as /play.
//	}
//	
//	 public static void pause(){
//		 //Stops the current song. Must be formatted as /pause
//	}
//	 
//	 
//	 public static void queue(Song song, List playlist){
//		 //Puts the specified media in queue behind whatever else is first in the queue
//	}
//	 
//	 public static void priorityQueue (Song song, List playlist){
//	 	//Puts the specified media before anything else in the queue
//	}
//
//	 public static void clear (){
//		 //Clears the entire queue with the exception of the song currently playing
//	}
//	 
//	 public static void skip(String timestamp) {
//		 //Skips to the specified timestamp of current song
//		 //[Produces error if time specified is longer than song]
//	}
//	 
//	 public static void next() {
//		 //Skips to the next song in queue
//	}
//	 
//	 public static void back() {
//		 //Plays the last song played
//	}
//	 
//	 public static void restart() {
//		 //Starts the current song from the beginning
//	}
//	 
//	 public static void returnSong() {//most likely type will change to song instead of void.
//		 //Shows the previous display [returns error if display is at start]
//	}
//	 
//	 public static void select(List playlist){
//	 //Shows the contents of the specified playlist or album
//	}
//	 
//	 public static void show(){
//		 //Shows the queue
//	}

	public static void main(String[] args) 
	{
		javafyClient obj = new javafyClient();
	    Thread thread = new Thread(obj);
	    currentSong = new File("Music/mmad.wav");
	    thread.start();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		try
		{
	        MediaPlayer player = audioPlayer.playSound(currentSong);
	        // Add a mediaView, to display the media. Its necessary !
	        // This mediaView is added to a Pane
	        MediaView mediaView = new MediaView(player);
	
	        // Add to scene
	        Group root = new Group(mediaView);
	        Scene scene = new Scene(root, 5, 5);
	
	        // Show the stage
	        primaryStage.setTitle("Media Player");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	
	        // Play the media once the stage is shown
	        player.play();
	        Status status = player.getStatus();
	        while(status == status.PLAYING)
	        {
	        	if(player.getCurrentTime().greaterThanOrEqualTo(player.getTotalDuration()))
		        {
		        	player.stop();
		        	primaryStage.close();
		        }
	        }
	        
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void run() 
	{
		while(true)
		{
			launch();
		}
		
	}
	 
	
}
