import java.util.*;
 public class javafyClient {
	
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
		Scanner sc = new Scanner(System.in);
		int topLevel = 0;
		String playlistCommand;
		System.out.println("Welcome to Javafy!");
		System.out.println("input the number of which menu you'd prefer to open:");
		
		while (topLevel == 0){
			System.out.println("[1]Playlists:		[2]Albums:							[3]Songs:");
			topLevel = sc.nextInt();
		}
		  
		if (topLevel == 1) {
			System.out.println("[1]playlist 1");
			System.out.println("[2]playlist 2");
			System.out.println("");
			System.out.println("To view the contents of the playlist you want to view enter the playlist #/Select");
			System.out.println("To view the list of commands for interacting with the playlist type \"/help\"");
			playlistCommand = sc.nextLine();
			if (playlistCommand.equals ("/help")) {
				help();
			}
			if (playlistCommand.equals ("/help")) {
				help();
			}
		}
		if (topLevel == 2) {
			System.out.println("[1]Summer Pack - Childish Gambino");
			System.out.println("[2]");
		}
		if (topLevel == 3) {
			System.out.println("[1]Feels like summer - Childish Gambino");
			System.out.println("[2]Summertime magic - Childish Gambino");
			System.out.println("[3]Once in a Lifetime - Talking Heads");
		}
		

	}

	public static void help(){
		System.out.println("\"/help\"");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
