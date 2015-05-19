package yaun.game.client;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

import yaun.game.util.crashHandler.HandlerClient;

public class Window {

	public static long currentWindow;
	
	
	
	public static void initWindow(){
		
		currentWindow = newWindow(1024, 768, "GLFW window", NULL, NULL);
	}
	
	private static long newWindow(int width, int height, String title, long monitor, long share){
		long windowID = glfwCreateWindow(width, height, title, monitor, share);
		
		if (windowID == NULL)
		{
		    System.err.println("Error creating a window");
		    HandlerClient.catchCTD("GLFW_DISPLAYINIT_WINDOWERROR");
		}
		
		glfwWindowHint(GLFW_SAMPLES, 4);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
		glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
		glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		glfwWindowHint(GLFW_RESIZABLE, GL_FALSE);
		return windowID;
	}
}
