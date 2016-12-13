package Game.Level;

import java.util.ArrayList;
import java.util.List;

import Game.Object.GameObject;
import Graphics.Texture;
import Graphics.VertexArray;

public class tLevel implements Level{
	private List<GameObject> objectList;
	private VertexArray m_Background;
	private Texture m_BackgroundT;
	
	public tLevel() {
		objectList = new ArrayList<GameObject>();
		m_Background = new VertexArray(m_BackgroundT.getWidth(), m_BackgroundT.getHeight(), 0.0f, 1.0f, 0.0f, 1.0f);
	}
	
	public void draw() {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.draw();
			}
		}
	}
	
	public void update(double deltaTime) {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.update(deltaTime);
				
			}
		}
	}
	
	public void createObject(GameObject obj) {
		objectList.add(obj);
	}
	
	@Override
	public void keyPressEvent(int key) {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.keyPressEvent(key);
			}
		}
	}

	@Override
	public void keyReleaseEvent(int key) {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.keyReleaseEvent(key);
			}
		}
	}

	@Override
	public void mousePressEvent(int button) {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.mousePressEvent(button);
			}
		}
		
	}

	@Override
	public void mouseReleaseEvent(int button) {
		if(!objectList.isEmpty()) {
			for(GameObject obj : objectList) {
				obj.mouseReleaseEvent(button);
			}
		}
	}
}