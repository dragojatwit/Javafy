
public class javafyClient {
	
	public static void play(){
		//Resumes the current song
	}
	
	public static void play(Song song){
		//Skips the queue and current song and plays the song specified. Must be formatted as /play.
	}
	
	 public static void pause(){
		 //Stops the current song. Must be formatted as /pause
	}
	 
	 
	 public static void queue(Song song, List playlist){
		 //Puts the specified media in queue behind whatever else is first in the queue
	}
	 
	 public static void priorityQueue (Song song, List playlist){
	 	//Puts the specified media before anything else in the queue
	}

	 public static void clear (){
		 //Clears the entire queue with the exception of the song currently playing
	}
	 
	 public static void skip(String timestamp) {
		 //Skips to the specified timestamp of current song
		 //[Produces error if time specified is longer than song]
	}
	 
	 public static void next() {
		 //Skips to the next song in queue
	}
	 
	 public static void back() {
		 //Plays the last song played
	}
	 
	 public static void restart() {
		 //Starts the current song from the beginning
	}
	 
	 public static void returnSong() {//most likely type will change to song instead of void.
		 //Shows the previous display [returns error if display is at start]
	}
	 
	 public static void select(List playlist){
	 //Shows the contents of the specified playlist or album
	}
	 
	 public static void show(){
		 //Shows the queue
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		System.out.println("aa");
		//Test
		
		System.out.println("Hello World!");
	}

}
