package Game;

import static org.lwjgl.glfw.GLFW.*;

public final class GameInfo {
	
	public static void gameInit() {
		GameState.curLevel = new tLevel();
	}

	public static void gameEnd() {
		glfwSetWindowShouldClose(GameState.window, true);
	}
	
}