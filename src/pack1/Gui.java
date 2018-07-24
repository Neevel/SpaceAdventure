package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	public Gui() {
		
		Var.jf1 = new JFrame(); 
		Icon icon = new ImageIcon("src/bac.gif"); // gif animation
		// klappen super mit
		// dem code und sie
		// werden in frame2
		// perfekt
		// abgespielt
try {
Var.jf1.setContentPane(new JLabel(icon));
} catch (Exception e1) {
	System.out.println("funzt net ");
}
		Var.jf1.setSize(Var.screenWidth, Var.screenHeight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("Space Adventure");
		Var.jf1.setResizable(false );
		Var.jf1.requestFocus();
		Var.jf1.addKeyListener(new KeyHandler());

		
		
		
		Var.lbl1 = new Label(); 
		Var.lbl1.setBounds(0,0, Var.screenWidth, Var.screenHeight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1); 



Var.jf1.setVisible(true);
		
	}

}
