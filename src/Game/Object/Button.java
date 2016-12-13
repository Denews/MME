package Game.Object;

import Game.GameObject;
import Graphics.Texture;
import Graphics.VertexArray;
import Maths.Matrix4f;

public class Button implements GameObject{
	private Texture m_Texture;
	private VertexArray m_Vao;
	private Matrix4f m_MVMatrix;
	private float m_PosX;
	private float m_PosY;
	
	public void Button() {
		m_Texture = new Texture("");
		m_Vao = new VertexArray(m_Texture.getWidth(), m_Texture.getHeight(), 0, 1, 0, 1);
		m_MVMatrix = Matrix4f.translate(m_PosX, m_PosY, 0);
	}

	@Override
	public void draw() {
		m_Texture.bind();
		m_Vao.draw(m_MVMatrix);
		
	}

	@Override
	public void update(double deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressEvent(int key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleaseEvent(int key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressEvent(int button) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleaseEvent(int button) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCollision(float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

}
