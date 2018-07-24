package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
	
	static JFrame jf1; 
	static int screenWidth = 800, screenHeight = 600; 
	static int backgroundx1 = 0, backgroundx2 = -800, backgroundspeed = 9; 
	static int x = 20, y = 200; 
	static int speedup = 5, speeddown = 5, speedleft = 5, speedright = 5; 
	
	
	
	static boolean moveup = false, movedown = false, moveleft = false, moveright= false; 
	static Label lbl1; 
	
	static BufferedImage ib1, ib2; 
	static BufferedImage iHelicos; 
	static BufferedImage Helico; 
	
	public Var() {
	try {
		//Background 
		ib1 = ImageIO.read(new File("rsc/bg2.png") ); 
		ib2 = ImageIO.read(new File("rsc/bg2.png") ); 
		Helico = ImageIO.read(new File("rsc/bac.gif") ); 
		
		//Helicos 
		iHelicos = ImageIO.read(new File("rsc/bac.gif") );
	}catch(IOException e) {
		e.printStackTrace();
		System.out.println("Bilder gehen nicht ");
	} 
	
	
		 
	}

}
