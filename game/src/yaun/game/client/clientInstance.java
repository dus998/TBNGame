package yaun.game.client;

public class clientInstance {
	public clientInstance(){
		
	}
	
	public void run(){
		try {
			init();
		} finally {
			loop();
		}
	}
	
	private void init(){
		// prepare for server init on separate thread yaun.game.server.Main
		
		
		//init client on separate thread yaun.game.client.Main
		
		
		//init crash handler yaun.game.util.crashHandler.CrashDaemon
		
		
	}
	
	private void loop(){
		//start client loop, which in turn will begin the server
		
	}
}
