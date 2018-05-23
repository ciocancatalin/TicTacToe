package TTT;

import java.util.Timer;
import java.util.TimerTask;

public class WCheck {
	Timer time;

	public WCheck() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if (Gui.winner == 0) {
					
					for(int w = 1; w <= 2; w++) {
						if (Gui.state[0] == w && Gui.state[1] == w && Gui.state[2] == w) {
							Gui.winner = w;
						}
						else if (Gui.state[3] == w && Gui.state[4] == w && Gui.state[5] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[6] == w && Gui.state[7] == w && Gui.state[8] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[0] == w && Gui.state[3] == w && Gui.state[6] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[1] == w && Gui.state[4] == w && Gui.state[7] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[2] == w && Gui.state[5] == w && Gui.state[8] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[0] == w && Gui.state[4] == w && Gui.state[8] == w) {
							Gui.winner = w;
						}

						else if (Gui.state[2] == w && Gui.state[4] == w && Gui.state[6] == w) {
							Gui.winner = w;
						}

					}		
				}
			}
		}, 0, 150);
	}

}
