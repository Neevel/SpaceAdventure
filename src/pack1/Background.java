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
				
				if(Var.backgroundY1 < 796) {
					Var.backgroundY1 += 2; 
				}else {
					Var.backgroundY1 = -800; 
				}
				
				
				if(Var.backgroundY2 < 796) {
					Var.backgroundY2 += 2; 
				}else {
					Var.backgroundY2 = -800; 
				}
				
			}
			
		}, 0, Var.backgroundspeed); 
	}

}
