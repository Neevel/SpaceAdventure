package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = true;
			System.out.println("up");
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedow = true; 
			System.out.println("down");
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = true; 
			System.out.println("left");
			
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = true; 
			System.out.println("right");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = false; 
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedow = false; 
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = false; 
			
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = false; 
			
		}
		
	}

}