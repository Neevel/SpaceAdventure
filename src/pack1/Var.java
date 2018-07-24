package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
	
	static JFrame jf1; 
	static int screenWidth = 800, screenHeight = 600; 
	static int backgroundY1 = -800, backgroundY2 = 0, backgroundspeed = 9; 
	static int x = 20, y = 200; 
	static boolean moveup = false, movedow = false, moveleft = false, moveright= false; 
	static Label lbl1; 
	
	static BufferedImage ib1, ib2; 
	static BufferedImage iHelicos; 
	
	public Var() {
	try {
		//Background 
		ib1 = ImageIO.read(new File("rsc/bg2.jpg") ); 
		ib2 = ImageIO.read(new File("rsc/bg2.jpg") ); 
		
		//Helicos 
		iHelicos = ImageIO.read(new File("rsc/bac.png") );
	}catch(IOException e) {
		e.printStackTrace();
		System.out.println("Bilder gehen nicht ");
	} 
	
	
		 
	}

}
