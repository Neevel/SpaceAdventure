package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	Timer back; 
	
	public Background() {
		back = new Timer(); 
		back.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Var.backgroundx1 > -800) {
					Var.backgroundx1 -= 2; 
					
				}else {
				
					Var.backgroundx1 = 800; 
				}
				
				
				if(Var.backgroundx2 > -800) {
					Var.backgroundx2 -= 2; 
					
				}else {
					
					Var.backgroundx2 = 800; 
				}
				
			}
			
		}, 0, Var.backgroundspeed); 
	}

}
