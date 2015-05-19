package yaun.game.server;

public class serverInstance {
	public serverInstance(){
		
	}
	public void run(){
		try {
			init();
		} finally {
			loop();
		}
	}
	
	private void init(){
		//prepare for and init the game server
	}
	
	private void loop(){
		//start server loop
	}
}
