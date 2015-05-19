package yaun;

import yaun.game.client.clientInstance;
import yaun.game.server.serverInstance;

public class Main {
	
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args[0].equals("server")){
				System.out.println("Starting Server!");
				serverInstance server = new serverInstance();
			}
		}
		
		System.out.println("Starting Client!");
		clientInstance client = new clientInstance();
		
	}

}
