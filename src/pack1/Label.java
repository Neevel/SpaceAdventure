package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
private static final long serialVersioUID = 1L; 
	
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	
	Graphics2D g2d = (Graphics2D) g; 
	
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
	g.drawImage(Var.ib1, Var.backgroundx1, 0,805, 600, null);
	g.drawImage(Var.ib2, Var.backgroundx2, 0,805, 600, null);
	g.drawImage(Var.iHelicos, Var.x, Var.y, 100, 250, null );
	g.drawImage(Var.Helico, 200, 200, 200, 400, null);
	repaint();
	
}

}